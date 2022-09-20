package com.example.retrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.adapter.RecyclerViewAdapter
import com.example.retrofit.databinding.ActivityMainBinding
import com.example.retrofit.model.Coin
import com.example.retrofit.service.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val coinList:ArrayList<Coin>?=null
    private var recyclerViewAdapter:RecyclerViewAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val layoutmanager: RecyclerView.LayoutManager = LinearLayoutManager(this)
       binding.recyclerView.layoutManager=layoutmanager

    }
    fun loadData(){
        val retrofit= Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service=retrofit.create(Api::class.java)
        val call=service.getData()

        call.enqueue(object: Callback<List<Coin>>{
            override fun onResponse(call: Call<List<Coin>>, response: Response<List<Coin>>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Coin>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}