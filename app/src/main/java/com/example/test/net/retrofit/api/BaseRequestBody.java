package com.example.test.net.retrofit.api;


import com.example.test.net.RetrofitConfigs;

import java.io.Serializable;

public class BaseRequestBody implements Serializable {
    private String client_id = RetrofitConfigs.CLIENT_ID;
    private String client_secret = RetrofitConfigs.CLIENT_SECRET;

    public BaseRequestBody() {
        this.client_id = RetrofitConfigs.CLIENT_ID;
        this.client_secret = RetrofitConfigs.CLIENT_SECRET;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }
}
