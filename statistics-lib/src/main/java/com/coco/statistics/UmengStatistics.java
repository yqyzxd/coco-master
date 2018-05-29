package com.coco.statistics;

import android.util.Log;

/**
 * Created by wind on 2018/5/28.
 */

public class UmengStatistics {
    public static final String TAG="UmengStatistics";
    public static void onEvent(String label) {
        Log.e(TAG,label);
    }
}
