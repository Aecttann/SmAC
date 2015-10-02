package com.example.smac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
 
public class Splash extends Activity
{
    /** 
     * �� ������ ���� ����� ���� ��� ������� ������,
     * �� �� 3,143�� ����� � ����� � ��� ��-������. 
     * */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
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