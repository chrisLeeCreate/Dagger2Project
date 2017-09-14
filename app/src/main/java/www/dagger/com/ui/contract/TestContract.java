package www.dagger.com.ui.contract;

import www.dagger.com.base.BasePresenter;
import www.dagger.com.base.BaseView;

/**
 * Created by lishaowei on 2017/9/5.
 */

public interface TestContract {
    interface View extends BaseView {
        void getViewSucc();
    }

    interface Presenter extends BasePresenter<TestContract.View> {
        void getPresenter(String token);
    }
}
