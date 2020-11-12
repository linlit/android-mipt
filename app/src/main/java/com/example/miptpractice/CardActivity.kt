package com.example.miptpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val viewType: CardView = findViewById(R.id.view_type)

        viewType.setOnClickListener {
            val cardAlterActivityIntent = Intent(applicationContext, CardAlterActivity::class.java)
            startActivity(cardAlterActivityIntent)
        }
    }
}
