package com.example.mvvmretrofit;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mvvmretrofit.adapter.ProjectAdapter;
import com.example.mvvmretrofit.service.model.Project;
import com.example.mvvmretrofit.viewmodel.ProjectViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView view;
    private ProjectAdapter adapter;
    private List<Project> list;
    private ProjectViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.recycle_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setHasFixedSize(true);

        viewModel = ViewModelProviders.of(this).get(ProjectViewModel.class);
        viewModel.getProject().observe(this, new Observer<List<Project>>() {
            @Override
            public void onChanged(@Nullable List<Project> projects) {
                adapter = new ProjectAdapter(MainActivity.this, projects);
                view.setAdapter(adapter);

            }
        });
    }
}
