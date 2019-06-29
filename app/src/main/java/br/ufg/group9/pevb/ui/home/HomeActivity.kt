package br.ufg.group9.pevb.ui.home

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class HomeActivity: BaseActivity<HomeViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun containerViewModel(): HomeViewModel {
        return ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }
}