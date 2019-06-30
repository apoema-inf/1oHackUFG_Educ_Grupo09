package br.ufg.group9.pevb.ui.home.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.adapter.InternshipAdapter
import br.ufg.group9.pevb.adapter.ItemListener
import br.ufg.group9.pevb.base.BaseFragment
import br.ufg.group9.pevb.model.Internship
import br.ufg.group9.pevb.util.EndlessRecyclerViewScrollListener
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment: BaseFragment<MainViewModel>() {

    private lateinit var mListAdapter: InternshipAdapter

    private val itemListener = object : ItemListener<Internship>{
        override fun onClick(item: Internship) {
            //Select item
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mListAdapter = InternshipAdapter(itemListener)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        list.setHasFixedSize(true)
        list.layoutManager = LinearLayoutManager(context)
        list.adapter = mListAdapter

        list.addOnScrollListener(object :
            EndlessRecyclerViewScrollListener(list.layoutManager as LinearLayoutManager){
            override fun onLoadMore(page: Int, totalItemsCount: Int, view: RecyclerView?) {
                //Get more data
            }
        })

        swipe_layout.setColorSchemeColors(
            ContextCompat.getColor(activity!!, R.color.colorPrimary),
            ContextCompat.getColor(activity!!, R.color.colorAccent),
            ContextCompat.getColor(activity!!, R.color.colorPrimaryDark))

        swipe_layout.setOnRefreshListener {
            //Update list
        }
    }

    override fun containerViewModel(): MainViewModel {
        return ViewModelProviders.of(this).get(MainViewModel::class.java)
    }
}