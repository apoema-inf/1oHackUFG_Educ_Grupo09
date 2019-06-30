package br.ufg.group9.pevb.ui.register.professional

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class ProfessionalActivity: BaseActivity<ProfessionalViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_professional)
    }

    override fun containerViewModel(): ProfessionalViewModel {
        return ViewModelProviders.of(this).get(ProfessionalViewModel::class.java)
    }
}