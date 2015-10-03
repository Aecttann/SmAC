package com.example.smac;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class Accepting_Information extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated constructor stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.accepting_alarm);
		//TextView view_for_destination = (TextView) findViewById(R.id.textView1);
		//view_for_destination.setText(getIntent().getExtras().getString("Key for destination"));
		TextView view_for_wake_up_time = (TextView) findViewById(R.id.textView2);
		view_for_wake_up_time.setText(getIntent().getExtras().getString("Key for time"));
		TextView view_for_extra_time = (TextView) findViewById(R.id.textView3);
		view_for_extra_time.setText(getIntent().getExtras().getString("Key for extra time"));
		//TextView view_for_ringtone = (TextView) findViewById(R.id.textView4);
		//view_for_ringtone.setText(getIntent().getExtras().getString("Key for ringtone"));
		TextView view_for_vibration_mode = (TextView) findViewById(R.id.textView5);
		view_for_vibration_mode.setText(getIntent().getExtras().getString("Key for vibration_mode_selected"));
		TextView view_for_alarm_name= (TextView) findViewById(R.id.textView6);
		view_for_alarm_name.setText(getIntent().getExtras().getString("Key for alarm name"));
	}
}