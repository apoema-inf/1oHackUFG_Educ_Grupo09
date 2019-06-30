package br.ufg.group9.pevb.ui.login

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity
import br.ufg.group9.pevb.ui.home.HomeActivity
import br.ufg.group9.pevb.ui.register.RedirectActivity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: BaseActivity<LoginViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_up.setOnClickListener {
            viewModel.setRegisterActivity(this, RedirectActivity())
        }

        button_login.setOnClickListener {
            viewModel.setHomeActivity(this)
        }
    }

    override fun containerViewModel(): LoginViewModel {
        return ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }
}