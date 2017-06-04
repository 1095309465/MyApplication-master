package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mMap;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMap = (MapView) findViewById(R.id.mapview);
        mMap.onCreate(savedInstanceState);
        mMap.onResume();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
