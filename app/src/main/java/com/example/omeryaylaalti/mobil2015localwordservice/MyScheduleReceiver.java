package com.example.omeryaylaalti.mobil2015localwordservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Calendar;

/**
 * Created by ozlemyaylaalti on 19/02/15.
 */
public class MyScheduleReceiver extends BroadcastReceiver {

    // restart service every 30 seconds
    private static final long REPEAT_TIME = 1000 * 30;

    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmManager service = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent i =new Intent(context, MyStartServiceReceiver.class);
        PendingIntent pending = PendingIntent.getBroadcast(context,0,i,PendingIntent.FLAG_CANCEL_CURRENT);
        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.SECOND,30);

        service.setInexactRepeating(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(),REPEAT_TIME,pending);

    }

}
