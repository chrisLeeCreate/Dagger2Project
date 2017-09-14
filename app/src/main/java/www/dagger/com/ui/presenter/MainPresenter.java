package www.dagger.com.ui.presenter;

import android.util.Log;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;
import www.dagger.com.base.RxPresenter;
import www.dagger.com.http.HttpApi;
import www.dagger.com.ui.contract.MainContract;

/**
 * Created by lishaowei on 2017/9/5.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {


    private HttpApi httpApi;

    @Inject
    public MainPresenter(HttpApi httpApi) {
        this.httpApi = httpApi;
    }


    @Override
    public void getPresenter() {
        Log.d("L", "getPresenter");
        addSubscribe(httpApi.getPing()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<String>() {
                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                        mView.getViewSucc();
                        Log.d("L", "onNext");
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.d("L", "onError" + t.toString());
                    }

                    @Override
                    public void onComplete() {
                        Log.d("L", "onComplete");
                    }
                }));
    }
}
