package com.onefishtwo.appwidgetresize;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        Toast.makeText(this, "AppWidget's widget is ready for the home screen",
                Toast.LENGTH_LONG).show();
        finish();
    }
}