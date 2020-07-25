package com.example.demo.repository

import com.example.demo.R
import com.example.demo.model.MovieModel.MovieModel

class MovieRepo {

    private val movieList = mutableListOf<MovieModel>()

    fun prepareMovieData(): List<MovieModel> {
        setMovies(MovieModel(name= "A", description = "Hello", rating = "000", image = R.drawable.a))
        setMovies(MovieModel(name= "B", description = "Hello", rating = "001", image = R.drawable.b))
        setMovies(MovieModel(name= "C", description = "Hello", rating = "002", image = R.drawable.c))
        setMovies(MovieModel(name= "D", description = "Hello", rating = "003", image = R.drawable.d))
        setMovies(MovieModel(name= "E", description = "Hello", rating = "004", image = R.drawable.e))
        setMovies(MovieModel(name= "F", description = "Hello", rating = "005", image = R.drawable.f))
        setMovies(MovieModel(name= "G", description = "Hello", rating = "006", image = R.drawable.g))
        setMovies(MovieModel(name= "H", description = "Hello", rating = "0007", image = R.drawable.h))
        setMovies(MovieModel(name= "I", description = "Hello", rating = "000", image = R.drawable.pic1))
        setMovies(MovieModel(name= "J", description = "Hello", rating = "000", image = R.drawable.pic2))
        return movieList
    }

    private fun setMovies(movieModel: MovieModel) {
        movieList.add(movieModel)
    }
}