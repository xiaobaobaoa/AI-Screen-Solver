package com.ai.screen

import android.graphics.Bitmap

object OCRHelper {
    fun recognize(bitmap: Bitmap, callback: (String) -> Unit) {
        // stub OCR
        callback("2x + 3 = 7")
    }
}
