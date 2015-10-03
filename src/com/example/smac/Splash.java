package com.example.smac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
 
public class Splash extends Activity
{
    /** 
     * Не лапать этот класс даже под страхом смерти,
     * бо по 3,143дЕ пойдёт и сплэш и ещё шо-нибудь. 
     * */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Thread logoTimer = new Thread()
        {
            public void run()
            {
                try
                {
                    int logoTimer = 0;
                    while(logoTimer < 900)
                    {
                        sleep(50);
                        logoTimer = logoTimer +100;
                    };
                    startActivity(new Intent("com.wazup.CLEARSCREEN"));
                } 
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                }
            }
        };
        logoTimer.start();
    }
}