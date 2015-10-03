package com.example.smac;
import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class Accepting_Information extends Activity {
	Toast my_toast;
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accepting_alarm);
		//TextView view_for_destination = (TextView) findViewById(R.id.textView1);
		//view_for_destination.setText(getIntent().getExtras().getString("Key for destination"));
		TextView view_for_wake_up_time = (TextView) findViewById(R.id.textView2);
		view_for_wake_up_time.setText(getIntent().getExtras().getString("Key for time"));
		TextView view_for_extra_time = (TextView) findViewById(R.id.textView3);
		/**
		 * Ну вот хз я, как сделать по-человечески(да и для слабаков это...),
		 * поэтому будем юзать костыли:3
		 */
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
		final String for_set_time_for_alarm = view_for_extra_time.getText().toString();
		
		final int time_int = Integer.parseInt(for_set_time_for_alarm);
		
		//TextView view_for_ringtone = (TextView) findViewById(R.id.textView4);
		//view_for_ringtone.setText(getIntent().getExtras().getString("Key for ringtone"));
		TextView view_for_vibration_mode = (TextView) findViewById(R.id.textView5);
		view_for_vibration_mode.setText(getIntent().getExtras().getString("Key for vibration_mode_selected"));
		TextView view_for_alarm_name= (TextView) findViewById(R.id.textView6);
		view_for_alarm_name.setText(getIntent().getExtras().getString("Key for alarm name"));
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
	    
	}
}