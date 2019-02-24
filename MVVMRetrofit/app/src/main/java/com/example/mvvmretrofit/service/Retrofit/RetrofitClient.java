package com.example.mvvmretrofit.service.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

class RetrofitClient {
    private static Retrofit ourInstance;

    public RetrofitClient() {
    }

    public static Retrofit getInstance()
    {
        if (ourInstance == null)
        {
            ourInstance = new Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return ourInstance;
    }

    public static Api getAPI()
    {
        return getInstance().create(Api.class);
    }
}
