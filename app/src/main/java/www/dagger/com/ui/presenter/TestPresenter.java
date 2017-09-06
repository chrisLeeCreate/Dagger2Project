package www.dagger.com.ui.presenter;

import android.util.Log;

import javax.inject.Inject;

import www.dagger.com.base.RxPresenter;
import www.dagger.com.http.HttpApi;
import www.dagger.com.ui.contract.TestContract;

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
    public void getPresenter() {
        Log.d("L", "getPresenter");
//        Flowable<String> pong = httpApi.getPong();
//        pong.subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribeWith(new DisposableSubscriber<String>() {
//                    @Override
//                    public void onNext(String string) {
//                        System.out.println(string);
//                        mView.getViewSucc();
//                        Log.d("L", "onNext");
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//                        Log.d("L", "onError" + t.toString());
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        Log.d("L", "onComplete");
//                    }
//                });

        mView.getViewSucc();

    }
}
