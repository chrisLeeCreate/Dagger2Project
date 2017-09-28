package www.dagger.com.ui.activity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import www.dagger.com.R;
import www.dagger.com.base.BaseActivity;
import www.dagger.com.http.HttpUri;
import www.dagger.com.ui.contract.MainContract;
import www.dagger.com.ui.presenter.MainPresenter;
import www.dagger.com.utils.DownLoadManager;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private TextView viewById;
    private long max;
    private long nowDownLoadSize;
    private TextView down;

    @Override
    protected int setView() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUpComponent() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initView() {
        Log.d("L", "initview");
        viewById = (TextView) findViewById(R.id.hello);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Retrofit build = new Retrofit.Builder().client(new OkHttpClient.Builder().build())
                        .baseUrl("https://d11.baidupcs.com")
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build();

                HttpUri httpUri = build.create(HttpUri.class);
                Observable<ResponseBody> responseBodyObservable = httpUri.downloadFile("/file/6331b6005494a0d5261d0aaf5902c0a6?bkt=p3-14006331b6005494a0d5261d0aaf5902c0a67345f558000000a10394&xcode=9f09a821edbc232d0ee043b6ec1ab4a6d2ee3ca2d3f32bb80b2977702d3e6764&fid=2483207920-250528-318501206940062&time=1506588706&sign=FDTAXGERLQBHSK-DCb740ccc5511e5e8fedcff06b081203-u1Lm2WMIqHVcFjjlOSwhyTVLze0%3D&to=d11&size=10552212&sta_dx=10552212&sta_cs=56014&sta_ft=pdf&sta_ct=7&sta_mt=7&fm2=MH,Yangquan,Netizen-anywhere,,beijing,other&newver=1&newfm=1&secfm=1&flow_ver=3&pkey=14006331b6005494a0d5261d0aaf5902c0a67345f558000000a10394&sl=79298638&expires=8h&rt=sh&r=971528732&mlogid=6278358069156967026&vuk=2811495539&vbdid=2929567754&fin=Android%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B.pdf&fn=Android%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B.pdf&rtype=1&iv=0&dp-logid=6278358069156967026&dp-callid=0.1.1&hps=1&tsl=101&csl=101&csign=NDUiV0mjmmg5CmYFWLwnGjdFaYs%3D&so=0&ut=6&uter=4&serv=0&uc=1629223180&ic=2822835012&ti=90d2e497e2a11749da310d57908542667a7c2c9ceceaff63&by=themis");
                responseBodyObservable
                        .subscribeOn(Schedulers.newThread())
                        .subscribeWith(new DisposableObserver<ResponseBody>() {
                            @Override
                            public void onNext(ResponseBody responseBody) {
                                DownLoadManager downLoadManager = new DownLoadManager();
                                downLoadManager.setOnDownLoadNodeChangedListener(new DownLoadManager.OnDownLoadNodeChangedListener() {
                                    @Override
                                    public void DownLoadNodeChaned(long nodeSize, long max) {
                                        changeView(nodeSize, max);
                                    }
                                });
                                if (downLoadManager.writeResponseBodyToDisk(MainActivity.this, responseBody)) {
                                    Toast.makeText(MainActivity.this, "Download is sucess", Toast.LENGTH_LONG).show();
                                }


                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        });


            }
        });
        View viewById = findViewById(R.id.word);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Retrofit build = new Retrofit.Builder().client(new OkHttpClient.Builder().build())
                        .baseUrl("https://wkbos.bdimg.com/v1")
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .build();

                HttpUri httpUri = build.create(HttpUri.class);
                Observable<ResponseBody> responseBodyObservable = httpUri.downloadFile("/wenku84//6717303bfb90ae9959f653f88236fd22?responseContentDisposition=attachment%3B%20filename%3D%22%E6%AF%95%E4%B8%9A%E8%AE%BA%E6%96%87%E8%8C%83%E6%96%87.doc%22&responseContentType=application%2Foctet-stream&responseCacheControl=no-cache&authorization=bce-auth-v1%2Ffa1126e91489401fa7cc85045ce7179e%2F2017-09-28T08%3A24%3A14Z%2F3600%2Fhost%2F3ba52b26d6159ae0a91b57df0a521aa211a7b4b6bd0fd8a0d584a19ff5a50825&token=a17a1598c15a64ab8b3b7a5e3a22e3178cd0273302ea413ca63b3eba7617be16&expire=2017-09-28T09:24:14Z");
                responseBodyObservable
                        .subscribeOn(Schedulers.newThread())
                        .subscribeWith(new DisposableObserver<ResponseBody>() {
                            @Override
                            public void onNext(ResponseBody responseBody) {
                                if (DownLoadManager.writeResponseBodyToDisk(MainActivity.this, responseBody)) {
                                    Toast.makeText(MainActivity.this, "Download is sucess", Toast.LENGTH_LONG).show();
                                }
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onComplete() {

                            }
                        });
            }
        });
        down = (TextView) findViewById(R.id.down);
    }

    private void changeView(long nodeSize, long max) {
        final int p = (int) (nodeSize / max) * 100;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                down.setText(p + "");
            }
        });
    }

//    @Override
//    protected void setupComponent(AppConponent appComponent) {
//        DaggerMainConpenent
//                .builder()
//                .appConponent(appComponent)
//                .mainMoudle(new ActivityModule(this))
//                .build()
//                .inject(this);
//    }

    @Override
    public void getViewSucc() {
        viewById.setText("lishaowei");
        Log.d("L", "getViewSucc");
    }
}
