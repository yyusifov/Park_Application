package com.example.parkapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parkapplication.R;
import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_View_Model;

import java.util.List;

public class Reservation_list_recyclerView extends RecyclerView.Adapter<Reservation_list_recyclerView.ViewHolder3>{
    private final List<User_Information> all_user_information;

    public Reservation_list_recyclerView(List<User_Information> all_user_information) {
        this.all_user_information = all_user_information;
    }

    @NonNull
    @Override
    public ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.reservation_list_row, parent, false);
        return new ViewHolder3(inflater);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder3 holder, int position) {
            holder.reservedParkName.setText(all_user_information.get(position).getReservedPark());
            holder.deleteBut.setOnClickListener(v -> {
                User_Information_View_Model.delete(all_user_information.get(holder.getAdapterPosition()));
                notifyDataSetChanged();
            });
    }


    @Override
    public int getItemCount() {
        return all_user_information.size();
    }

    public class ViewHolder3 extends RecyclerView.ViewHolder {
        public TextView reservedParkName;
        public RadioButton deleteBut;
        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
            deleteBut = itemView.findViewById(R.id.deleteButton);
            reservedParkName = itemView.findViewById(R.id.prk_name_id);
        }
    }
}
