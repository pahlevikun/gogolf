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

public class PermatasentulMapActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap maps;
    Marker marker;
    //SupportMapFragment supportMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permatasentul_map);
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
                .position(new LatLng(-6.526948, 106.871946))
                .title("permata sentul"))
                .showInfoWindow();
        maps.setMapType(maps.MAP_TYPE_SATELLITE);


        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.535264, 106.869221))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 1"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.538362, 106.870390))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 2"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.537909, 106.871279))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 3"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.534956, 106.872453))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 4"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.532691, 106.871825))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 5"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.530567, 106.873078))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 6"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.529537, 106.872855))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 7"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.531151, 106.869707))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 8"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.528546, 106.874259))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 9"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.527875, 106.872297))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 10"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.525723, 106.871253))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 11"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.526823, 106.868199))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 12"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.528036, 106.865990))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 13"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.528246, 106.863383))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 14"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.524593, 106.862841))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 15"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.524528, 106.864651))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 16"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.523423, 106.867166))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 17"));

        maps.addMarker(new MarkerOptions()
                .position(new LatLng(-6.523700, 106.868969))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
                .title("Hole 18"));


        //
        maps.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-6.526948, 106.871946)));
        maps.moveCamera(CameraUpdateFactory.zoomTo(16));



    }


}
