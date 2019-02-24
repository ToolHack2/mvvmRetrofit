package com.example.mvvmretrofit.service.Retrofit;

import com.example.mvvmretrofit.service.model.Project;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;

public interface Api {

    @GET("users/{user}/repos")
    Call<List<Project>> getGithubProject(@Part("user") String user);
}
