package com.example.holakotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var tts: TextToSpeech? = null
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.textView).text = "Listo!"
        } else {
            findViewById<TextView>(R.id.textView).text = "No
            disponible :("
        }
    }
    private fun speack() {
        var message: String =
            findViewById<TextView>(R.id.textView).text.toString()
        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.textView).text = "Listo!"
            tts!!.setLanguage(Locale.US)
        } else {
            findViewById<TextView>(R.id.textView).text = "No
            disponible :("
        }
    }
    }
