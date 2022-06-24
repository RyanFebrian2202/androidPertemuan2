package com.example.tugaspertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class RegisterActivity extends AppCompatActivity {

    Button register, toLogin;
    EditText registerUsername, registerEmail, registerPassword;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = findViewById(R.id.btn_register);
        toLogin = findViewById(R.id.btn_toLogin);
        registerUsername = findViewById(R.id.et_usernameRegister);
        registerEmail = findViewById(R.id.et_emailRegister);
        registerPassword = findViewById(R.id.et_passwordRegister);
        sharedPreferences = getSharedPreferences("account",MODE_PRIVATE);
        LinearLayout linearLayout = findViewById(R.id.layout_linearRegister);

        register.setOnClickListener(v->{
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("account_username",registerUsername.getText().toString());
            editor.putString("account_email",registerEmail.getText().toString());
            editor.putString("account_password",registerPassword.getText().toString());
            editor.apply();

            Snackbar.make(linearLayout,"Register successful",Snackbar.LENGTH_SHORT)
                    .setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_FADE)
                    .show();

            Intent registerIntent = new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(registerIntent);
        });

        toLogin.setOnClickListener(v->{
            Intent toLoginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
            startActivity(toLoginIntent);
        });
    }
}