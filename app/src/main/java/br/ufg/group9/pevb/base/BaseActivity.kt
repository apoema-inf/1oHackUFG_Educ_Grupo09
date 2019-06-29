package br.ufg.group9.pevb.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel

abstract class BaseActivity <VM: ViewModel>: AppCompatActivity() {

    lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.viewModel = containerViewModel()
    }

    abstract fun containerViewModel(): VM
}