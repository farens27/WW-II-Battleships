package com.ren.worldwariibattleships;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBattleshipAdapter  extends RecyclerView.Adapter<ListBattleshipAdapter.ListViewHolder>{
    private ArrayList<Battleship> listBattleship;
    private Context context;
    public ListBattleshipAdapter(ArrayList<Battleship> list) {
        this.listBattleship = list;
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_picture);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_battelship, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Battleship battleship= listBattleship.get(position);
        Glide.with(holder.itemView.getContext())
                .load(battleship.getPicture_battleship())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(battleship.getNama_battleship());
        holder.tvDetail.setText(battleship.getDetail_battleship());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = view.getContext();
                Intent detailIntent = new Intent(context, DetailActivity.class);
                detailIntent.putExtra(DetailActivity.DETAIL_BATTLESHIP, listBattleship.get(holder.getAdapterPosition()));
                context.startActivity(detailIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBattleship.size();
    }
}


