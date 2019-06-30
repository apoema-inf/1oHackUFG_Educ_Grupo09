package br.ufg.group9.pevb.ui.home

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel

class HomeViewModel: ViewModel() {

    fun swapListFragment(activity: AppCompatActivity, fragment: Fragment, containerFragment: Int) {
        activity.supportFragmentManager
            .popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        activity.supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(containerFragment, fragment)
            .commit()

        activity.supportFragmentManager.executePendingTransactions()
    }
}