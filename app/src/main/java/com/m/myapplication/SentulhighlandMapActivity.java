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

public class SentulhighlandMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap maps;
    Marker marker;
    //SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentulhighland_map);
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
                .position(new LatLng(-6.585511, 106.876605))
                .title("Sentul Highland"))
                .showInfoWindow();
        maps.setMapType(maps.MAP_TYPE_SATELLITE);


        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.577397, 106.863282))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 1"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.577922, 106.863367))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 2"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.577104, 106.865332))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 3"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.579787, 106.862005))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 4"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.584658, 106.864363))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 5"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.584985, 106.867893))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 6"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.580936, 106.870674))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 7"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.585392, 106.873364))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 8"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.584691, 106.874258))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 9"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.587377, 106.875153))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 10"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.588415, 106.876971))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 11"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.587836, 106.877813))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 12"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.588962, 106.879305))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 13"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.592270, 106.879613))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 14"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.593081, 106.883868))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 15"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.589920, 106.884221))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 16"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.587769, 106.883516))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 17"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.587310, 106.884879))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 18"));


        //
        maps.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-6.585511, 106.876605)));
        maps.moveCamera(CameraUpdateFactory.zoomTo(16));



    }


}
