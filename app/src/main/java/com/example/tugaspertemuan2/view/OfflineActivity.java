package com.example.tugaspertemuan2.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.tugaspertemuan2.R;
import com.example.tugaspertemuan2.databinding.ActivityContentBinding;
import com.example.tugaspertemuan2.databinding.ActivityOfflineBinding;
import com.example.tugaspertemuan2.viewmodel.OfflineViewModel;

public class OfflineActivity extends AppCompatActivity {

    private ActivityOfflineBinding mBinding;
    private OfflineViewModel mOfflineViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityOfflineBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mOfflineViewModel = new OfflineViewModel(getApplication());
        mBinding.rvContentList2.setLayoutManager(new LinearLayoutManager(this));

        mOfflineViewModel.getOfflineData().observe(this,contentListItems -> {
            mBinding.rvContentList2.setAdapter(new ContentListAdapter(contentListItems));
        });

        mBinding.btnToHome2.setOnClickListener(view->{
            Intent homeIntent = new Intent(OfflineActivity.this,MainActivity.class);
            startActivity(homeIntent);
        });

        mBinding.btnToContent.setOnClickListener(view -> {
            startActivity(new Intent(OfflineActivity.this,ContentActivity.class));
        });
    }
}