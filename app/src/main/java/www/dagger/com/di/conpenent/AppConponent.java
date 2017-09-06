package www.dagger.com.di.conpenent;

import dagger.Component;
import www.dagger.com.di.moudle.AppModule;
import www.dagger.com.di.moudle.HttpModule;
import www.dagger.com.http.HttpApi;

/**
 * Created by lishaowei on 2017/9/6.
 */

@Component(modules = {HttpModule.class, AppModule.class})
public interface AppConponent {
    HttpApi retrofitHelper();  //提供http的帮助类
}
