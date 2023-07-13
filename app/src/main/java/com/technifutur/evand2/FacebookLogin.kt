package com.technifutur.evand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.technifutur.evand2.databinding.ActivityFacebookLoginBinding
import com.technifutur.evand2.databinding.ActivityMainBinding

class FacebookLogin : AppCompatActivity() {
    private lateinit var binding: ActivityFacebookLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFacebookLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.connexionButton.setOnClickListener {
            if (binding.editTextEmail.text.isEmpty()){
                showAlertDialog("E-mail")
            }
            else if (binding.editTextPassword.text.isEmpty()){
                showAlertDialog("Mot de passe")
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
        alertDialogBuilder.setMessage("$message manquant")

        alertDialogBuilder.setPositiveButton("OK") { dialog, which ->

        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}