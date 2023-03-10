package com.example.compiledofcodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.compiledofcodes.view.carrossel.ViewPager2CarrosselActivity
import com.example.compiledofcodes.view.estrutura.ViewPager2Activity
import com.example.compiledofcodes.webView.WebViewActivity

class MainActivity : AppCompatActivity() {

     private val btnViewPager2Estrutura by lazy { findViewById<Button>(R.id.btnViewPager2Estrutura) }
     private val btnViewPager2Carrossel by lazy { findViewById<Button>(R.id.btnViewPager2Carrossel) }
     private val btnWebView by lazy { findViewById<Button>(R.id.btnWebView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListeners()
    }
    private fun setupListeners(){
        btnViewPager2Estrutura.setOnClickListener {
            switchScreen(ViewPager2Activity())
        }

        btnViewPager2Carrossel.setOnClickListener {
            switchScreen(ViewPager2CarrosselActivity())
        }

        btnWebView.setOnClickListener {
            switchScreen(WebViewActivity())
        }

    }

    private fun switchScreen(activity: AppCompatActivity) {
        Intent(this, activity::class.java).apply {
            startActivity(this)
        }
    }
}