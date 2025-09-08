package com.nithin.todo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform