package com.example.test.net;


import com.example.test.BuildConfig;

public class RetrofitConfigs {

    public final static String CLIENT_ID = BuildConfig.HttpRelease ?
            "2bb91f708181223aa8685d6e2dc2fd48f6c2755dae023700676916b0d480696a" :
            "76dd15e7cb81b67529fccfed28d9c5e8559c894711da42a70c79e7689665fefc";

    public final static String CLIENT_SECRET = BuildConfig.HttpRelease ?
            "81978c0180d246ac5f466d37fdcd86b6b9ca5e8cb5eaac8ddac388356974426a" :
            "37f12be040940a54b319adcc8631062d5f948e93bd24a88d0a9258b378d42d53";

    /****** 服务条款 ******/
    public final static String TERMS_OF_SERVICE = "https://auth.kdanmobile.com/articles/terms_of_service";
    /****** 隐私政策 ******/
    public final static String PRIVACY_POLICY = "https://auth.kdanmobile.com/articles/privacy_policy";
    /****** 获取IP的接口信息 ******/
    public final static String IP = "https://geoip-db.com/json/";

    /****** 会员中心主机接口 ******/
    public final static String Member_center = BuildConfig.HttpRelease ?
            "https://member-center.kdanmobile.com/" :
            "https://preparing.kdanmobile.com:3034/";

    /****** Sinature Cente ******/
    public final static String Sigature_center = BuildConfig.HttpRelease ?
            "https://signature-center.kdanmobile.com/" :
            "https://preparing2.kdanmobile.com:3032/";

    /****** 用户点数接口 ******/
    public final static String User_Space_infos = BuildConfig.HttpRelease ?
            "https://data-center-rails.kdanmobile.com/api/v3/users" :
            "https://preparing.kdanmobile.com:3020/api/v3/users";

    /****** 用户购买信息接口 ******/
    public final static String User_Buy_infos = BuildConfig.HttpRelease ?
            "https://iap-center.kdanmobile.com/api/v4/services" :
            "https://preparing.kdanmobile.com:3004/api/v4/services";

    /****** 用户购买二次认证接口 ******/
    public final static String User_Buy_verfiy = BuildConfig.HttpRelease ?
            "https://iap-center.kdanmobile.com/api/v4/play" :
            "https://preparing.kdanmobile.com:3004/api/v4/play";
}
