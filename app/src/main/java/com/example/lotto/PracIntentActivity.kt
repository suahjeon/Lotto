package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PracIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prac_intent)

        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnConstellation = findViewById<Button>(R.id.btnconstellationactivity)
        val btnName = findViewById<Button>(R.id.btnname)
        val btnResult = findViewById<Button>(R.id.btnresult)

        btnMain.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        btnConstellation.setOnClickListener {
            startActivity(Intent(this,ConstellationActivity::class.java))
        }
        btnName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }
        btnResult.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }
    }
}