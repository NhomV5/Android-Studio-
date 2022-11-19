package com.example.ck_ltdd;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class RegisterActivity extends AppCompatActivity {
    private EditText edtEmail,edtPassword,edtPasswordAgain;
    private Button btnRegister;
    private TextView tvLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        edtPasswordAgain = findViewById(R.id.edt_againpassword);
        btnRegister = findViewById(R.id.btn_register);
        tvLogin = findViewById(R.id.tv_login);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

    }

    private void register() {
        String email,password,passwordagain;
        email=edtEmail.getText().toString();
        password=edtPassword.getText().toString();
        passwordagain=edtPasswordAgain.getText().toString();

        if(TextUtils.isEmpty(email)) {
            Toast.makeText(this,"Vui lòng nhập email,",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Vui lòng nhập mật khẩu,", Toast.LENGTH_SHORT).show();
            return;
        }
            if(TextUtils.isEmpty(passwordagain)) {
                Toast.makeText(this,"Vui lòng nhập lại mật khẩu,",Toast.LENGTH_SHORT).show();
                return;
            }




    }
    }