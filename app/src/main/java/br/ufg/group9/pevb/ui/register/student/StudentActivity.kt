package br.ufg.group9.pevb.ui.register.student

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class StudentActivity: BaseActivity<StudentViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitty_student)

    }

    override fun containerViewModel(): StudentViewModel {
        return ViewModelProviders.of(this).get(StudentViewModel::class.java)
    }
}