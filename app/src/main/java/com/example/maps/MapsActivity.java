package com.example.maps;

import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng vijayanagara = new LatLng(12.975712, 77.534373);
        mMap.addMarker(new MarkerOptions().position(vijayanagara).title("maruthi "));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vijayanagara));

        LatLng vijaya = new LatLng(13.111819, 77.653303);
        mMap.addMarker(new MarkerOptions().position(vijaya).title(" nagara"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vijaya));

        LatLng kunigal = new LatLng(13.026298, 77.043977);
        mMap.addMarker(new MarkerOptions().position(kunigal).title("kunigal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kunigal

        ));

        }



    }

