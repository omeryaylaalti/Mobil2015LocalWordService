package com.example.omeryaylaalti.mobil2015localwordservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by ozlemyaylaalti on 19/02/15.
 */
public class MyStartServiceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service = new Intent (context, LocalWordService.class);
        context.startService(service);
    }
}
