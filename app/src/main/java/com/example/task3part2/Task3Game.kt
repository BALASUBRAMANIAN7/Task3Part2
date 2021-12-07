package com.example.task3part2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Task3Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3_game)
        var msg = intent.getStringExtra("msg")
        var number = intent.getStringExtra("number")
        var color = intent.getStringExtra("color")
        findViewById<TextView>(R.id.endResultView).text = msg
        findViewById<TextView>(R.id.number).text = number
        findViewById<TextView>(R.id.number).setTextColor(Color.parseColor(color))
    }
}