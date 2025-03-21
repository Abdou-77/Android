package com.example.myapplication.model

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

        }
    }
}