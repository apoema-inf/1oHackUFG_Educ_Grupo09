package br.ufg.group9.pevb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.ufg.group9.pevb.R
import br.ufg.group9.pevb.model.Internship
import com.squareup.picasso.Picasso

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

    fun replaceData (data: List<Internship>) {
        internships.clear()
        internships.addAll(data)
        notifyDataSetChanged()
    }

    inner class InternshipViewHolder(noteView: View): RecyclerView.ViewHolder(noteView) {
        private val image = noteView.findViewById<ImageView>(R.id.image_internship)
        private val company = noteView.findViewById<TextView>(R.id.job_internship)
        private val payment = noteView.findViewById<TextView>(R.id.payment_internship)
        private val distance = noteView.findViewById<TextView>(R.id.distance_internship)
        private val timer = noteView.findViewById<TextView>(R.id.timer_internship)
        private val rate = noteView.findViewById<RatingBar>(R.id.rating_internship)

        fun fillData(data: Internship) {
            Picasso.get()
                .load("url")
                .resize(50, 50)
                .centerCrop()
                .into(image)

            company.text = data.company
            payment.text = data.payment
            distance.text = data.distance
            timer.text = data.timer
            rate.rating = data.rate.toFloat()
        }
    }
}