package com.m.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GununggeulisHoleActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button lobang3, lobang6, lobang8, lobang10, lobang16, lobang18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gununggeulis_hole);

        imageView = (ImageView) findViewById(R.id.imageViewLobang);
        lobang3 = (Button) findViewById(R.id.tombol3);
        lobang6 = (Button) findViewById(R.id.tombol6);
        lobang8 = (Button) findViewById(R.id.tombol8);
        lobang10 = (Button) findViewById(R.id.tombol10);
        lobang16 = (Button) findViewById(R.id.tombol16);
        lobang18 = (Button) findViewById(R.id.tombol18);


        lobang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole3gg);
            }
        });

        lobang6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole6gg);
            }
        });

        lobang8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole8gg);
            }
        });

        lobang10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole10gg);
            }
        });

        lobang16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole16gg);
            }
        });

        lobang18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole18gg);
            }
        });

    }
}
