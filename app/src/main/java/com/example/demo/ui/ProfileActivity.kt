package com.example.demo.ui

import MovieResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.demo.MovieDetailsActivity
import com.example.demo.MovieViewModel
import com.example.demo.ViewStatus
import com.example.demo.databinding.ActivityProfileBinding
import com.example.demo.repository.MovieRepo
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
        // delete()
    }

    private fun openStartActivity() {
        startActivity(Intent(this, MovieDetailsActivity::class.java))
    }

    private fun loadImage() {
        movieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieViewModel.movieDetail.observe(this, Observer {

            when (it) {
                is ViewStatus.Success -> {
                    setRecyclerView(it.data.results)
                    binding.progressBar.visibility = View.GONE
                }

                is ViewStatus.Failed -> binding.progressBar.visibility = View.GONE
                is ViewStatus.Loading -> binding.progressBar.visibility = View.VISIBLE
            }

        })
    }

    private fun setRecyclerView(list: List<MovieResult>?) {
        val cartoonAdapter = CartoonAdapter(list!!, this)
        binding.recyclerViewChat.setItemViewCacheSize(100)
        binding.recyclerViewChat.adapter = cartoonAdapter
    }


//    fun delete() {
//     val data = MovieRepo(). getPopularMovies()
//       data.observe(this, Observer {
//
//            when(it) {
//                is ViewStatus.Success ->  {
//                    setRecyclerView(it.data.results)
//                    binding.progressBar.visibility = View.GONE
//                }
//
//                is ViewStatus.Failed -> binding.progressBar.visibility = View.GONE
//                is ViewStatus.Loading -> binding.progressBar.visibility = View.VISIBLE
//            }
//
//        })
//    }
}