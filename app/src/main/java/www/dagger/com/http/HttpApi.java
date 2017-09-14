package www.dagger.com.http;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Call;
import www.dagger.com.model.BaseResponse;
import www.dagger.com.model.OrderWaitResult;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface HttpApi {

    Flowable<String> getPing();

    Flowable<String> getPong(String s);

    Call<String> getDong();

    Flowable<BaseResponse<List<OrderWaitResult>>> getWaitOrder(int currentPage, String token);

    Call<String> getFinishOrRefundOrder(int current, String token);

}
