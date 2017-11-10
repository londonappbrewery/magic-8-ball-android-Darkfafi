package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ImageView ballImage = (ImageView)findViewById(R.id.ball);
        final Random randomValueGenerator = new Random();

        ballImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rv = randomValueGenerator.nextInt(5);
                ballImage.setImageResource(getBallImageForValue(rv));
            }
        });
    }


    private int getBallImageForValue(int value)
    {
        switch (value)
        {
            case 0:
                return R.drawable.ball1;
            case 1:
                return R.drawable.ball2;
            case 2:
                return R.drawable.ball3;
            case 3:
                return R.drawable.ball4;
            case 4:
                return R.drawable.ball5;
            default:
                Log.e("Ball Game", "No ball found for value: '"+ value + "'! Returned -1 instead!");
                return -1;
        }
    }
}
