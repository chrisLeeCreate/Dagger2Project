package www.dagger.com.ui.presenter;

import android.util.Log;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import www.dagger.com.base.RxPresenter;
import www.dagger.com.http.HttpApi;
import www.dagger.com.model.ZKOrderResult;
import www.dagger.com.ui.contract.TestContract;
import www.dagger.com.utils.GsonU;

/**
 * Created by lishaowei on 2017/9/5.
 */

public class TestPresenter extends RxPresenter<TestContract.View> implements TestContract.Presenter {


    private HttpApi httpApi;

    @Inject
    public TestPresenter(HttpApi httpApi) {
        this.httpApi = httpApi;
    }


    @Override
    public void getPresenter(String token) {
//        addSubscribe(httpApi.getFinishOrRefundOrder(1, token)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(new ResourceSubscriber<BaseResponse<List<ZKOrderResult>>>() {
//                    @Override
//                    public void onNext(BaseResponse<List<ZKOrderResult>> listBaseResponse) {
//                        if (listBaseResponse.getStatus() == 0) {
//                            List<ZKOrderResult> data = listBaseResponse.getData();
//                            mView.getViewSucc();
//                            Log.d("lsw", data.toString());
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//                        Log.d("lsw", t.toString());
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                }));
        Call<String> finishOrRefundOrder = httpApi.getFinishOrRefundOrder(1, token);
        finishOrRefundOrder.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d("lsw", response.body().toString());
                ZKOrderResult convert = GsonU.convert(response.body(), ZKOrderResult.class);
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

    }
}
