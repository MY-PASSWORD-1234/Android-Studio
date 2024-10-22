package com.example.myapplicationv34

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.practica1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imagen1)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Thomas_Edison2.jpg/1200px-Thomas_Edison2.jpg")
            .into(imageView1)

        val button1 = findViewById<Button>(R.id.boton1)
        button1.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Thomas_Alva_Edison"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.imagen2)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e4/Lamborghini_Gallardo_5.2_%2708_%289402936597%29.jpg/1200px-Lamborghini_Gallardo_5.2_%2708_%289402936597%29.jpg")
            .into(imageView2)

        val button2 = findViewById<Button>(R.id.boton2)
        button2.setOnClickListener {
            val url2 = "https://es.wikipedia.org/wiki/Lamborghini"
            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse(url2))
            startActivity(intent2)
        }
        val imageView3 = findViewById<ImageView>(R.id.imagen3)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/e/ee/Porsche-Automarken-Logo.jpg")
            .into(imageView3)

        val button3 = findViewById<Button>(R.id.boton3)
        button3.setOnClickListener {
            val url3 = "https://es.wikipedia.org/wiki/Porsche"
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse(url3))
            startActivity(intent3)
        }
        val imageView4 = findViewById<ImageView>(R.id.imagen4)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Marc_Marquez_2023_Le_Mans_%28cropped%29.jpg/220px-Marc_Marquez_2023_Le_Mans_%28cropped%29.jpg")
            .into(imageView4)

        val button4 = findViewById<Button>(R.id.boton4)
        button4.setOnClickListener {
            val url4 = "https://es.wikipedia.org/wiki/Marc_M%C3%A1rquez"
            val intent4 = Intent(Intent.ACTION_VIEW, Uri.parse(url4))
            startActivity(intent4)
        }
    }
}
