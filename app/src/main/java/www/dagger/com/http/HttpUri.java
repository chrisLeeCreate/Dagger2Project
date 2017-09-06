package www.dagger.com.http;

import io.reactivex.Flowable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface HttpUri {

    @GET("ping")
    Flowable<String> getPing();

    @FormUrlEncoded
    @POST("ping")
    Flowable<String> getPong(@Field("token") String s);
}


