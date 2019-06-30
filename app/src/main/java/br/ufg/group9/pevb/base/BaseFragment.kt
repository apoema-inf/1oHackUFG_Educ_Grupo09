package br.ufg.group9.pevb.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment <VM: ViewModel>: Fragment() {

    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.viewModel = containerViewModel()
    }

    abstract fun containerViewModel(): VM
}