package com.example.demo.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.example.demo.model.ChatModel

class ChatAdapter(private val chatList: List<ChatModel>) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat, parent, false)
       return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = chatList[position].name
        holder.msg.text = chatList[position].msg
        holder.time.text = chatList[position].time
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.item_chat_name)
        val msg = itemView.findViewById<TextView>(R.id.item_chat_msg)
        val time = itemView.findViewById<TextView>(R.id.item_chat_time)
    }

}