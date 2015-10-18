package com.example.smac;

<<<<<<< HEAD

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
=======
import android.content.Context;
import android.content.Intent;
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
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
<<<<<<< HEAD
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
=======

public class Alarm extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, R.string.information_in_da_alarm, Toast.LENGTH_SHORT).show();
    }
}
>>>>>>> 0e8f92ca2c4cd9284611d02859692fd1a5b203cb
