package br.ufg.group9.pevb.ui.register

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity
import br.ufg.group9.pevb.ui.register.company.CompanyActivity
import br.ufg.group9.pevb.ui.register.professional.ProfessionalActivity
import br.ufg.group9.pevb.ui.register.student.StudentActivity
import kotlinx.android.synthetic.main.activity_redirect.*

class RedirectActivity: BaseActivity<RedirectViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redirect)

        student_from.setOnClickListener {
            viewModel.setRegisterActivity(this, StudentActivity())
        }

        professional_form.setOnClickListener {
            viewModel.setRegisterActivity(this, ProfessionalActivity())
        }

        company_form.setOnClickListener {
            viewModel.setRegisterActivity(this, CompanyActivity())
        }
    }

    override fun containerViewModel(): RedirectViewModel {
        return ViewModelProviders.of(this).get(RedirectViewModel::class.java)
    }
}