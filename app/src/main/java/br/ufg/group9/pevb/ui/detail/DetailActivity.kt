package br.ufg.group9.pevb.ui.detail

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.base.BaseActivity

class DetailActivity : BaseActivity<DetailViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    override fun containerViewModel(): DetailViewModel {
        return ViewModelProviders.of(this).get(DetailViewModel::class.java)
    }
}