package ru.borisov.ebook

import android.content.Context

class Database(val context: Context) {
    val text: String
        get() = context
            .assets
            .open("text")
            .bufferedReader()
            .use { it.readText() }
}