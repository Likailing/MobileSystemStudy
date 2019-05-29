package com.example.calendarreminddemo2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import gov.nist.javax.sip.header.To;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void click(View view){
//        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//
//        Intent intent = new Intent();
//        intent.setPackage(getPackageName());
//        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTimeInMillis(3000);
//
//        alarmManager.setWindow(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(),
//                AlarmManager.WINDOW_EXACT, pendingIntent);
        Toast.makeText(this, "你点击了", Toast.LENGTH_LONG).show();
    }
}
