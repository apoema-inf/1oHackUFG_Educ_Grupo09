package br.ufg.group9.pevb.ui.home.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.ufg.group9.pevb.model.Internship

class MainViewModel: ViewModel() {
    private val listOfInternships: MutableLiveData<List<Internship>> by lazy {
        MutableLiveData<List<Internship>>().also { mutableList ->
            viewModelScope.let {
                mutableList.value = loadingList()
            }
        }
    }

    private fun loadingList(): List<Internship>? {
        //Consumes service
        val list = mutableListOf<Internship>()
//        val data1 = Internship()
        return list
    }

    fun getList() : LiveData<List<Internship>> {
        return listOfInternships
    }
}