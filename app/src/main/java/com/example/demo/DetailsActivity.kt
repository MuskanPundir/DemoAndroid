package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.item_chat.view.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        getData()
    }

    private fun getData() {
        val name = intent.getStringExtra("name")
        tvname.text = name

        val rating: String? = intent.getStringExtra("rating")
        tvrating.text = rating

        val image  = intent.getIntExtra("image",R.drawable.pic1)
        imgdetails.setImageResource(image)
    }
}
