package com.coco;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.coco.annotation.StatisticsAnnotation;

/**
 * Created by wind on 2018/5/26.
 */

public class ClickStatisticsDemoActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
    }

    @StatisticsAnnotation("clickme")
    public void clickMe(View view){
        Log.e("ClickStatDemoActivity","clickMe");
    }
}
