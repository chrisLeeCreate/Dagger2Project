package www.dagger.com.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import www.dagger.com.R;
import www.dagger.com.base.BaseActivity;
import www.dagger.com.ui.contract.MainContract;
import www.dagger.com.ui.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private TextView viewById;

    @Override
    protected int setView() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUpComponent() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initView() {
        Log.d("L", "initview");
        viewById = (TextView) findViewById(R.id.hello);
        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inject = new Intent(getApplication(), TestActivity.class);
                startActivity(inject);
            }
        });
        mPresenter.getPresenter();
    }

//    @Override
//    protected void setupComponent(AppConponent appComponent) {
//        DaggerMainConpenent
//                .builder()
//                .appConponent(appComponent)
//                .mainMoudle(new ActivityModule(this))
//                .build()
//                .inject(this);
//    }

    @Override
    public void getViewSucc() {
        viewById.setText("lishaowei");
        Log.d("L", "getViewSucc");
    }
}
