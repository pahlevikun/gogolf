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

public class GununggeulisMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap maps;
    Marker marker;
    //SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gununggeulis_map);
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
                .position(new LatLng(-6.624940, 106.862321))
                .title("Gunung Geulis"))
                .showInfoWindow();
        maps.setMapType(maps.MAP_TYPE_SATELLITE);


        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.627925, 106.853695))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 1"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.629299, 106.855864))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 2"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.630162, 106.859213))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 3"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.626582, 106.858790))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 4"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.626217, 106.860549))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 5"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.620578, 106.859257))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 6"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.621548, 106.862434))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 7"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.619582, 106.864835))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 8"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.621631, 106.863912))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 9"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.622616, 106.866623))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 10"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.624817, 106.877740))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 11"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.625040, 106.875733))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 12"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.623889, 106.870937))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 13"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.629463, 106.871879))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 14"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.628951, 106.870163))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 15"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.631393, 106.870316))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 16"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.631393, 106.870316))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 17"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.628842, 106.866286))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 18"));


        //
        maps.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-6.624940, 106.862321)));
        maps.moveCamera(CameraUpdateFactory.zoomTo(16));



    }


}
