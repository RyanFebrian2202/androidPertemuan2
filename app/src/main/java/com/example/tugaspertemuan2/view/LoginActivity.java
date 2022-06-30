package com.example.tugaspertemuan2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.tugaspertemuan2.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    Button login, toRegister;
    EditText loginEmail, loginPassword;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.btn_logIn);
        toRegister = findViewById(R.id.btn_toRegister);
        loginEmail = findViewById(R.id.et_loginEmail);
        loginPassword = findViewById(R.id.et_loginPassword);
        sharedPreferences = getSharedPreferences("account",MODE_PRIVATE);
        LinearLayout linearLayout = findViewById(R.id.layout_linearLogin);

        login.setOnClickListener(v->{
            if (!loginEmail.getText().toString().equals(sharedPreferences.getString("account_email", ""))) {
                Toast.makeText(LoginActivity.this, "Email Invalid", Toast.LENGTH_SHORT).show();
            } else if (!loginPassword.getText().toString().equals(sharedPreferences.getString("account_password",""))) {
                Toast.makeText(LoginActivity.this, "Password Invalid", Toast.LENGTH_SHORT).show();
            } else if (loginEmail.getText().toString().equals(sharedPreferences.getString("account_email", ""))
                    && loginPassword.getText().toString().equals(sharedPreferences.getString("account_password",""))){

                Snackbar.make(linearLayout,"Login successful",Snackbar.LENGTH_SHORT)
                        .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                        .show();

                Intent loginIntent = new Intent(LoginActivity.this,MainActivity.class);
                loginIntent.putExtra("account_username",sharedPreferences.getString("account_username",""));
                loginIntent.putExtra("account_email",sharedPreferences.getString("account_email",""));
                startActivity(loginIntent);
            }
        });

        toRegister.setOnClickListener(v->{
            Intent toRegisterIntent = new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(toRegisterIntent);
        });
    }
}