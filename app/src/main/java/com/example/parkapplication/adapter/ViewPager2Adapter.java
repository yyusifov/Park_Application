package com.example.parkapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parkapplication.R;
import com.example.parkapplication.javainuse.Image;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewPager2Adapter extends RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>{
    private final List<Image> allImages;

    public ViewPager2Adapter(List<Image> allImages) {
        this.allImages = allImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parkimagerow, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPager2Adapter.ViewHolder holder, int position) {
        Picasso.get().load(allImages.get(position).getUrl()).placeholder(android.R.drawable.stat_sys_download).error(android.R.drawable.stat_notify_error).fit().into(holder.parkImagePage);
    }

    @Override
    public int getItemCount() {
        return allImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView parkImagePage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parkImagePage = itemView.findViewById(R.id.parkImagePageId);
        }
    }
}
