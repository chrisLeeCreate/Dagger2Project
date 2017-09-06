package www.dagger.com.http;

import io.reactivex.Flowable;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface HttpApi {

    Flowable<String> getPing();

    Flowable<String> getPong(String s);

}
