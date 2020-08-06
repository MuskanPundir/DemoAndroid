package com.example.demo.ui

import MovieDetail
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo.MovieDetailsActivity
import com.example.demo.databinding.ActivityProfileBinding
import com.example.demo.datasource.Api
import com.example.demo.datasource.RetrofitService
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Response

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadImage()
        binding.start.setOnClickListener {
       //     openStartActivity()
        }
    }

    private fun openStartActivity() {
        startActivity(Intent(this, MovieDetailsActivity::class.java))
    }

    private fun loadImage() {


        val retrofit = RetrofitService.getRetrofitInstance()
        val api = retrofit.create(Api::class.java)
        val call = api.getPopularMovies()
        call.enqueue(object : retrofit2.Callback<MovieDetail> {
            override fun onFailure(call: Call<MovieDetail>?, t: Throwable?) {
                println("retrofit error ${t?.localizedMessage}")

            }

            override fun onResponse(call: Call<MovieDetail>?, response: Response<MovieDetail>?) {
                println("retrofit reponse ${response?.isSuccessful}")
                println("retrofit reponse ${response?.body()?.results?.get(1)?.title}")
                val fullImageUrl = "https://image.tmdb.org/t/p/w500${response?.body()?.results?.get(0)?.posterPath}"
                println(fullImageUrl)

                Picasso
                    .get()
                    .load(fullImageUrl)
                    .into(binding.img)


            }
        })

    }
}
