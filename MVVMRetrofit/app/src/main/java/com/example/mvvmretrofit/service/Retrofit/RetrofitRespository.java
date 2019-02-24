package com.example.mvvmretrofit.service.Retrofit;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.mvvmretrofit.service.model.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitRespository {

    Api api;

    public LiveData<List<Project>> getProject(String userId)
    {
        final MutableLiveData<List<Project>> data = new MutableLiveData<>();

        api.getGithubProject(userId).enqueue(new Callback<List<Project>>() {
            @Override
            public void onResponse(Call<List<Project>> call, Response<List<Project>> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Project>> call, Throwable t) {

            }
        });

        return data;
    }
}
