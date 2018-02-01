package com.codility.splashscreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity.CENTER
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialise TextView Programmatically
        setTextView()
        //Initialise Button Programmatically
        setButtonWithListener()
    }

    private fun setButtonWithListener() {
        btExit.setBackgroundColor(resources.getColor(R.color.colorPrimary))
        btExit.setTextColor(resources.getColor(android.R.color.white))
        btExit.textSize = 20F
        btExit.gravity = CENTER
        btExit.setOnClickListener(View.OnClickListener {
            finish()
        })
    }

    private fun setTextView() {
        tvTextView.text = getString(R.string.app_text)
        tvTextView.textSize = 35F
        tvTextView.gravity = CENTER
        tvTextView.setTextColor(resources.getColor(R.color.colorAccent))
    }
}