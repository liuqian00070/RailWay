package com.example.test.net.retrofit.errors;

import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * @classname：HttpResponseFunc
 * @author：luozhipeng
 * @date：18/3/2019 14:52
 * @description： 异常转换处理
 */
public class HttpResponseFunc<T> implements Function<Throwable, Observable<T>> {
    @Override
    public Observable<T> apply(@NonNull Throwable throwable) {
        return Observable.error(ApiException.handleException(throwable));
    }
}
