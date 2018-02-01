package com.codility.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity


/**
 * Created by Govind on 2/1/2018.
 */
class SplashActivity : AppCompatActivity() {
    private var mHandler: Handler? = null

    private val runnable: Runnable = Runnable {
        if (!isFinishing) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        //Initialize the Handler
        mHandler = Handler()
        //Navigate with delay
        mHandler!!.postDelayed(runnable, 3000)
    }

    public override fun onDestroy() {
        if (mHandler != null) {
            mHandler!!.removeCallbacks(runnable)
        }
        super.onDestroy()
    }
}