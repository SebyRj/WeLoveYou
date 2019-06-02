package com.example.rick.weloveyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton =  findViewById(R.id.rollButton);

        final ImageView photo = findViewById(R.id.photo);

         final int[] photoArray = {R.drawable.a, R.drawable.ab, R.drawable.ad, R.drawable.ar, R.drawable.b, R.drawable.c, R.drawable.cd, R.drawable.d, R.drawable.dp, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.k, R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.p, R.drawable.q, R.drawable.r, R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w, R.drawable.x, R.drawable.y, R.drawable.z};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("WeLoveYou", "Ze Button has been pressed!");


                Random randomNumberGenerator = new Random();

                int number = randomNumberGenerator.nextInt(29);

                Log.d("WeLoveYou", "The random number is: " + number);

                photo.setImageResource(photoArray[number]);
            }
        });



    }
}
