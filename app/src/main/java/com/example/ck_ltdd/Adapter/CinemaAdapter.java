package com.example.ck_ltdd.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck_ltdd.Item.ItemCinema;
import com.example.ck_ltdd.R;

import java.util.List;

public class CinemaAdapter extends RecyclerView.Adapter<CinemaAdapter.DataViewHolder> {
    private List<ItemCinema> cinemas;
    private Context context;

    public void setData(List<ItemCinema> cinemas) {
        this.cinemas = cinemas;
        notifyDataSetChanged();
    }

    public CinemaAdapter(Context context) {
        this.context = context;
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
        ItemCinema item = cinemas.get(position);
        if (cinemas==null){
            return;
        }
        holder.nameCinema.setText(item.getNameCinema());
        holder.Address.setText(item.getAddress());
        holder.ImgCinema.setImageResource(item.getImageCinema());
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
        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            nameCinema=(TextView)itemView.findViewById(R.id.nameCinema);
            Address=(TextView) itemView.findViewById(R.id.AddressCinema);
            ImgCinema=(ImageView) itemView.findViewById(R.id.ImageCinema);
        }
    }
}
