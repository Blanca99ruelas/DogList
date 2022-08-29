package com.ruelas.doglist

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface APIService {
    @GET
    suspend fun getDogsByBreeds(@Url url:String):Response<DogResponse>
}