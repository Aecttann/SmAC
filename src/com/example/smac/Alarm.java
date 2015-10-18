package com.example.smac;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
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
public class Alarm extends BroadcastReceiver
{
	
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, R.string.one_shot_received, Toast.LENGTH_LONG).show();
        MediaPlayer mp_for_alarm_dont_sing = MediaPlayer.create(context,R.raw.data_don_t_sing);
        mp_for_alarm_dont_sing.start();
        mp_for_alarm_dont_sing.setLooping(true);
        /*
		Vibrator v = (Vibrator) getSystemService(context, Context.VIBRATOR_SERVICE);
		v.vibrate(10000);
		*/
    }
}