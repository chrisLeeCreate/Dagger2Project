package www.dagger.com.di.moudle;

import dagger.Module;
import dagger.Provides;
import www.dagger.com.http.HttpApi;
import www.dagger.com.http.RetrofitHttp;

/**
 * Created by lishaowei on 2017/9/6.
 */

@Module
public class AppModule {
    @Provides
    HttpApi provideHttpHelper(RetrofitHttp retrofitHelper) {
        return retrofitHelper;
    }

}
