package www.dagger.com.di.moudle;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import www.dagger.com.http.HttpUri;
import www.dagger.com.utils.StringConverterFactory;

/**
 * Created by lishaowei on 2017/9/6.
 */

@Module
public class HttpModule {

    @Provides
    public HttpUri getHttpUri(Retrofit retrofit) {
        return retrofit.create(HttpUri.class);
    }

    @Provides
    Retrofit getRetrofit(OkHttpClient pingClient, Retrofit.Builder pingInstance) {
        return pingInstance
                .baseUrl("https://beta-vcenter.talbrain.com")
                .client(pingClient)
                .addConverterFactory(new StringConverterFactory())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    Retrofit.Builder provideRetrofitBuilder() {
        return new Retrofit.Builder();
    }

    @Provides
    OkHttpClient getOkHttpClient(OkHttpClient.Builder builder) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return builder
                .addInterceptor(interceptor)
                .build();

    }

    @Provides
    OkHttpClient.Builder getOkhttpBuilder() {
        return new OkHttpClient.Builder();
    }
}
