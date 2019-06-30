package br.ufg.group9.pevb

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import br.ufg.group9.pevb.di.netModule
import br.ufg.group9.pevb.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PEVBApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PEVBApplication)
            modules(listOf(netModule, repositoryModule))
        }

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}
