package com.example.mvvmretrofit.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.mvvmretrofit.service.model.Project;
import com.example.mvvmretrofit.service.Retrofit.RetrofitRespository;

import java.util.List;

public class ProjectViewModel extends AndroidViewModel {

    private LiveData<List<Project>> data;
    private RetrofitRespository respository;

    public ProjectViewModel(@NonNull Application application) {
        super(application);
        data = respository.getProject("ToolHack2");
    }

    public LiveData<List<Project>> getProject()
    {
        return data;
    }

}
