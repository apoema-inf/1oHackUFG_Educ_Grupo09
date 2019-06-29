package br.ufg.group9.pevb.ui.splash

import android.os.Build
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class SplashActivity: BaseActivity<SplashViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.colorPrimary)
        }

        viewModel.setHomeActivity(this)
    }

    override fun containerViewModel(): SplashViewModel {
        return ViewModelProviders.of(this).get(SplashViewModel::class.java)
    }
}