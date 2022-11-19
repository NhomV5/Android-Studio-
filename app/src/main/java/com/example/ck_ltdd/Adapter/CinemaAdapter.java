package com.example.ck_ltdd.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck_ltdd.Dat_ghe;
import com.example.ck_ltdd.Item.ItemCinema;
import com.example.ck_ltdd.R;

import java.util.List;

public class CinemaAdapter extends RecyclerView.Adapter<CinemaAdapter.DataViewHolder> {
    private List<ItemCinema> cinemas;
    private Context context;

    public CinemaAdapter(Context context,List<ItemCinema> cinemas) {
        this.cinemas = cinemas;
        this.context=context;
    }
    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cinema, parent, false);

        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        final ItemCinema item = cinemas.get(position);
        if (cinemas==null){
            return;
        }
        holder.nameCinema.setText(item.getNameCinema());
        holder.Address.setText(item.getAddress());
        holder.ImgCinema.setImageResource(item.getImageCinema());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickDatGhe();
            }
        });
    }
    public void onClickDatGhe(){
        Intent intent= new Intent(context,Dat_ghe.class);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        if(cinemas!=null)
            return cinemas.size();
        else
            return 0;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {
        private TextView nameCinema,Address;
        private ImageView ImgCinema;
        private LinearLayout linearLayout;
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.lnLO);
            nameCinema=(TextView)itemView.findViewById(R.id.nameCinema);
            Address=(TextView) itemView.findViewById(R.id.AddressCinema);
            ImgCinema=(ImageView) itemView.findViewById(R.id.ImageCinema);
        }
    }
}
