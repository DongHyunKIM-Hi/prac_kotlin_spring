package com.example.demo.api.model.request

data class MenuRequest(
    val name: String,
    val price: Int,
    val menu: String,
    val category: String
)