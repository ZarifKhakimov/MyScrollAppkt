package com.example.myscrollappkt.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myscrollappkt.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        val b = findViewById<Button>(R.id.b_push)
        b.setOnClickListener({
            openRecyclerActivity()
        })
    }

    fun openRecyclerActivity(){
        val intent = Intent(this, RecyclerActivity::class.java)
        startActivity(intent)
    }
}