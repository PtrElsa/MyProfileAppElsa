package com.idn.elsa.profileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_profile_app2.*

class MyProfileApp2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile_app2)

        btn_lets_see_my_profile.setOnClickListener {
            val intent = Intent (this, ProfileApp ::class.java)
            startActivity(intent)
        }
    }
}