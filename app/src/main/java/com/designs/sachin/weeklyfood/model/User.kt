package com.designs.sachin.weeklyfood.model


data class User(val name: String,
                val status: String,
                val profilePicturePath: String?) {
    constructor(): this("", "", null)
}