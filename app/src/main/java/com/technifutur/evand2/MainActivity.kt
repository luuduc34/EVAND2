package com.technifutur.evand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.technifutur.evand2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.twitterButton.setOnClickListener {
            val intent = Intent(this, TwitterLogin::class.java)
            startActivity(intent)
        }
        binding.facebookButton.setOnClickListener {
            val intent = Intent(this, FacebookLogin::class.java)
            startActivity(intent)
        }
        binding.bloggiesButton.setOnClickListener {
            val intent = Intent(this, SignupBloggies::class.java)
            startActivity(intent)
        }
    }

}