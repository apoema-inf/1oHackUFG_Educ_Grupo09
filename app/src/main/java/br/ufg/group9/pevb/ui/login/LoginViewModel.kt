package br.ufg.group9.pevb.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import br.ufg.group9.pevb.ui.home.HomeActivity

class LoginViewModel: ViewModel() {

    fun setRegisterActivity(start: AppCompatActivity, destiny: AppCompatActivity) {
        val intent = Intent(start, destiny::class.java)
        start.startActivity(intent)
    }

    fun setHomeActivity (activity: AppCompatActivity) {
        val intent = Intent(activity, HomeActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        activity.startActivity(intent)
        activity.finish()
    }
}