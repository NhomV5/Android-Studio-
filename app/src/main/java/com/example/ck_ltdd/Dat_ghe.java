package com.example.ck_ltdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dat_ghe extends AppCompatActivity {
    private Button datve,back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dat_ghe);
        datve= (Button) findViewById(R.id.datve_bt);
        back= (Button) findViewById(R.id.back_bt);
        datve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dat_ghe.this,HoaDonDatVeActivity.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dat_ghe.this,ListCinema.class);
                startActivity(intent);
            }
        });
    }
}
