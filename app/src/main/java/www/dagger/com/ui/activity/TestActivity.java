package www.dagger.com.ui.activity;

import android.util.Log;

import www.dagger.com.R;
import www.dagger.com.base.BaseActivity;
import www.dagger.com.ui.contract.TestContract;
import www.dagger.com.ui.presenter.TestPresenter;

/**
 * Created by lishaowei on 2017/9/6.
 */

public class TestActivity extends BaseActivity<TestPresenter> implements TestContract.View {


    @Override
    protected int setView() {
        return R.layout.activity_main2;
    }

    @Override
    protected void setUpComponent() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initView() {
        Log.d("L", "initview");
        mPresenter.getPresenter();
    }

    @Override
    public void getViewSucc() {
        Log.d("L", "getViewSucc");
    }
}
