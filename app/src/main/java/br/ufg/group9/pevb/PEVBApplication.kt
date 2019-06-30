package br.ufg.group9.pevb

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class PEVBApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}
