package www.dagger.com.base;

/**
 * Created by lishaowei on 2017/9/6.
 */

public interface BasePresenter<T extends BaseView> {
   void attachView(T view);

   void detachView();
}
