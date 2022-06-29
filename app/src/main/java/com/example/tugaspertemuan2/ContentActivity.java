package com.example.tugaspertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugaspertemuan2.databinding.ActivityContentBinding;

import java.util.ArrayList;
import java.util.List;

public class ContentActivity extends AppCompatActivity {

    private ActivityContentBinding mBinding;
    private List<String> contentItemName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityContentBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        contentItemName = new ArrayList<>();

        contentItemName.add("Persona 5");
        contentItemName.add("Persona 4");
        contentItemName.add("Persona 3");

        mBinding.rvContentList.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rvContentList.setAdapter(new ContentListAdapter(contentItemName));

        mBinding.btnToHome.setOnClickListener(view->{
            Intent homeIntent = new Intent(ContentActivity.this,MainActivity.class);
            startActivity(homeIntent);
        });
    }
}