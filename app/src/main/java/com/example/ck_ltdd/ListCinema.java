package com.example.ck_ltdd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.ck_ltdd.Adapter.CinemaAdapter;
import com.example.ck_ltdd.Item.ItemCinema;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class ListCinema extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CinemaAdapter cinemaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_cinema);

        recyclerView =  findViewById(R.id.rcv_Cinema);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration= new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        cinemaAdapter= new CinemaAdapter(this,getListCinema());
        recyclerView.setAdapter(cinemaAdapter);


    }

    @NonNull
    private List<ItemCinema> getListCinema() {
        List<ItemCinema> cinemaList= new ArrayList<>();

        cinemaList.add(new ItemCinema("Startlight Cinema", "Tầng 4 - Tòa Nhà Nguyễn Kim, 46 Điện Biên Phủ, Quận Thanh Khê, Tp. Đà Nẵng",R.drawable.startlightdn));
        cinemaList.add(new ItemCinema("Lotter Cinema", "Tầng 5 Lotte Mart Đà Nẵng, P. Hòa Cường Bắc, Q. Hải Châu, Tp. Đà Nẵng",R.drawable.lottercinema));
        cinemaList.add(new ItemCinema("Galaxy Cinema", "Tầng 3 Coop Mart, 478 Điện Biên Phủ, Quận Thanh Khê, Đà Nẵng",R.drawable.galaxycinema));
        cinemaList.add(new ItemCinema("Metiz Cinema", "Tầng 1 Helio Center, Đường 2/9, Hải Châu, Tp. Đà Nẵng",R.drawable.metizcinema));

        return cinemaList;
    }
    public void datghe(String NameCinema){
        Intent intent= new Intent(ListCinema.this,Dat_ghe.class);
        startActivity(intent);
    }
}