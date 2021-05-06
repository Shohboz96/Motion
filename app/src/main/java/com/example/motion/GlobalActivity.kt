package com.example.motion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motion.databinding.ActivityGlobalBinding

class GlobalActivity : AppCompatActivity() {
    private lateinit var bn: ActivityGlobalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bn = ActivityGlobalBinding.inflate(layoutInflater)
        setContentView(bn.root)

        bn.animation1.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        bn.animation2.setOnClickListener {
            startActivity(Intent(this,Activity2::class.java))
        }
        bn.animation3.setOnClickListener {
            startActivity(Intent(this,Activity3::class.java))
        }

        bn.animation4.setOnClickListener {
            startActivity(Intent(this,Activity4::class.java))
        }
    }
}