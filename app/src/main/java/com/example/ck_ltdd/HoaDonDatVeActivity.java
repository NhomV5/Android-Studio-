package com.example.ck_ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HoaDonDatVeActivity extends AppCompatActivity {
    private TextView btnLSV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoa_don_dat_ve);

        btnLSV=(TextView) findViewById(R.id.btnLichsuVe);
        btnLSV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HoaDonDatVeActivity.this,LichSuDatVeActivity.class);
                startActivity(intent);
            }
        });
    }
}