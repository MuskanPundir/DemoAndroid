package com.example.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.model.MovieModel.MovieModel


class MovieAdapter( private val movieList: List<MovieModel>):
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent ,
            false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
//        holder.name.text = movieList[position].name
//        holder.description.text = movieList[position].description
//        holder.rating.text = movieList[position].rating
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      //  val name = itemView.findViewById<TextView>(R.id.item_movie_name)
        //val description = itemView.findViewById<TextView>(R.id.item_movie_description)
        //val rating = itemView.findViewById<TextView>(R.id.item_movie_rating)
    }

}