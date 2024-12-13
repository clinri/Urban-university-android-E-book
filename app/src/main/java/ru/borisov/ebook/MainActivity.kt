package ru.borisov.ebook

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var loadBTN: Button
    lateinit var textTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadBTN = findViewById(R.id.loadBTN)
        textTV = findViewById(R.id.textTV)
        loadBTN.setOnClickListener {
            val words = loadBook(Database(this).text)
            textTV.text = words.joinToString(" ")
        }
    }

    fun loadBook(text: String): List<String> {
        return text.split(" ")
    }
}