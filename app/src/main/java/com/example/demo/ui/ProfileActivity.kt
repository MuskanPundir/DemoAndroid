package com.example.demo.ui

import MovieResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.demo.MovieDetailsActivity
import com.example.demo.MovieViewModel
import com.example.demo.databinding.ActivityProfileBinding
import com.example.demo.utils.CartoonAdapter
import com.squareup.picasso.Picasso

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadImage()
    }

    private fun openStartActivity() {
        startActivity(Intent(this, MovieDetailsActivity::class.java))
    }

    private fun loadImage() {
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieViewModel.movieDetail.observe(this, Observer {
            setRecyclerView(it.results)
        })
    }

    private fun setRecyclerView(list : List<MovieResult>?) {
       val cartoonAdapter = CartoonAdapter(list!!, this)
        binding.recyclerViewChat.setItemViewCacheSize(100)
      binding.recyclerViewChat.adapter = cartoonAdapter
    }
}
