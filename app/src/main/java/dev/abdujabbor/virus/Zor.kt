package dev.abdujabbor.virus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Zor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zor)
        startActivity(Intent(this,MainActivity::class.java))
    }
}