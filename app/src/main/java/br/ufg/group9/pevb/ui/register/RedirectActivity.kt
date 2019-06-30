package br.ufg.group9.pevb.ui.register

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class RedirectActivity: BaseActivity<RedirectViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redirect)
    }

    override fun containerViewModel(): RedirectViewModel {
        return ViewModelProviders.of(this).get(RedirectViewModel::class.java)
    }
}