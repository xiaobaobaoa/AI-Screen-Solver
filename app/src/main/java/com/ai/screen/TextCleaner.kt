package com.ai.screen

object TextCleaner {
    fun clean(text: String): String {
        return text.replace("\n", " ").trim()
    }
}
