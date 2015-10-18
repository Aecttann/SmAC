package com.example.smac;
import java.io.File;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.DropBoxManager.Entry;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ToggleButton;
public class Alarm_setup extends Activity{
	String string_for_putting_extra_data_about_vibration_into_Accept = "";
	public static String SDCARD_DIRECTORY;
	public static String REPORTS_DIRECTORY;
	protected void onCreate(Bundle savedInstanceState) {
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setup_alarm);
		File sdCard = Environment.getExternalStorageDirectory();
		SDCARD_DIRECTORY = sdCard.getAbsolutePath();
		REPORTS_DIRECTORY = SDCARD_DIRECTORY + "/MyReports";
		// Create if necessary the desired folder
		File directory = new File (REPORTS_DIRECTORY);
		directory.mkdirs();
		Button destination_button = (Button) findViewById(R.id.button1);
		destination_button.getBackground().setAlpha(64);
<<<<<<< HEAD
		
		destination_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_map = new Intent (Alarm_setup.this, Destination_map.class);
				startActivity(intent_for_map);
			}
		});
		
=======
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
		Button ring_button = (Button) findViewById(R.id.button2);
		ring_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent intent_for_ring_button = new Intent();
				intent_for_ring_button.setAction(Intent.ACTION_GET_CONTENT);
				File file = new File(REPORTS_DIRECTORY);
				intent_for_ring_button.setDataAndType(Uri.fromFile(file),"audio/*");
				startActivityForResult(Intent.createChooser(intent_for_ring_button,"Open folder"), 0);
				
				
				/*
				Uri myUri = Uri.parse(Entry.getFile());
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(myUri, "audio/*");
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				startActivity(intent);
				*/
			}
		});
		ring_button.getBackground().setAlpha(64);
		Button next_button = (Button) findViewById(R.id.button3);
		next_button.getBackground().setAlpha(64);
		final ToggleButton toggle_button_for_vibration = (ToggleButton) findViewById(R.id.toggleButton1);
		toggle_button_for_vibration.setOnCheckedChangeListener(new OnCheckedChangeListener() {
		boolean variable_for_saving_toggle_button_status;
		
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if (isChecked)
					{
					toggle_button_for_vibration.setTextOn("Вибрация вкл.");
						variable_for_saving_toggle_button_status = true;
						string_for_putting_extra_data_about_vibration_into_Accept = " включена";
					}
				else
					{
						toggle_button_for_vibration.setTextOff("Вибрация выкл.");
						variable_for_saving_toggle_button_status = false;
						string_for_putting_extra_data_about_vibration_into_Accept = " выключена";
					}
			}
		});
		toggle_button_for_vibration.getBackground().setAlpha(68);
<<<<<<< HEAD
		final EditText edit_for_extra_time = (EditText) findViewById(R.id.editText2);
		edit_for_extra_time.getBackground().setAlpha(64);
		/**
		 * Пока что будет юзаться для проверки работы будильника
		 */
		final EditText edit_for_extra_waking_day = (EditText) findViewById(R.id.editText1);
		edit_for_extra_waking_day.getBackground().setAlpha(64);
		final EditText edit_for_alarm_name = (EditText) findViewById(R.id.editText3);
		edit_for_alarm_name.getBackground().setAlpha(64);
		final EditText edit_for_extra_waking_hour = (EditText) findViewById(R.id.editText4);
		edit_for_extra_waking_hour.getBackground().setAlpha(64);
		final EditText edit_for_extra_waking_minute = (EditText) findViewById(R.id.editText5);
		edit_for_extra_waking_minute.getBackground().setAlpha(64);
=======
		final EditText edit_for_time_when_user_needs_to_be_in_place = (EditText) findViewById(R.id.editText1);
		edit_for_time_when_user_needs_to_be_in_place.getBackground().setAlpha(64);
		/**
		 * Пока что будет юзаться для проверки работы будильника
		 */
		final EditText edit_for_extra_waking_time = (EditText) findViewById(R.id.editText2);
		edit_for_extra_waking_time.getBackground().setAlpha(64);
		final EditText edit_for_alarm_name = (EditText) findViewById(R.id.editText3);
		edit_for_alarm_name.getBackground().setAlpha(64);
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
		next_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String clon;
				// TODO Auto-generated method stub
				Intent intent_for_alarm_accept = new Intent (Alarm_setup.this, Accepting_Information.class);
//				intent_for_alarm_accept.putExtra("Key for destination", edit_for_extra_waking_time.getText().toString());
<<<<<<< HEAD
				intent_for_alarm_accept.putExtra("Key for extra time", edit_for_extra_time.getText().toString());
				intent_for_alarm_accept.putExtra("Key for hour", edit_for_extra_waking_hour.getText().toString());
				intent_for_alarm_accept.putExtra("Key for minute", edit_for_extra_waking_minute.getText().toString());
				intent_for_alarm_accept.putExtra("Key for day", edit_for_extra_waking_day.getText().toString());
=======
				intent_for_alarm_accept.putExtra("Key for time", edit_for_time_when_user_needs_to_be_in_place.getText().toString());
				intent_for_alarm_accept.putExtra("Key for extra time", edit_for_extra_waking_time.getText().toString());
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
//				intent_for_alarm_accept.putExtra("Key for ringtone", edit_for_extra_waking_time.getText().toString());
				intent_for_alarm_accept.putExtra("Key for vibration_mode_selected", string_for_putting_extra_data_about_vibration_into_Accept);
				intent_for_alarm_accept.putExtra("Key for alarm name", edit_for_alarm_name.getText().toString());
				startActivity(intent_for_alarm_accept);
			}
		});
		
	}
}