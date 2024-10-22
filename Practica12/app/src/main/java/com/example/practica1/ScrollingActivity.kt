package com.example.practica1

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1.databinding.ActivityScrolling2Binding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrolling2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrolling2Binding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}