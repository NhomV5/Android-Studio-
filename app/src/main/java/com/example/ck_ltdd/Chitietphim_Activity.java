package com.example.ck_ltdd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Chitietphim_Activity extends AppCompatActivity {
    private Button datve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitietphim_activity);
        datve=(Button) findViewById(R.id.btnDatveCT);
        datve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chitietphim_Activity.this,ListCinema.class);
                startActivity(intent);
            }
        });
    }
}
