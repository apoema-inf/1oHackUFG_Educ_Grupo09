package br.ufg.group9.pevb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.model.Internship

class InternshipAdapter (private val itemListener: ItemListener<Internship>) :
    RecyclerView.Adapter<InternshipAdapter.InternshipViewHolder>() {

    private val internships = mutableListOf<Internship>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InternshipViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val noteView = inflater.inflate(R.layout.adapter_internship, parent, false)
        return InternshipViewHolder(noteView)
    }

    override fun getItemCount(): Int = internships.size

    override fun onBindViewHolder(holder: InternshipViewHolder, position: Int) {
        val internship = internships[position]

        holder.fillData(internship)
        holder.itemView.setOnClickListener { itemListener.onClick(internship) }
    }

    inner class InternshipViewHolder(noteView: View): RecyclerView.ViewHolder(noteView) {

        fun fillData(data: Internship) {

        }
    }
}