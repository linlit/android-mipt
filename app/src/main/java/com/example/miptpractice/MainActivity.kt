package com.example.miptpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendEmail: Button = findViewById(R.id.send_email)
        sendEmail.setOnClickListener {
            val sendEmailIntent = Intent(Intent.ACTION_SEND_MULTIPLE)
            sendEmailIntent.type = "plain/text";
            sendEmailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("somemail1@email.com", "somemail2@email.com"));
            startActivity(Intent.createChooser(sendEmailIntent, "Email"));
        }

        val goToProfile: Button = findViewById(R.id.go_to_profile)
        goToProfile.setOnClickListener {
            val userActivityIntent = Intent(applicationContext, UserActivity::class.java)
            startActivity(userActivityIntent)
        }
    }
}