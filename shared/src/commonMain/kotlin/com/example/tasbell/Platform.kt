package com.example.tasbell

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform