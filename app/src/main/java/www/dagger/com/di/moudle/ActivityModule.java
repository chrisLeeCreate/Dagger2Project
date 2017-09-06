package www.dagger.com.di.moudle;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lishaowei on 2017/9/5.
 */

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public Activity getActivity() {
        return activity;
    }
}
