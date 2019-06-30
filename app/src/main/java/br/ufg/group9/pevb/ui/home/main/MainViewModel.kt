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
        val data1 = Internship(
            "FUNAPE",
            "Vagas sistemas de informação",
            4.5,
            "2.500",
            "7km",
            "32h",
            "http://192.168.191.154/images/FUNAPE.png")
        val data2 = Internship(
            "Linx",
            "Estágio sistemas de informação",
            2.5,
            "800",
            "14km",
            "22:55h",
            "http://192.168.191.154/images/Linx.jpeg")
        val data3 = Internship(
            "VULCANUM",
            "Estágio Eng. de informação",
            3.5,
            "750",
            "2km",
            "34h",
            "http://192.168.191.154/images/VULCANUM.png")
        val data4 = Internship(
            "FUNAPE",
            "Vagas sistemas de informação",
            4.5,
            "2.500",
            "7km",
            "32h",
            "http://192.168.191.154/images/FUNAPE.png")
        val data5 = Internship(
            "Linx",
            "Estágio sistemas de informação",
            2.5,
            "800",
            "14km",
            "22:55h",
            "http://192.168.191.154/images/Linx.jpeg")
        val data6 = Internship(
            "VULCANUM",
            "Estágio Eng. de informação",
            3.5,
            "750",
            "2km",
            "34h",
            "http://192.168.191.154/images/VULCANUM.png")
        val data7 = Internship(
            "FUNAPE",
            "Vagas sistemas de informação",
            4.5,
            "2.500",
            "7km",
            "32h",
            "http://192.168.191.154/images/FUNAPE.png")
        val data8 = Internship(
            "Linx",
            "Estágio sistemas de informação",
            2.5,
            "800",
            "14km",
            "22:55h",
            "http://192.168.191.154/images/Linx.jpeg")
        val data9 = Internship(
            "VULCANUM",
            "Estágio Eng. de informação",
            3.5,
            "750",
            "2km",
            "34h",
            "http://192.168.191.154/images/VULCANUM.png")
        list.add(data1)
        list.add(data2)
        list.add(data3)
        list.add(data4)
        list.add(data5)
        list.add(data6)
        list.add(data7)
        list.add(data8)
        list.add(data9)
        return list
    }

    fun getList() : LiveData<List<Internship>> {
        return listOfInternships
    }
}