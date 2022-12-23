package com.example.compiledofcodes.webView

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.compiledofcodes.R
import java.net.URL

class WebViewActivity : AppCompatActivity() {

    companion object {
        const val SITE = "https://developer.android.com/jetpack"
    }

    private val btnWebView by lazy { findViewById<AppCompatButton>(R.id.btnWebView_webView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        setuplistener()

    }

    private fun setuplistener() {
        btnWebView.setOnClickListener {
            webView(SITE)
        }
    }

    private fun webView(url: String) {
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
            startActivity(this)
        }
    }
}