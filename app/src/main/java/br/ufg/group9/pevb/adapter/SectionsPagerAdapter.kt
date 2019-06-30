package br.ufg.group9.pevb.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    private val pages: ArrayList<Fragment> = ArrayList()
    private val titles: ArrayList<String> = ArrayList()

    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    fun addPages (f: Fragment, title: String) {
        pages.add(f)
        titles.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (titles[position]) {
            "Estágio" -> { /*Change theme*/ }
            "Ensino" -> { /*Change theme*/ }
            "Emprego" -> { /*Change theme*/ }
        }
        return titles[position]
    }
}