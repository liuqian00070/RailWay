package com.example.test.net.retrofit.interceptor;

import android.text.TextUtils;

import com.example.test.TestApplication;
import com.example.test.net.utils.NetworkUtil;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class CacheInterceptor implements Interceptor {
    /****** set cahe times is 3 days ******/
    protected static final int maxStale = 60 * 60 * 24 * 3;
    /****** read from cache for 15 s ******/
    protected static final int maxStaleOnline = 15;

    @Override
    public Response intercept(Chain chain) throws IOException {
        //获取请求
        Request request = chain.request();

        /*无网络：强制使用缓存数据，OFFLINE 获取缓存*/
        if (!NetworkUtil.isNetworkAvailable(TestApplication.getContext())) {
            request = request.newBuilder()
                    //强制使用缓存数据
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .build();
        }

        Response originalResponse = chain.proceed(request);

        //有网络状态
        if (NetworkUtil.isNetworkAvailable(TestApplication.getContext())) {
            /*有网的时候读接口上的@Headers里的配置，你可以在这里进行统一的设置*/
            String cacheControl = request.cacheControl().toString();
            //如果没有配置指定缓存时间，则这里默认指定为
            if (TextUtils.isEmpty(cacheControl)) {
                //15秒内请求，拿取缓存
                cacheControl = String.format("public, max-age=%s", maxStaleOnline);
            }

            return originalResponse.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    //这里设置的为0就是说不进行缓存，我们也可以设置缓存时间
                    .header("Cache-Control", cacheControl)
                    .build();
        } else {
            //无网络状态
            return originalResponse.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    //这里的设置的是我们的没有网络的缓存时间，想设置多少就是多少。3天内，拿取缓存数据
                    .header("Cache-Control", String.format("public, only-if-cached, max-stale=%s", maxStale))
                    .build();
        }
    }
}
