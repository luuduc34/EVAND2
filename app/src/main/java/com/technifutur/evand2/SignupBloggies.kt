package com.technifutur.evand2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.technifutur.evand2.databinding.ActivityFacebookLoginBinding
import com.technifutur.evand2.databinding.ActivitySignupBloggiesBinding

class SignupBloggies : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBloggiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBloggiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inscriptionButton.setOnClickListener {
            if (binding.editTextEmail.text.isEmpty()){
                showAlertDialog("E-mail ne doit pas etre vide")
            }
            else if (!binding.editTextEmail.text.contains("@")){
                showAlertDialog("L'e-mail est invalide")
            }
            else if (binding.editTextLogin.text.isEmpty()){
                showAlertDialog("Le login n'a pas été rempli")
            }
            else if ((binding.editTextPassword.text.toString() != binding.editTextConfirmation.text.toString())){
                showAlertDialog("Les mots de passe ne correspondent pas")
            }
            else{
                val intent = Intent(this, ConnectedBloggies::class.java)
                val login = binding.editTextLogin.text.toString()
                intent.putExtra("textValue", login)
                startActivity(intent)
            }
        }
    }
    private fun showAlertDialog(message:String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("ERREUR")
        alertDialogBuilder.setMessage("$message")

        alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
            // Logique à exécuter lorsque l'utilisateur clique sur le bouton "OK"
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}