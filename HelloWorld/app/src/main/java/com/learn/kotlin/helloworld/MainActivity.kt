package com.learn.kotlin.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //Implement button onclicklistener android kotlin : To get the Toast message on click of button

        //1. Get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        //2. Set on-click listener
        btn_click_me.setOnClickListener {
            //Toast : Message which appears on the screen
            Toast.makeText(this@MainActivity, "Toast Message: SShukla!!! clicked me.", Toast.LENGTH_SHORT).show()
        }

         */

        /*//Implement button onclicklistener android kotlin : To get the Count of button clicked instead of Name
        val btn_click_me = findViewById(R.id.button) as Button
        val my_text_view = findViewById(R.id.textView) as TextView
        var timeClicked = 0
        btn_click_me.setOnClickListener {
            timeClicked = timeClicked + 1
            my_text_view.text = timeClicked.toString()
        }*/

        //Code refactoring by removing the Button and TextView references using ID
        var timeClicked = 0
        button.setOnClickListener {
            timeClicked += 1
            textView.text = timeClicked.toString()
        }

    }
}