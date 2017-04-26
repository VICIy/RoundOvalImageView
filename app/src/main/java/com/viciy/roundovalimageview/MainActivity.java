package com.viciy.roundovalimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.viciy.roundovalimageview.RoundImageView.TYPE_ROUND;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RoundImageView viewById = (RoundImageView) findViewById(R.id.iv);
        viewById.setType(TYPE_ROUND);
        viewById.setRoundRadius(30);
    }
}
