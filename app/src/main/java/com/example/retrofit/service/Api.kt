package com.example.retrofit.service

import com.example.retrofit.model.Coin
import io.reactivex.Observable
import retrofit2.http.GET

interface Api {
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData(): Observable<List<Coin>>
}