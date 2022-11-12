package com.example.ck_ltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TrangChuuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchuu);

        ListView listView;

        ArrayList<Film> arrayList;
        FilmAdapter filmAdapter;

        listView = findViewById(R.id.listview_dsphim);
        arrayList = new ArrayList<>();

        arrayList.add(new Film("STAR WAR", "Thế loại: Hành động, viễn tưởng", R.drawable.starwar));
        arrayList.add(new Film("STAR WAR", "Thế loại: Hành động, viễn tưởng", R.drawable.starwar));
        arrayList.add(new Film("STAR WAR", "Thế loại: Hành động, viễn tưởng", R.drawable.starwar));

        filmAdapter = new FilmAdapter(TrangChuuActivity.this, R.layout.phim_item, arrayList);
        listView.setAdapter(filmAdapter);

        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                setContentView(R.layout.dat_ve);
            }
        });
    }
}