package com.example.parkapplication;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.parkapplication.adapter.InfoWindowAdapter;
import com.example.parkapplication.javainuse.Image;
import com.example.parkapplication.javainuse.Root;
import com.example.parkapplication.javainuse.ViewModelPark;
import com.example.parkapplication.repository.ParkRepository;
import com.example.parkapplication.util.User_Information_View_Model;
import com.example.parkapplication.util.Util;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.parkapplication.databinding.ActivityMapsBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback , GoogleMap.OnInfoWindowClickListener{
    private CardView searchCard;
    private List<Root> allList;
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private TextView searchState;
    private ImageButton searchButton;
    private BottomNavigationView bottomNavigationBar;
    private SupportMapFragment mapFragment;
    private User_Information_View_Model user_information_view_model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        SharedViewModel sharedViewModel = new ViewModelProvider(this).get(SharedViewModel.class);
//        Log.d("HIBIT2", sharedViewModel.getUpdatedUser().getValue().getUserName());
        user_information_view_model = new ViewModelProvider.AndroidViewModelFactory(MapsActivity.this.getApplication()).
                create(User_Information_View_Model.class);
        bottomNavigationBar = findViewById(R.id.bottomNav);
        searchCard = findViewById(R.id.searchCardView);
        searchState = findViewById(R.id.stateCODE);
        searchButton = findViewById(R.id.searchButtonID);
        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        searchButton.setOnClickListener(v -> {
            Util.getUrl(searchState.getText().toString().trim());
            mapFragment.getMapAsync(this);
            mMap.clear();
            reloadMap();
        });
        bottomNavigationBar.setOnItemSelectedListener(item ->{
            mMap.clear();
            if(item.getItemId() == R.id.park_map){
                searchCard.setVisibility(View.VISIBLE);
                getSupportFragmentManager().beginTransaction().replace(R.id.map, mapFragment).commit();
            }
            else if(item.getItemId() == R.id.park_list){
                searchCard.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.map, Park_list_Fragment.newInstance()).commit();
            }
            else if(item.getItemId() == R.id.reservation_LIST){
                searchCard.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.map, Reservation_List_Fragment.newInstance()).commit();
            }
            else if(item.getItemId() == R.id.profile_section){
                searchCard.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction().replace(R.id.map, Profile_activity.newInstance()).commit();
            }
            mapFragment.getMapAsync(this);

            return true;
        });
    }
    public void reloadMap(){
        mapFragment.getMapAsync(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        mMap.setInfoWindowAdapter(new InfoWindowAdapter(this.getApplicationContext()));
        mMap.setOnInfoWindowClickListener(this::onInfoWindowClick);

        ViewModelPark viewModelPark = new ViewModelProvider(this).get(ViewModelPark.class);
        new ParkRepository().getParkList(parks -> {
            allList = parks;
            viewModelPark.setParks(allList);
            for (int i = 0; i < parks.size(); i++) {
                MarkerOptions markerOptions = new MarkerOptions();
                if(parks.get(i).getLatitude().isEmpty() || parks.get(i).getLongitude().isEmpty()){
                    continue;
                }
                LatLng latLng = new LatLng(Double.valueOf(parks.get(i).getLatitude()), Double.valueOf(parks.get(i).getLongitude()));
                markerOptions.position(latLng).title(parks.get(i).getFullName()).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)).snippet(parks.get(i).getStates());
                Marker marker = mMap.addMarker(markerOptions);
                marker.setTag(parks.get(i));
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, 4.5f));
            }
        }, searchState.getText().toString().trim());

    }

    @Override
    public void onInfoWindowClick(@NonNull Marker marker) {
        searchCard.setVisibility(View.GONE);
        ViewModelPark viewModelPark = new ViewModelProvider(this).get(ViewModelPark.class);
        viewModelPark.setPark((Root) marker.getTag());
        getSupportFragmentManager().beginTransaction().replace(R.id.map, new detailFragment()).commit();
    }
}