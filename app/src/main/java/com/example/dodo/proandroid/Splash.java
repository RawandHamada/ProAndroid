package com.example.dodo.proandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by روند حمادة on 07/19/2017.
 */

public class Splash extends MainActivity {

        private Intent myintent;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            myintent = new Intent(this, MainActivity.class);
            splashScreen(1000); }

        public void splashScreen (final int x)
        {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(x);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    startActivity(myintent);
                    finish();
                }
            }).run();
        }

    }

