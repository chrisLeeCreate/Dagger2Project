package www.dagger.com.utils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

/**
 * Created by lishaowei on 2017/9/7.
 */

public class GsonU {
    public GsonU() {
    }

    public static String string(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }


    public static <T> T convert(String str, Class<T> cls) throws JsonSyntaxException {
        Gson gson = new Gson();
        return gson.fromJson(str, cls);
    }

    public static <T> T convert(String str, Type type) throws JsonSyntaxException {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }
}
