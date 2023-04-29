package com.example.parkapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.parkapplication.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class InfoWindowAdapter implements GoogleMap.InfoWindowAdapter {
    private final Context context;
    private final LayoutInflater layoutInflater;
    private final View view;

    public InfoWindowAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.view = this.layoutInflater.inflate(R.layout.info_window, null);
    }

    @Nullable
    @Override
    public View getInfoContents(@NonNull Marker marker) {
        return null;
    }

    @Nullable
    @Override
    public View getInfoWindow(@NonNull Marker marker) {
        TextView parkTitle = view.findViewById(R.id.title_ID);
        TextView parkStateCode = view.findViewById(R.id.stateCode_ID);

        parkTitle.setText(marker.getTitle());
        parkStateCode.setText(marker.getSnippet());
        return view;
    }
}
