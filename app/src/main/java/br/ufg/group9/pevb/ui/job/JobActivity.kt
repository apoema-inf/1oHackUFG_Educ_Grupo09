package br.ufg.group9.pevb.ui.job

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class JobActivity : BaseActivity<JobViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_job)
    }

    override fun containerViewModel(): JobViewModel {
        return ViewModelProviders.of(this).get(JobViewModel::class.java)
    }
}