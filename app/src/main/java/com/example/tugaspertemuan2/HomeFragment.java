package com.example.tugaspertemuan2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    Button logout, content;
    TextView username, email;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        logout = v.findViewById(R.id.btn_logout);
        content = v.findViewById(R.id.btn_content);
        username = v.findViewById(R.id.tv_username);
        email = v.findViewById(R.id.tv_email);

        //gtw error kenapa
        Intent intent = getActivity().getIntent();

        String tempUsername = intent.getStringExtra("account_username");
        username.setText(tempUsername);

        String tempEmail = intent.getStringExtra("account_email");
        email.setText(tempEmail);

        logout.setOnClickListener(view->{
            Intent logoutIntent = new Intent(getActivity(),LoginActivity.class);
            startActivity(logoutIntent);
        });

        content.setOnClickListener(view->{
            Intent contentIntent = new Intent(getActivity(),ContentActivity.class);
            startActivity(contentIntent);
        });

        return v;
    }
}