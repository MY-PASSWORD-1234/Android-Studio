package com.example.acsionman

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

        lateinit var button : Button
        lateinit var textView: TextView
        var jose  = 0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            button = findViewById(R.id.Mamelungas)
            textView = findViewById(R.id.textView)
            button.setOnClickListener{
                jose += 1
                textView.setText("" +(Integer.parseInt(jose.toString())) )

            }
        }
    }
