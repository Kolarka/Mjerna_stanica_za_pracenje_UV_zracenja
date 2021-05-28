package com.my.mjerna_stanica_za_pracenje_uv_zracenja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends FragmentActivity {
    private CircleImageView type1;
    private CircleImageView type2;
    private CircleImageView type3;
    private CircleImageView type4;
    private CircleImageView type5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        type1= (CircleImageView) findViewById(R.id.circle3);
        type1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUV();

            }
        });
        type2= (CircleImageView) findViewById(R.id.circle1);
        type2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        type3= (CircleImageView) findViewById(R.id.circle2);
        type3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        type4= (CircleImageView) findViewById(R.id.circle4);
        type4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        type5= (CircleImageView) findViewById(R.id.circle5);
        type5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void openUV() {
        Intent intenUV = new Intent(this, UV.class);
        startActivity(intenUV);
    }


}