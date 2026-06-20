package com.ai.screen

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = intent.getStringExtra("result") ?: "No result"

        val tv = TextView(this)
        tv.text = text

        setContentView(tv)
    }
}
