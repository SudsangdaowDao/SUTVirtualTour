package com.sa.example.sutvirtualtour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activity_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_map2);

        ImageButton b = (ImageButton) findViewById(R.id.imageButtonFarm);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
        public  void onClick(View v){
                startActivity(new Intent(Activity_map.this,Pop_Detail.class));
            }
        });

    }



}
