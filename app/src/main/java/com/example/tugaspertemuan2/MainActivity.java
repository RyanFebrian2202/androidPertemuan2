package com.example.tugaspertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.vp_viewPager2);

        setViewPager2(viewPager2);

        new TabLayoutMediator(tabLayout,viewPager2,(((tab, position) -> {
            tab.setText(pageAdapter.getFragmentTitle(position));
        }))).attach();
    }

    public void setViewPager2(ViewPager2 viewPager2){
        if (pageAdapter == null){
            pageAdapter = new PageAdapter(this);
            pageAdapter.addFragment(new HomeFragment(),"Home");
            pageAdapter.addFragment(new ProfileFragment(), "Profile");
            viewPager2.setAdapter(pageAdapter);
        }
    }
}