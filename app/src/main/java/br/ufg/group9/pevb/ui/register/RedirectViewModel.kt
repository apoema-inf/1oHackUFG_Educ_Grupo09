package br.ufg.group9.pevb.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

class RedirectViewModel: ViewModel() {

    fun setRegisterActivity(start: AppCompatActivity, destiny: AppCompatActivity) {
        val intent = Intent(start, destiny::class.java)
        start.startActivity(intent)
    }
}