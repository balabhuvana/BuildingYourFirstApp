package com.example.balamurugan_se.buildingyourfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_second);

        TextView textView = new TextView(this);
        textView.setWidth(100);
        textView.setHeight(100);
        if (getIntent() != null) {
            textView.setText(getIntent().getExtras().getString(MainActivity.firstData));
        }

        ViewGroup mViewGroup = (ViewGroup) findViewById(R.id.secondRl);
        mViewGroup.addView(textView);
    }

}
