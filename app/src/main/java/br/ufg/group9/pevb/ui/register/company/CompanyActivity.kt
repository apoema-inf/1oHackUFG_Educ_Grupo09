package br.ufg.group9.pevb.ui.register.company

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class CompanyActivity: BaseActivity<CompanyViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_company)
    }

    override fun containerViewModel(): CompanyViewModel {
        return ViewModelProviders.of(this).get(CompanyViewModel::class.java)
    }
}