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

public class RancamayaMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap maps;
    Marker marker;
    //SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rancamaya_map);
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
                .position(new LatLng(-6.659195, 106.823602))
                .title("Rancamaya"))
                .showInfoWindow();
        maps.setMapType(maps.MAP_TYPE_SATELLITE);


        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.662019, 106.820393))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 1"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.663460, 106.823156))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 2"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.662245, 106.825628))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 3"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.661615, 106.828270))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 4"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.662921, 106.831329))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 5"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.662342, 106.830674))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 6"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.660559, 106.829346))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 7"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.659657, 106.827277))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 8"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.660611, 106.823364))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 9"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.660710, 106.820088))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 10"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.660203, 106.817524))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 11"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.658086, 106.817340))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 12"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.654723, 106.818840))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 13"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.654165, 106.820409))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 14"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.654468, 106.823977))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 15"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.655576, 106.823364))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 16"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.656962, 106.822379))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 17"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.657712, 106.821695))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 18"));


        //
        maps.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-6.659195, 106.823602)));
        maps.moveCamera(CameraUpdateFactory.zoomTo(16));



    }


}
