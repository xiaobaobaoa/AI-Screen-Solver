package com.ai.screen

import android.app.Service
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.*

class FloatService : Service() {

    private lateinit var windowManager: WindowManager
    private lateinit var view: View

    override fun onCreate() {
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager

        view = LayoutInflater.from(this).inflate(android.R.layout.simple_list_item_1, null)

        view.setOnClickListener {
            // TODO: capture + OCR + AI pipeline
        }

        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )

        windowManager.addView(view, params)
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
