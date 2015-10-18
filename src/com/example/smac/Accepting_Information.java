package com.example.smac;
<<<<<<< HEAD
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
=======
<<<<<<< HEAD
import java.util.Calendar;
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
<<<<<<< HEAD
import android.media.MediaPlayer;
=======
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Accepting_Information extends Activity {
	Toast mToast;
=======
import android.widget.TextView;
import android.widget.Toast;
public class Accepting_Information extends Activity {
	Toast my_toast;
=======
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class Accepting_Information extends Activity {
>>>>>>> f3c41813c303795fc1996170f731f021d29aa99e
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accepting_alarm);
		//TextView view_for_destination = (TextView) findViewById(R.id.textView1);
		//view_for_destination.setText(getIntent().getExtras().getString("Key for destination"));
<<<<<<< HEAD
		final TextView view_for_wake_up_day = (TextView) findViewById(R.id.textView2);
		view_for_wake_up_day.setText(getIntent().getExtras().getString("Key for day"));
		final TextView view_for_hour = (TextView) findViewById(R.id.textView7);
		view_for_hour.setText(getIntent().getExtras().getString("Key for hour"));
		final TextView view_for_minute = (TextView) findViewById(R.id.textView8);;
		view_for_minute.setText(getIntent().getExtras().getString("Key for minute"));
		TextView view_for_extra_time = (TextView) findViewById(R.id.textView3);
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
=======
		TextView view_for_wake_up_time = (TextView) findViewById(R.id.textView2);
		view_for_wake_up_time.setText(getIntent().getExtras().getString("Key for time"));
		TextView view_for_extra_time = (TextView) findViewById(R.id.textView3);
<<<<<<< HEAD
		/**
		 * Ну вот хз я, как сделать по-человечески(да и для слабаков это...),
		 * поэтому будем юзать костыли:3
		 */
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
		final String for_set_time_for_alarm = view_for_extra_time.getText().toString();
		
		final int time_int = Integer.parseInt(for_set_time_for_alarm);
		
=======
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
>>>>>>> f3c41813c303795fc1996170f731f021d29aa99e
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
		//TextView view_for_ringtone = (TextView) findViewById(R.id.textView4);
		//view_for_ringtone.setText(getIntent().getExtras().getString("Key for ringtone"));
		TextView view_for_vibration_mode = (TextView) findViewById(R.id.textView5);
		view_for_vibration_mode.setText(getIntent().getExtras().getString("Key for vibration_mode_selected"));
		TextView view_for_alarm_name= (TextView) findViewById(R.id.textView6);
		view_for_alarm_name.setText(getIntent().getExtras().getString("Key for alarm name"));
<<<<<<< HEAD
	
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
    
=======
<<<<<<< HEAD
		String time = view_for_extra_time.getText().toString();
		
		/*
		btn_accept.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
			}
		});*/
		
		OnClickListener start_alarm_listener = new OnClickListener() {
	        public void onClick(View v) {
	            // When the alarm goes off, we want to broadcast an Intent to our
	            // BroadcastReceiver.  Here we make an Intent with an explicit class
	            // name to have our own receiver (which has been published in
	            // AndroidManifest.xml) instantiated and called, and then create an
	            // IntentSender to have the intent executed as a broadcast.
	            Intent intent = new Intent(Accepting_Information.this, Alarm.class);
	            PendingIntent sender = PendingIntent.getBroadcast(Accepting_Information.this,
	                    0, intent, 0);

	            // We want the alarm to go off 30 seconds from now.
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTimeInMillis(System.currentTimeMillis());
	            if (for_set_time_for_alarm.equals(":") && for_set_time_for_alarm.equals("1"))
	            calendar.add(Calendar.SECOND, time_int);
	            // Schedule the alarm!
	            AlarmManager am = (AlarmManager)getSystemService(ALARM_SERVICE);
	            am.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), sender);

	            // Tell the user about what we did.
	            Toast my_toast = null;
	            if (my_toast != null)
	            	{
	            		my_toast.cancel();
	            	}
	            my_toast = Toast.makeText(Accepting_Information.this, R.string.information_in_da_alarm,
	                    Toast.LENGTH_LONG);
	            my_toast.show();
	        }
	    }; // onClickListener
	    
	    Button btn_accept = (Button) findViewById(R.id.buttonStart);
	    btn_accept.setOnClickListener(start_alarm_listener);
	    
=======
>>>>>>> f3c41813c303795fc1996170f731f021d29aa99e
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
	}
}