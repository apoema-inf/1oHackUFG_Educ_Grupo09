package br.ufg.group9.pevb.ui.login

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class LoginActivity: BaseActivity<LoginViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun containerViewModel(): LoginViewModel {
        return ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }
}