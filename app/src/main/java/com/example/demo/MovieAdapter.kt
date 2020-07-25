package com.example.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.model.MovieModel.MovieModel

class MovieAdapter( private val movieList: List<MovieModel>):
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cards_layout,parent ,
            false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        holder.image.setImageResource(movieList[position].image)
        holder.name.setText(movieList[position].name)
        holder.description.setText(movieList[position].description)
        holder.rating.setText(movieList[position].rating)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.imageView)
        val name = itemView.findViewById<TextView>(R.id.movie_name)
        val description = itemView.findViewById<TextView>(R.id.movie_Description)
        val rating = itemView.findViewById<TextView>(R.id.movie_rating)

    }
}