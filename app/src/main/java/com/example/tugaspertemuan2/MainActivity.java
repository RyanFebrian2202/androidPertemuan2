package com.example.tugaspertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button logout;
    TextView username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.btn_logout);
        username = findViewById(R.id.tv_username);
        email = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        String tempUsername = intent.getStringExtra("account_username");
        username.setText(tempUsername);

        String tempEmail = intent.getStringExtra("account_email");
        email.setText(tempEmail);

        logout.setOnClickListener(v->{
            Intent logoutIntent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(logoutIntent);
        });
    }
}