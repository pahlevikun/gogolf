package com.m.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Map;

public class BogorrayaMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap maps;
    Marker marker;
    //SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bogorraya_map);
        SupportMapFragment supportMapFragment = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapM));
        supportMapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap map) {
        maps = map;
        maps.getUiSettings().setAllGesturesEnabled(true);
        maps.getUiSettings().setZoomControlsEnabled(true);
        maps.getUiSettings().setCompassEnabled(true);
        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.599083, 106.835762))
                .title("Bogor Raya"))
                .showInfoWindow();
        maps.setMapType(maps.MAP_TYPE_SATELLITE);


        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.607688, 106.832808))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 1"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.607708, 106.834356))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 2"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.605652, 106.834750))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 3"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.604423, 106.833290))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 4"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.603569, 106.834912))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 5"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.600830, 106.833621))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 6"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.599516, 106.833530))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 7"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.596929, 106.834385))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 8"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.596529, 106.835759))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 9"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.595504, 106.836891))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 10"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.595685, 106.837486))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 11"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.596280, 106.838058))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 12"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.597235, 106.838466))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 13"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.599382, 106.838096))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 14"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.600031, 106.837804))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 15"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.602545, 106.837111))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 16"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.600997, 106.835718))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 17"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.602339, 106.833872))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 18"));


        //
        maps.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-6.599083, 106.835762)));
        maps.moveCamera(CameraUpdateFactory.zoomTo(16));



    }


}
