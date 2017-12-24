package com.m.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RancamayaActivity extends AppCompatActivity {
    private LinearLayout fasilitas, lubang, harga, telpon, peta, rumah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rancamaya);
        fasilitas=(LinearLayout)findViewById(R.id.facility);
        lubang=(LinearLayout)findViewById(R.id.hole);
        harga=(LinearLayout)findViewById(R.id.pricetag);
        telpon=(LinearLayout)findViewById(R.id.call);
        peta=(LinearLayout)findViewById(R.id.map);
        rumah=(LinearLayout)findViewById(R.id.home);



        rumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+62 251 824 2282"));
                startActivity(intent);
            }
        });

        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RancamayaActivity.this, RancamayaFacilityActivity.class);
                startActivity(intent);
            }
        });

        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RancamayaActivity.this, RancamayaMapActivity.class);
                startActivity(intent);
            }
        });

        harga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RancamayaActivity.this, RancamayaPriceActivity.class);
                startActivity(intent);
            }
        });

        lubang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RancamayaActivity.this,RancamayaHoleActivity.class);
                startActivity(intent);
            }
        });
    }
}
