package www.dagger.com.http;

import io.reactivex.Flowable;
import retrofit2.http.GET;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface HttpUri {

    @GET("ping")
    Flowable<String> getPong();
}
