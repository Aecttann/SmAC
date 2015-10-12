package com.example.smac;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.webkit.WebView.FindListener;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.widget.Toast;

// Need the following import to get access to the app resources, since this
// class is in a sub-package.

/**
 * This is an example of implement an {@link BroadcastReceiver} for an alarm that
 * should occur once.
 * <p>
 * When the alarm goes off, we show a <i>Toast</i>, a quick message.
 */
public class Alarm extends Activity
{
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        Toast.makeText(Alarm.this, R.string.one_shot_received, Toast.LENGTH_LONG).show();
        MediaPlayer mp_for_alarm_dont_sing = MediaPlayer.create(Alarm.this, R.raw.data_don_t_sing);
        mp_for_alarm_dont_sing.start();
        mp_for_alarm_dont_sing.setLooping(true);
		Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		v.vibrate(2000);
    }
}