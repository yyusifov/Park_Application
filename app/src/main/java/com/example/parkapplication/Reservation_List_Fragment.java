package com.example.parkapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parkapplication.adapter.Reservation_list_recyclerView;
import com.example.parkapplication.model.User_Information;
import com.example.parkapplication.util.User_Information_View_Model;

import java.util.ArrayList;
import java.util.List;

public class Reservation_List_Fragment extends Fragment {
    RecyclerView recyclerView;
    public Reservation_List_Fragment() {
        // Required empty public constructor
    }
    public static Reservation_List_Fragment newInstance() {
        Reservation_List_Fragment fragment = new Reservation_List_Fragment();
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reservation__list_, container, false);
        recyclerView = view.findViewById(R.id.rcyclerID);
        recyclerView.setHasFixedSize(true);
        User_Information_View_Model user_information_view_model = new ViewModelProvider.AndroidViewModelFactory(requireActivity().getApplication()).
                create(User_Information_View_Model.class);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        user_information_view_model.getAllUserInformation().observe(requireActivity(), All_user_information -> {
            List<User_Information> All_user_information1 = new ArrayList<>();
            for(int i = 0; i < All_user_information.size(); i++){
                if(All_user_information.get(i).getReservedPark() != null){
                    All_user_information1.add(All_user_information.get(i));
                }
            }
            Reservation_list_recyclerView reservation_list_recyclerView = new Reservation_list_recyclerView(All_user_information1);
            recyclerView.setAdapter(reservation_list_recyclerView);
        });
        return view;
    }
}