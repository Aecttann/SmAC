package com.example.smac;
import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
public class Main extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		getSupportActionBar().hide();
		this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
		Button btn_for_alarm_setup = (Button) findViewById(R.id.button1);
		btn_for_alarm_setup.setTransformationMethod(null);
<<<<<<< HEAD
=======
		Button btn_for_final_accept = (Button) findViewById(R.id.buttonStart);
		btn_for_final_accept.setTransformationMethod(null);
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
		btn_for_alarm_setup.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_alarm_setup = new Intent (Main.this, Alarm_setup.class);
				startActivity(intent_for_alarm_setup);
			}
		});
		Button btn_about = (Button) findViewById(R.id.button2);
		btn_about.setTransformationMethod(null);
		btn_about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_about = new Intent (Main.this, About.class);
				startActivity(intent_for_about);
			}
		});
		Button btn_exit = (Button) findViewById(R.id.button3);
		btn_exit.setTransformationMethod(null);
		btn_exit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.exit(0);
<<<<<<< HEAD
				
			}
		});
=======
			}
		});
		
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}