package com.application.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterRecView (private val listWayang: ArrayList<wayang>) :
    RecyclerView.Adapter<AdapterRecView.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var _namaWayang = itemView.findViewById<TextView>(R.id.namaWayang)
        var _karakterWayang = itemView.findViewById<TextView>(R.id.karakterWayang)
        var _deskripsiWayang = itemView.findViewById<TextView>(R.id.deskripsiWayang)
        var _gambarWayang = itemView.findViewById<ImageView>(R.id.gambarWayang)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterRecView.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)
        return  ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterRecView.ListViewHolder, position: Int) {
        var wayang = listWayang[position]

        holder._namaWayang.setText(wayang.nama)
        holder._deskripsiWayang.setText(wayang.deskripsi)
        holder._karakterWayang.setText(wayang.karakter)
    }

    override fun getItemCount(): Int {
        return listWayang.size
    }

}