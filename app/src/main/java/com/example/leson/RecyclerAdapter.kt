package com.example.leson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(private val mList: List<ItemsViewModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        val ItemsViewModel=mList[position]
        holder.itemname.text=ItemsViewModel.name
        holder.itemphone.text=ItemsViewModel.phone
        holder.itemimage.setImageResource(ItemsViewModel.image)
    }

    override fun getItemCount(): Int {
        return mList.size
    }
    inner  class ViewHolder(itemView: View ):RecyclerView.ViewHolder(itemView){

        var itemimage: ImageView
        var itemname: TextView
        var itemphone :TextView
        init{
            itemimage=itemView.findViewById(R.id.item_image)
            itemname=itemView.findViewById(R.id.item_name)
            itemphone=itemView.findViewById(R.id.item_phone)
        }

    }

}