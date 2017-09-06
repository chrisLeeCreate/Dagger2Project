package www.dagger.com;

import android.app.Application;

import www.dagger.com.di.conpenent.AppConponent;
import www.dagger.com.di.conpenent.DaggerAppConponent;
import www.dagger.com.di.moudle.AppModule;
import www.dagger.com.di.moudle.HttpModule;

/**
 * Created by lishaowei on 2017/9/6.
 */

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static AppConponent getComponent() {
        return DaggerAppConponent.builder()
                .appModule(new AppModule())
                .httpModule(new HttpModule())
                .build();
    }
}
