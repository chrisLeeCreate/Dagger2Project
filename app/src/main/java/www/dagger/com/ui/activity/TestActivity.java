package www.dagger.com.ui.activity;

import android.util.Log;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import www.dagger.com.R;
import www.dagger.com.base.BaseActivity;
import www.dagger.com.ui.contract.TestContract;
import www.dagger.com.ui.presenter.TestPresenter;

/**
 * Created by lishaowei on 2017/9/6.
 */

public class TestActivity extends BaseActivity<TestPresenter> implements TestContract.View {


    private Disposable disposable;
    private CompositeDisposable compositeDisposable;

    @Override
    protected int setView() {
        return R.layout.activity_main2;
    }

    @Override
    protected void setUpComponent() {
        getActivityComponent().inject(this);
    }

    @Override
    protected void initView() {
//        Log.d("L", "initview");
//        mPresenter.getPresenter("VC+EiLh+AND9DlQ1H5wfGDldteW+aWm3OAuCPNtjiq4waYKc2cMnYOUiFF9DtfDxeDXG7f5jlivoNfSe2SuUOTNluom77w1bC43so/2mY2DFk5Nafi75DfPT0StzSjeYj3XKwzzB3D2n+v1zE4BrJ2VM1dDy7bHHlrQh7nKfoVw=");

//        rxjava1();
//        rxjava2();
//        rxjava3();
//        rxjava4();
//        rxjava5();
//        rxjava6();
//        rxjava7();
//        rxjava8();
        rxjava9();
    }

    private void rxjava9() {
        Observable.just(1, 2, 3, 4, 5, 4, 3, 2, 1)
                .distinct()
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        Log.d("lsw", integer + "");
                    }
                });
    }

    private void rxjava8() {

        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);
                e.onNext(5);
            }
        }).skip(4).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                Log.d("lishaowei", integer + "");
            }
        });
        Observable.just(1, 2, 3, 4)
                .doOnNext(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {

                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {

            }
        });
    }


    private void rxjava7() {
        compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(Observable.interval(1000, 200, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Long>() {
                    @Override
                    public void accept(@NonNull Long aLong) throws Exception {
                        Log.d("lsw", aLong + "");
                    }
                }));
    }

    private void rxjava6() {
        Observable.fromArray(1, 2, 3, 4, 5, 6, 7)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(@NonNull Integer integer) throws Exception {
                        return integer % 2 == 0;
                    }
                })
                .buffer(3)
                .subscribe(new Consumer<List<Integer>>() {
                    @Override
                    public void accept(@NonNull List<Integer> integers) throws Exception {
                        for (int i = 0; i < integers.size(); i++) {
                            Log.d("lsw", integers.get(i) + "");
                        }
                        Log.d("lsw", "what the f**K");

                    }
                });
    }

    private void rxjava5() {
        Observable.just(3, 4, 12, 53, -122, 32).filter(new Predicate<Integer>() {
            @Override
            public boolean test(@NonNull Integer integer) throws Exception {
                return integer >= 10;
            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(@NonNull Integer integer) throws Exception {
                Log.d("lsw", integer + "");
            }
        });
    }

    private void rxjava4() {
        Observable.just(12,3,4,5)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

        Observable.concat(Observable.just(1, 2, 3), Observable.just(4, 5, 6))
                .skip(3)
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(@NonNull Integer integer) throws Exception {
                        Log.d("lsw", integer + "");
                    }
                });

        Observable.concat(Observable.just(1, 2, 3), Observable.just(4, 5, 6))
                .subscribeWith(new DisposableObserver<Integer>() {
                    @Override
                    public void onNext(Integer integer) {
                        Log.d("lsw", integer + "");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void rxjava3() {
        Observable.zip(getStringObservable(), getIntegerObservable(), new BiFunction<String, Integer, String>() {
            @Override
            public String apply(@NonNull String s, @NonNull Integer integer) throws Exception {
                return s + integer;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(@NonNull String s) throws Exception {
                Log.d("lsw", s);
            }
        });
    }

    private void rxjava2() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);
                e.onComplete();
            }
        }).map(new Function<Integer, String>() {
            @Override
            public String apply(@NonNull Integer integer) throws Exception {
                return integer + "： 第" + integer + "个";
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(@NonNull String s) throws Exception {
                Log.d("lsw", s);
            }
        });
    }

    private void rxjava1() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onNext(4);
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d("lsw", d.toString());
            }

            @Override
            public void onNext(Integer integer) {
                Log.d("lsw", integer + "");

            }

            @Override
            public void onError(Throwable e) {
                Log.d("lsw", e.toString());
            }

            @Override
            public void onComplete() {
                Log.d("lsw", "onComplete");
            }
        });
    }

    @Override
    public void getViewSucc() {
        Log.d("L", "getViewSucc");
    }

    public ObservableSource<? extends String> getStringObservable() {
        return Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                if (!e.isDisposed()) {
                    e.onNext("a");
                    Log.d("lsw", "String :a");
                    e.onNext("b");
                    Log.d("lsw", "String :b");
                    e.onNext("c");
                    Log.d("lsw", "String :c");
                }
            }
        });
    }

    public ObservableSource<? extends Integer> getIntegerObservable() {
        return Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                Log.d("lsw", "integer :1");
                e.onNext(2);
                Log.d("lsw", "integer :2");
                e.onNext(3);
                Log.d("lsw", "integer :3");
                e.onNext(4);
                Log.d("lsw", "integer :4");

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (disposable != null || !disposable.isDisposed()) {
//            disposable.dispose();
//        }
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }
}
