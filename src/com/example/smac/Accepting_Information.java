package com.example.smac;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Accepting_Information extends Activity {
	Toast mToast;
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accepting_alarm);
		//TextView view_for_destination = (TextView) findViewById(R.id.textView1);
		//view_for_destination.setText(getIntent().getExtras().getString("Key for destination"));
		final TextView view_for_wake_up_day = (TextView) findViewById(R.id.textView2);
		view_for_wake_up_day.setText(getIntent().getExtras().getString("Key for day"));
		final TextView view_for_hour = (TextView) findViewById(R.id.textView7);
		view_for_hour.setText(getIntent().getExtras().getString("Key for hour"));
		final TextView view_for_minute = (TextView) findViewById(R.id.textView8);;
		view_for_minute.setText(getIntent().getExtras().getString("Key for minute"));
		TextView view_for_extra_time = (TextView) findViewById(R.id.textView3);
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
		//TextView view_for_ringtone = (TextView) findViewById(R.id.textView4);
		//view_for_ringtone.setText(getIntent().getExtras().getString("Key for ringtone"));
		TextView view_for_vibration_mode = (TextView) findViewById(R.id.textView5);
		view_for_vibration_mode.setText(getIntent().getExtras().getString("Key for vibration_mode_selected"));
		TextView view_for_alarm_name= (TextView) findViewById(R.id.textView6);
		view_for_alarm_name.setText(getIntent().getExtras().getString("Key for alarm name"));
	
	 OnClickListener alarm_l = new OnClickListener() {
        public void onClick(View v) {
            // When the alarm goes off, we want to broadcast an Intent to our
            // BroadcastReceiver.  Here we make an Intent with an explicit class
            // name to have our own receiver (which has been published in
            // AndroidManifest.xml) instantiated and called, and then create an
            // IntentSender to have the intent executed as a broadcast.
            Intent intent = new Intent(Accepting_Information.this, Alarm.class);
            PendingIntent sender = PendingIntent.getBroadcast(Accepting_Information.this,
                    0, intent, 0);
            
            String day = (String) view_for_wake_up_day.getText();
            String hour = (String) view_for_hour.getText();
            String minute = (String) view_for_minute.getText();
            int day_int = Integer.parseInt(day);
            int hour_int = Integer.parseInt(hour);
            int minute_int = Integer.parseInt(minute);
            
            GregorianCalendar calendar = new GregorianCalendar(1970, Calendar.OCTOBER, 9, 0, 0);
            calendar.set(2015, Calendar.OCTOBER, day_int, hour_int, minute_int);

            // Schedule the alarm!
            AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
            am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);

            // Tell the user about what we did.
            if (mToast != null) {
                mToast.cancel();
            }
            mToast = Toast.makeText(Accepting_Information.this, R.string.one_shot_scheduled,
                    Toast.LENGTH_LONG);
            mToast.show();
        }
    }; // onClickListener
    Button button_for_start = (Button)findViewById(R.id.button_Start);
    button_for_start.setOnClickListener(alarm_l);
    
	}
}