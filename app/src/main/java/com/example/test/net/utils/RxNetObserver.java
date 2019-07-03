package com.example.test.net.utils;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * @classname：RxNetObserver
 * @author：luozhipeng
 * @date：19/3/2019 10:56
 * @description： 网络接口请求回调
 */
public class RxNetObserver<T> implements Observer<T> {
    Disposable disposable;

    @Override
    public void onSubscribe(Disposable d) {
        this.disposable = d;
    }

    @Override
    public void onNext(T t) {

    }

    @Override
    public void onError(Throwable e) {
        /****** 错误日志直接打印出来 ******/
        e.printStackTrace();
    }

    @Override
    public void onComplete() {
    }

    public void setDisposable(Disposable disposable) {
        this.disposable = disposable;
    }

    public boolean isDisposable() {
        return (null == disposable) || disposable.isDisposed();
    }

    public void onDispose() {
        if (!isDisposable()) {
            this.disposable.dispose();
        }
    }
}
