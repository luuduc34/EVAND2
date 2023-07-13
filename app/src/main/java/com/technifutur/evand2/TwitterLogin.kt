package com.technifutur.evand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.technifutur.evand2.databinding.ActivityFacebookLoginBinding
import com.technifutur.evand2.databinding.ActivityTwitterLoginBinding

class TwitterLogin : AppCompatActivity() {
    private lateinit var binding: ActivityTwitterLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwitterLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.connexionButton.setOnClickListener {
            if (binding.editTextEmail.text.isEmpty()){
                showAlertDialog("E-mail manquant")
            }
            else if (binding.editTextPassword.text.isEmpty()){
                showAlertDialog("Mot de passe manquant")
            }
            else{
                val intent = Intent(this, SocialNetworkConnected::class.java)
                startActivity(intent)
            }
        }
    }
    private fun showAlertDialog(message:String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("ERREUR")
        alertDialogBuilder.setMessage("$message")

        alertDialogBuilder.setPositiveButton("OK") { dialog, which ->

        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}