package com.example.demo

import MovieDetail
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.demo.repository.MovieRepo

class MovieViewModel : ViewModel() {

    private lateinit var _movieDetails : LiveData<MovieDetail>
    private var movieRepo: MovieRepo = MovieRepo()

    val movieDetail: LiveData<MovieDetail>
    get() = _movieDetails

    init {
        getMovieData()
    }

    private fun getMovieData() {
        _movieDetails = movieRepo.getPopularMovies()
    }

    override fun onCleared() {
        if (!movieRepo.compositeDisposable.isDisposed) {
            movieRepo.compositeDisposable.dispose()
        }
        super.onCleared()
    }

}