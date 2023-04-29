package com.example.parkapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.parkapplication.adapter.RecyclerViewAdapter;
import com.example.parkapplication.javainuse.Root;
import com.example.parkapplication.javainuse.ViewModelPark;
import com.example.parkapplication.repository.ParkRepository;

public class Park_list_Fragment extends Fragment implements RecyclerViewAdapter.setOnParkListener{
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private ViewModelPark viewModelPark;
    public Park_list_Fragment() {
        // Required empty public constructor
    }
    // TODO: Rename and change types and number of parameters
    public static Park_list_Fragment newInstance() {
        Park_list_Fragment fragment = new Park_list_Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewModelPark viewModelPark = new ViewModelProvider(requireActivity()).get(ViewModelPark.class);
        recyclerViewAdapter = new RecyclerViewAdapter(viewModelPark.getParks().getValue(), this::getOnParkListener, requireActivity().getApplication());
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_park_list, container, false);
        viewModelPark = new ViewModelProvider(requireActivity()).get(ViewModelPark.class);
        recyclerView = view.findViewById(R.id.parkListinFragment);
        // Inflate the layout for this fragment
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

    @Override
    public void getOnParkListener(Root root) {
        viewModelPark.setPark(root);
        getChildFragmentManager().beginTransaction().replace(R.id.parkList_FragmentId, detailFragment.newInstance()).commit();
    }
}