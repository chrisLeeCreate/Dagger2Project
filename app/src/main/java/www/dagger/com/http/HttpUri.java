package www.dagger.com.http;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import www.dagger.com.model.BaseResponse;
import www.dagger.com.model.OrderWaitResult;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface HttpUri {

    @GET("ping")
    Flowable<String> getPing();

    @FormUrlEncoded
    @POST("ping")
    Flowable<String> getPong(@Field("token") String s);

    @GET("ping")
    Call<String> getDong();

    @FormUrlEncoded
    @POST("/v1/py/wait/list")
    Flowable<BaseResponse<List<OrderWaitResult>>> getWaitOrder(@Field("page") String page, @Field("token") String token);


    //    @FormUrlEncoded
//    @POST("/v1/order/finishorder")
//    Flowable<BaseResponse<List<ZKOrderResult>>> getFinishOrRefundOrder(@Field("page") String page, @Field("token") String token);


    @FormUrlEncoded
    @POST("/v1/order/finishorder")
    Call<String> getFinishOrRefundOrder(@Field("page") String page, @Field("token") String token);

}


