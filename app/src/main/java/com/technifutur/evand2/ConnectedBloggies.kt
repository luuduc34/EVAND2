package com.technifutur.evand2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.technifutur.evand2.databinding.ActivityConnectedBloggiesBinding
import com.technifutur.evand2.databinding.ActivitySignupBloggiesBinding

class ConnectedBloggies : AppCompatActivity() {
    private lateinit var binding: ActivityConnectedBloggiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConnectedBloggiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val textValue = intent.getStringExtra("textValue")

        binding.textWelcome.text = "Bienvenue $textValue"
    }
}