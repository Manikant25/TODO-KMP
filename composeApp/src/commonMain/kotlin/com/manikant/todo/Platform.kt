package com.manikant.todo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform