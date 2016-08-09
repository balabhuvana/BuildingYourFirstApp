package com.example.balamurugan_se.buildingyourfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String firstData = "com.example.balamurugan_se.buildingyourfirstapp.FirstData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View view) {
        Intent mIntent = new Intent(this, SecondActivity.class);
        mIntent.putExtra(firstData, ((TextView) findViewById(R.id.tv)).getText().toString());
        startActivity(mIntent);
    }
}
