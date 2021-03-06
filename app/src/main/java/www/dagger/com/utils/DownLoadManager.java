package www.dagger.com.utils;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.ResponseBody;

/**
 * Created by lishaowei on 2017/9/28.
 */

public class DownLoadManager {
    private static final String TAG = "DownLoadManager";

    private static String APK_CONTENTTYPE = "application/vnd.android.package-archive";

    private static String PNG_CONTENTTYPE = "image/png";

    private static String JPG_CONTENTTYPE = "image/jpg";

    private static String APPLICATION_PDF = "application/pdf";

    private static String APPLICATION_WORD = "application/msword";

    private static String fileSuffix = "";
    private static OnDownLoadNodeChangedListener onDownLoadNodeChangedListener;

    public static boolean writeResponseBodyToDisk(Context context, ResponseBody body) {

        Log.d(TAG, "contentType:>>>>" + body.contentType().toString());

        String type = body.contentType().toString();

        if (type.equals(APK_CONTENTTYPE)) {

            fileSuffix = ".apk";
        } else if (type.equals(PNG_CONTENTTYPE)) {
            fileSuffix = ".png";
        } else if (type.equals(APPLICATION_PDF)) {
            fileSuffix = ".pdf";
        } else if (type.equals(APPLICATION_WORD)) {
            fileSuffix = ".doc";
        }

        // 其他类型同上 自己判断加入.....


        String path = context.getExternalFilesDir(null) + File.separator + System.currentTimeMillis() + fileSuffix;

        Log.d(TAG, "path:>>>>" + path);

        try {
            // todo change the file location/name according to your needs
            File futureStudioIconFile = new File(path);

            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                byte[] fileReader = new byte[4096];

                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(futureStudioIconFile);

                while (true) {
                    int read = inputStream.read(fileReader);

                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);

                    fileSizeDownloaded += read;

                    Log.d(TAG, "file download: " + fileSizeDownloaded + " of " + fileSize);
                    if (onDownLoadNodeChangedListener != null) {
                        onDownLoadNodeChangedListener.DownLoadNodeChaned(fileSizeDownloaded, fileSize);
                    }
                }

                outputStream.flush();


                return true;
            } catch (IOException e) {
                return false;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            return false;
        }
    }

    public interface OnDownLoadNodeChangedListener {
        void DownLoadNodeChaned(long nodeSize, long max);
    }

    public void setOnDownLoadNodeChangedListener(OnDownLoadNodeChangedListener onDownLoadNodeChangedListener) {
        this.onDownLoadNodeChangedListener = onDownLoadNodeChangedListener;
    }
}
