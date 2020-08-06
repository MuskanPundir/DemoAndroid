package com.example.demo.utils

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.DetailsActivity
import com.example.demo.R
import com.example.demo.model.CartoonModel

class CartoonAdapter(private val cartoonList: List<CartoonModel> , private val context: Context):
    RecyclerView.Adapter<CartoonAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.cards1_layout, parent,
            false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cartoonList.size
    }

    override fun onBindViewHolder(holder: CartoonAdapter.ViewHolder, position: Int) {
        holder.image.setImageResource(cartoonList[position].image)
        holder.name.setText(cartoonList[position].name)
        holder.rating.setText(cartoonList[position].rating)

        holder.itemView.setOnClickListener {
            context.startActivity(
                Intent(context, DetailsActivity::class.java).putExtra(
                    "name"
                    , cartoonList[position].name
                ).putExtra("rating", cartoonList[position].rating)
                    .putExtra("image", cartoonList[position].image)
            )
        }
    }

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.cartoon_name)
        val rating = itemView.findViewById<TextView>(R.id.cartoon_rating)
    }
}