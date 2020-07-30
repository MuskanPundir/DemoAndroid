package com.example.demo.repository

import com.example.demo.R
import com.example.demo.model.CartoonModel
import com.example.demo.model.MovieModel.MovieModel

class CartoonRepo {
    val cartoonList: MutableList<CartoonModel> = mutableListOf()

    fun prepareData() : List<CartoonModel> {
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Top1", image = R.drawable.aa ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Good", image = R.drawable.bb ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Nice", image = R.drawable.cc ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Good", image = R.drawable.dd))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "like", image = R.drawable.ee ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Top", image = R.drawable.ff))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Nice", image = R.drawable.gg ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Good", image = R.drawable.hh ))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Top", image = R.drawable.ii))
        setMovies(CartoonModel(name = "Mr.Bean", rating = "Nice", image = R.drawable.jj ))
        return cartoonList
    }

    fun setMovies(cartoonModel: CartoonModel) {
        cartoonList.add(cartoonModel)

    }
}