package com.example.gamerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gamerapp.databinding.LoginBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : LoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}