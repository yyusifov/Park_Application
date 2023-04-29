package com.example.parkapplication.adapter;

import android.app.Application;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parkapplication.R;
import com.example.parkapplication.javainuse.Root;
import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_View_Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewMolder> {
    private final List<Root> allParkList;
    private final setOnParkListener parkListener;
    private final Application application;

    public RecyclerViewAdapter(List<Root> allParkList, setOnParkListener parkListener, Application application) {
        this.allParkList = allParkList;
        this.parkListener = parkListener;
        this.application = application;
    }

    @NonNull
    @Override
    public ViewMolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.park_list_row, parent, false);
        return new ViewMolder(view, this.parkListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewMolder holder, int position) {
        holder.parkName.setText(allParkList.get(position).getFullName());
        Picasso.get().load(allParkList.get(position).getImages().get(0).getUrl()).fit().placeholder(android.R.drawable.stat_sys_download).error(android.R.drawable.stat_notify_error).into(holder.parkImage);
        holder.purchaseBut.setOnClickListener(v -> {
            User_Information user_information = new User_Information();
            user_information.setReservedPark(allParkList.get(holder.getAdapterPosition()).getFullName());
            User_Information_View_Model.insert(user_information);
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-android.R.attr.state_enabled}, new int[]{android.R.attr.state_enabled}}, new int[]{Color.BLUE, Color.argb(100, 45, 90, 25)});
            holder.purchaseBut.setBackgroundTintList(colorStateList);
            holder.purchaseBut.setText("Purchased");
        });
    }

    @Override
    public int getItemCount() {
        return allParkList.size();
    }

    public class ViewMolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public setOnParkListener parkListener;
        public TextView parkName;
        public Button purchaseBut;
        public ImageView parkImage;

        public ViewMolder(@NonNull View itemView, setOnParkListener parkListener) {
            super(itemView);
            parkName = itemView.findViewById(R.id.ParkName_ID);
            parkImage = itemView.findViewById(R.id.park_Image);
            purchaseBut = itemView.findViewById(R.id.purchaseButton);
            this.parkListener = parkListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            parkListener.getOnParkListener(allParkList.get(getAdapterPosition()));
        }
    }

    public interface setOnParkListener {
        void getOnParkListener(Root root);
    }


}
