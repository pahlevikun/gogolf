package com.m.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PermatasentulActivity extends AppCompatActivity {
    private LinearLayout fasilitas, lubang, harga, telpon, peta, rumah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permatasentul);
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
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+6221 87951787"));
                startActivity(intent);
            }
        });

        fasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermatasentulActivity.this, PermatasentulFacilityActivity.class);
                startActivity(intent);
            }
        });

        peta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermatasentulActivity.this, PermatasentulMapActivity.class);
                startActivity(intent);
            }
        });

        harga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermatasentulActivity.this, PermatasentulPriceActivity.class);
                startActivity(intent);
            }
        });

        lubang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PermatasentulActivity.this,PermatasentulHoleActivity.class);
                startActivity(intent);
            }
        });
    }
}
