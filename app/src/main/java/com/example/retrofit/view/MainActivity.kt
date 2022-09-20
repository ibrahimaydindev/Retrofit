package com.example.retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit.R
import com.example.retrofit.model.Coin

class MainActivity : AppCompatActivity() {
    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val coinList:ArrayList<Coin>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}