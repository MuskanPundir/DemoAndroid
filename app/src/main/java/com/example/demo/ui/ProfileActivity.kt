package com.example.demo.ui

import MovieDetail
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.demo.MovieDetailsActivity
import com.example.demo.databinding.ActivityProfileBinding
import com.example.demo.datasource.Api
import com.example.demo.datasource.RetrofitService
import com.example.demo.repository.MovieRepo
import com.squareup.picasso.Picasso

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

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
        val movieRepo = MovieRepo()
        movieRepo.getPopularMovies().observe(this, Observer {
            println(it.results?.get(0)?.title)
            val fullImage = "https://image.tmdb.org/t/p/w500/${it.results
                ?.get(0)?.posterPath}"
            Picasso.get().load(fullImage).into(binding.img)
        })
    }
}
