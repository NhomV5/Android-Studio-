package com.example.ck_ltdd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FilmAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Film> arraylist;

    public FilmAdapter(Context context, int layout, List<Film> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        Film film = arraylist.get(i);

        TextView textView1 = view.findViewById(R.id.tv_tenPhim);
        TextView textView2 = view.findViewById(R.id.tv_theLoai);
        ImageView imageView = view.findViewById(R.id.imagePhim);

        textView1.setText(film.getTenPhim());
        textView2.setText(film.getTheLoai());
        imageView.setImageResource(film.getAnh());

        return view;
    }
}
