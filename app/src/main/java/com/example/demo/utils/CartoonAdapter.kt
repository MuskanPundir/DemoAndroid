package com.example.demo.utils

import MovieResult
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R
import com.squareup.picasso.Callback
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import java.lang.Exception


class CartoonAdapter(private val cartoonList: List<MovieResult> , private val context: Context):
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

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CartoonAdapter.ViewHolder, position: Int) {
        val fullImage = "https://image.tmdb.org/t/p/w500/${cartoonList[position]
            .posterPath}"

        Picasso.get()
            .load(fullImage)
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.image, object : Callback {
                override fun onSuccess() {
                }
                override fun onError(e: Exception?) {
                    Picasso.get().load(fullImage).into(holder.image)
                }
            })

        holder.name.text ="Name: "+(cartoonList[position].title)
        holder.rating.text ="Rating: "+(cartoonList[position].voteAverage.toString())
        holder.popularity.text = "Popularity:  "+cartoonList[position].popularity.toString()
        holder.id.text = "id: "+cartoonList[position].id.toString()
//        holder.itemView.setOnClickListener {
//            context.startActivity(
//                Intent(context, DetailsActivity::class.java).putExtra(
//                    "name"
//                    , cartoonList[position].title
//                ).putExtra("rating", cartoonList[position].voteAverage.toString())
//                    .putExtra("image", cartoonList[position].posterPath)
//            )
//        }
    }

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.cartoon_name)
        val rating = itemView.findViewById<TextView>(R.id.cartoon_rating)
         val popularity = itemView.findViewById<TextView>(R.id.cartoon_popularity)
         val id = itemView.findViewById<TextView>(R.id.cartoon_id)

     }
}