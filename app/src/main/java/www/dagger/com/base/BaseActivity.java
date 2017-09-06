package www.dagger.com.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import www.dagger.com.AppApplication;
import www.dagger.com.di.conpenent.ActivityConpenent;
import www.dagger.com.di.conpenent.DaggerActivityConpenent;
import www.dagger.com.di.moudle.ActivityModule;

/**
 * Created by lishaowei on 2017/9/6.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    @Inject
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(this.setView());
        setUpComponent();
        onViewCreated();
        initView();

    }

    protected abstract int setView();

    protected abstract void setUpComponent();

    protected abstract void initView();


    protected ActivityConpenent getActivityComponent() {
        return DaggerActivityConpenent.builder()
                .appConponent(AppApplication.getComponent())
                .activityModule(getActivityMudule())
                .build();
    }

    public ActivityModule getActivityMudule() {
        return new ActivityModule(this);
    }

    protected void onViewCreated() {
        if (mPresenter != null)
            mPresenter.attachView(this);
    }


    @Override
    protected void onDestroy() {
        if (mPresenter != null)
            mPresenter.detachView();
        super.onDestroy();
    }
}
