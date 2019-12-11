package com.example.myrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myrecyclerview.R;
import com.example.myrecyclerview.model.Place;

import java.util.ArrayList;

public class ListPlaceAdapter extends RecyclerView.Adapter<ListPlaceAdapter.ListViewHolder>  {
    private ArrayList<Place> listPlace;
    private OnItemClickCallback onItemClickCallback;

    public ListPlaceAdapter(ArrayList<Place> list) {
        this.listPlace = list;
    }


    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_place, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Place place = listPlace.get(position);
        holder.tvName.setText(place.getName());
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(Integer.valueOf(holder.getAdapterPosition()));
            }
        });
        holder.tvDetail.setText(place.getDetail());
        holder.tvDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(Integer.valueOf(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPlace.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;

        ListViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(int id);
    }
}
