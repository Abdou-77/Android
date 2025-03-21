package com.example.myapplication.model

import retrofit2.Retrofit

enum class Gender {
    MAN,WOMAN
}

fun getClient() {
    // Implementation here
}

data class Client(val lastName: String,
                  val firstName: String,
                  val gender: Gender) {
    companion object Utils {
        fun getClient(){
            // Implementation here
            Retrofit.Builder().baseUrl("https://randomuser.me/")

        }
    }
}