package www.dagger.com.di.conpenent;

import android.app.Activity;

import dagger.Component;
import www.dagger.com.di.moudle.ActivityModule;
import www.dagger.com.ui.activity.MainActivity;
import www.dagger.com.ui.activity.TestActivity;

/**
 * Created by lishaowei on 2017/9/5.
 */

@Component(dependencies = AppConponent.class, modules = {ActivityModule.class})
public interface ActivityConpenent {

    Activity getActivity();

    void inject(MainActivity activity);

    void inject(TestActivity activity);
}
