package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


//This kotlin file is where we'r going to be handling user handling

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //How file is connected
        setContentView(R.layout.activity_main)

        // Display customized to show 'Hello from {name}'
        //get a reference to a button
        findViewById<Button>(R.id.button).setOnClickListener{

            //Get reference to the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
        findViewById<Button>(R.id.textstring).setOnClickListener {
            val txt = findViewById<EditText>(R.id.TextPersonName);
            val msg = txt.text.toString();
            findViewById<TextView>(R.id.textView).text = msg
            if(msg == ""){
                findViewById<TextView>(R.id.textView).text = "Hello from Habeebah"
            }

//            val txtView = findViewById<TextView>(R.id.textView).set
        }
        findViewById<Button>(R.id.viewcolor).setOnClickListener{
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundcolor).setBackgroundColor(getResources().getColor(R.color.cutegreen))

        }
        findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundcolor).setOnClickListener{
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundcolor).setBackgroundColor(getResources().getColor(R.color.purple_200))
            findViewById<TextView>(R.id.textView).text = "Hello from Habeebah"
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))

        }


    }
}