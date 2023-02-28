package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemBinding

class AdapterCount(val list:ArrayList<data>):RecyclerView.Adapter<AdapterCount.ViewHolder>() {
   inner class ViewHolder(private var binding:ItemBinding) :RecyclerView. ViewHolder(binding.root){
       fun bind(s: data) {
           binding.count.text = s.count
       }

   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.bind(list[position])
    }
}