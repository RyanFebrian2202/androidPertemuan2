package com.example.tugaspertemuan2.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugaspertemuan2.data.remotes.ContentListItem;
import com.example.tugaspertemuan2.databinding.ActivityContentBinding;
import com.example.tugaspertemuan2.viewmodel.MainViewModel;
import com.example.tugaspertemuan2.viewmodel.MainViewModelFactory;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends AppCompatActivity {

    private ActivityContentBinding mBinding;
    private List<String> contentItemName;
    private MainViewModel mMainViewModel;
    private ContentListAdapter mContentListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mMainViewModel = new ViewModelProvider(this,
                new MainViewModelFactory(getApplication())).get(MainViewModel.class);
        mMainViewModel.callApi();
        mBinding.rvContentList.setLayoutManager(new LinearLayoutManager(this));

        mMainViewModel.getContentListItems().observe(this, contentListItems -> {
            mContentListAdapter = new ContentListAdapter(contentListItems);
            mContentListAdapter.setmOnItemClickCallback(new ContentListAdapter.OnItemClickCallback() {
                @Override
                public void onInsertClick(ContentListItem contentListItem) {
                    mMainViewModel.insertContentItem(contentListItem);
                }
            });

            mBinding.rvContentList.setAdapter(mContentListAdapter);
        });

        mBinding.btnToHome.setOnClickListener(view->{
            Intent homeIntent = new Intent(ContentActivity.this,MainActivity.class);
            startActivity(homeIntent);
        });

        mBinding.btnToOffline.setOnClickListener(view -> {
            startActivity(new Intent(ContentActivity.this,OfflineActivity.class));
        });
    }
}