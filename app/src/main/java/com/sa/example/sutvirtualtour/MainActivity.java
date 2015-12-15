package com.sa.example.sutvirtualtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendCamera(View v){
        Intent i = new Intent(MainActivity.this,CameraOverlay.class);
        startActivity(i);

    }
    public void sendMap(View m){
        Intent a = new Intent(MainActivity.this,Activity_map.class);
        startActivity(a);
    }
}
