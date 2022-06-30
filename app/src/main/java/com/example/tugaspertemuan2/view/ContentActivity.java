package com.example.tugaspertemuan2.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugaspertemuan2.databinding.ActivityContentBinding;
import com.example.tugaspertemuan2.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends AppCompatActivity {

    private ActivityContentBinding mBinding;
    private List<String> contentItemName;
    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mMainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mMainViewModel.callApi();

        mMainViewModel.getContentListItems().observe(this, contentListItems -> {
            mBinding.rvContentList.setAdapter(new ContentListAdapter(contentListItems));
        });

        mBinding.btnToHome.setOnClickListener(view->{
            Intent homeIntent = new Intent(ContentActivity.this,MainActivity.class);
            startActivity(homeIntent);
        });
    }
}