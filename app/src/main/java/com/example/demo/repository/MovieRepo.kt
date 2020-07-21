package com.example.demo.repository


import com.example.demo.model.MovieModel.MovieModel

class MovieRepo {

    fun prepareMovieData(): List<MovieModel> {
        val movieList = mutableListOf<MovieModel>()
        for (i in 0..10) {
            val movieModel = MovieModel(name= "Movie", description = "Hello", rating = "000")
           movieList.add(movieModel)

        }
        return movieList
    }
}