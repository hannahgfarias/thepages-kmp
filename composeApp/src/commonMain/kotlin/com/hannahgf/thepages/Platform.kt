package com.hannahgf.thepages

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform