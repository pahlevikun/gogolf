package com.m.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PermatasentulHoleActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button lobang1, lobang2, lobang3,lobang4, lobang5, lobang6, lobang7, lobang8, lobang9, lobang10, lobang11, lobang12, lobang13, lobang14, lobang15, lobang16, lobang17, lobang18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permatasentul_hole);

        imageView = (ImageView) findViewById(R.id.imageViewLobang);
        lobang1 = (Button) findViewById(R.id.tombol1);
        lobang2 = (Button) findViewById(R.id.tombol2);
        lobang3 = (Button) findViewById(R.id.tombol3);
        lobang4 = (Button) findViewById(R.id.tombol4);
        lobang5 = (Button) findViewById(R.id.tombol5);
        lobang6 = (Button) findViewById(R.id.tombol6);
        lobang7 = (Button) findViewById(R.id.tombol7);
        lobang8 = (Button) findViewById(R.id.tombol8);
        lobang9 = (Button) findViewById(R.id.tombol9);
        lobang10 = (Button) findViewById(R.id.tombol10);
        lobang11 = (Button) findViewById(R.id.tombol11);
        lobang12 = (Button) findViewById(R.id.tombol12);
        lobang13 = (Button) findViewById(R.id.tombol13);
        lobang14 = (Button) findViewById(R.id.tombol14);
        lobang15 = (Button) findViewById(R.id.tombol15);
        lobang16 = (Button) findViewById(R.id.tombol16);
        lobang17 = (Button) findViewById(R.id.tombol17);
        lobang18 = (Button) findViewById(R.id.tombol18);

        lobang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole1p);
            }
        });

        lobang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole2p);
            }
        });

        lobang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole3p);
            }
        });
        lobang4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole4p);
            }
        });
        lobang5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole5p);
            }
        });
        lobang6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole6p);
            }
        });
        lobang7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole7p);
            }
        });
        lobang8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole8p);
            }
        });
        lobang9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole9p);
            }
        });
        lobang10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole10p);
            }
        });
        lobang11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole11p);
            }
        });
        lobang12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole12p);
            }
        });
        lobang13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole13p);
            }
        });
        lobang14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole14p);
            }
        });
        lobang15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole15p);
            }
        });
        lobang16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole16p);
            }
        });
        lobang17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole17p);
            }
        });
        lobang18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.hole18p);
            }
        });

    }
}
