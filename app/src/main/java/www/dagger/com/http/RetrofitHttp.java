package www.dagger.com.http;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import retrofit2.Call;
import www.dagger.com.model.BaseResponse;
import www.dagger.com.model.OrderWaitResult;

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

    @Override
    public Call<String> getDong() {
        return httpUri.getDong();
    }

    @Override
    public Flowable<BaseResponse<List<OrderWaitResult>>> getWaitOrder(int currentPage, String token) {
        return httpUri.getWaitOrder(String.valueOf(currentPage), token);
    }

    @Override
    public Call<String> getFinishOrRefundOrder(int current, String token) {
        return httpUri.getFinishOrRefundOrder(String.valueOf(current), token);
    }
}
