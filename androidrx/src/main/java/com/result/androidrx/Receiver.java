package com.result.androidrx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 贾焕雪 on 2016-12-29.
 */
public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String name = intent.getExtras().getString("name");
        Log.i("Recevier1", "接收到:"+name);
        abortBroadcast();   //Receiver1接收到广播后中断广播
    }
}
