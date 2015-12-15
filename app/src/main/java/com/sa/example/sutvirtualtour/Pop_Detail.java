package com.sa.example.sutvirtualtour;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by sudsangdaow on 14/12/2558.
 */
public class Pop_Detail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height =  dm.heightPixels;

        getWindow().setLayout((int)width*2,(int)height*3);

    }




}
