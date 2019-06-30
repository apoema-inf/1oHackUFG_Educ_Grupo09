package br.ufg.group9.pevb.ui.home

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelProviders
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.adapter.SectionsPagerAdapter
import br.ufg.group9.pevb.base.BaseActivity
import br.ufg.group9.pevb.ui.home.main.MainFragment
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity: BaseActivity<HomeViewModel>() {

    private lateinit var mDrawerLayout: DrawerLayout
    private lateinit var mSectionPagesAdapter : SectionsPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp)
        }

        mDrawerLayout = findViewById(R.id.drawer_layout)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            // set item as selected to persist highlight
            menuItem.isChecked = true
            // close drawer when item is tapped
            mDrawerLayout.closeDrawers()

            // Handle navigation view item clicks here.
            when (menuItem.itemId) {

                R.id.nav_profile -> {
                    Toast.makeText(this, "Perfil", Toast.LENGTH_LONG).show()
                }
                R.id.nav_internship -> {
                    Toast.makeText(this, "Estágio", Toast.LENGTH_LONG).show()
                }
                R.id.nav_institutional -> {
                    Toast.makeText(this, "Institucional", Toast.LENGTH_LONG).show()
                }
            }

            menuItem.isChecked = false
            true
        }

        mSectionPagesAdapter = SectionsPagerAdapter(supportFragmentManager)
        fillPages()

        container_home.adapter = mSectionPagesAdapter
        tab_detail.setupWithViewPager(container_home)
        container_home.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_detail))
        tab_detail.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container_home))
    }

    private fun fillPages() {

        mSectionPagesAdapter.addPages(MainFragment(), getString(R.string.estagio))
        mSectionPagesAdapter.addPages(MainFragment(), getString(R.string.ensino))
        mSectionPagesAdapter.addPages(MainFragment(), getString(R.string.emprego))
    }

    //appbar - toolbar button click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                mDrawerLayout.openDrawer(GravityCompat.START)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun containerViewModel(): HomeViewModel {
        return ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }
}