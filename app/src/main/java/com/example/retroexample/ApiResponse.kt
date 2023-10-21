package com.example.retroexample


data class ApiResponse(
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,
    val data: List<Users>,
    val support: Support
)

data class Support(
    val url: String,
    val text: String
)