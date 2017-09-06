package www.dagger.com.http;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * Created by lishaowei on 2017/9/6.
 */

public class RetrofitHttp implements HttpApi {

    private HttpUri httpUri;

    @Inject
    public RetrofitHttp(HttpUri httpUri) {
        this.httpUri = httpUri;
    }

    @Override
    public Flowable<String> getPing() {
        return httpUri.getPing();
    }

    @Override
    public Flowable<String> getPong(String s) {
        return httpUri.getPong(s);
    }
}
