package com.example.myapplication

import retrofit2.http.GET

interface ClientService {
    @GET("api/?results=20")
    fun getClient(): String
}