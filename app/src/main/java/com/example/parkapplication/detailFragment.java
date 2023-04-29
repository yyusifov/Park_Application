package com.example.parkapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.parkapplication.adapter.ViewPager2Adapter;
import com.example.parkapplication.javainuse.ViewModelPark;

public class detailFragment extends Fragment {
    private TextView parkFullName;
    private TextView parkDesignation;
    private TextView parkDescription;
    private ViewModelPark viewModelPark;
    private ViewPager2 parkImages;
    private TextView activityText;
    private TextView weatherInformation;
    private TextView topicText;
    private  TextView operatingHoursText;
    public detailFragment() {
        // Required empty public constructor
    }

    public static detailFragment newInstance() {
        detailFragment fragment = new detailFragment();
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
          parkFullName.setText(viewModelPark.getPark().getValue().getFullName());
          parkDescription.setText(viewModelPark.getPark().getValue().getDescription());
          parkDesignation.setText(viewModelPark.getPark().getValue().getDesignation());
        for (int i = 0; i < viewModelPark.getPark().getValue().getImages().size(); i++) {
            int finalI = i;
            viewModelPark.getPark().observe(requireActivity(), root -> {
                ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(root.getImages());
                parkImages.setAdapter(viewPager2Adapter);
            });
        }
          StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < viewModelPark.getPark().getValue().getActivities().size(); i++) {
            stringBuilder.append(viewModelPark.getPark().getValue().getActivities().get(i).getName() + " | ");
        }
        activityText.setText(stringBuilder);
          StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < viewModelPark.getPark().getValue().getTopics().size(); i++) {
            stringBuilder1.append(viewModelPark.getPark().getValue().getTopics().get(i).getName() + " | ");
        }
        topicText.setText(stringBuilder1);
        weatherInformation.setText(String.valueOf(viewModelPark.getPark().getValue().getWeatherInfo()));
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < viewModelPark.getPark().getValue().getOperatingHours().size(); i++) {
            stringBuilder2.append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getMonday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getThursday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getWednesday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getTuesday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getFriday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getSaturday() + "\n | ").
                    append(viewModelPark.getPark().getValue().getOperatingHours().get(i).getStandardHours().getSunday() + "\n | ");
        }

        operatingHoursText.setText(stringBuilder2);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        // Inflate the layout for this fragment
        parkImages = view.findViewById(R.id.ParkImages_ID);
        parkFullName = view.findViewById(R.id.parkNameId2);
        activityText = view.findViewById(R.id.activities_ID);
        topicText = view.findViewById(R.id.topics_ID);
        operatingHoursText = view.findViewById(R.id.operatingHoursId);
        parkDesignation = view.findViewById(R.id.parkDesignationId);
        weatherInformation = view.findViewById(R.id.weatherInfo_ID);
        parkDescription = view.findViewById(R.id.descriptionId);
        viewModelPark = new ViewModelProvider(requireActivity()).get(ViewModelPark.class);
        return view;
    }
}