package com.example.seniorjobapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.seniorjobapp.databinding.ActivityWorkerBinding

class WorkerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityWorkerBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_worker)
        setContentView(binding.root)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "근무자로 지원"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val states = arrayOf(
            intArrayOf(android.R.attr.state_pressed),
            intArrayOf()
        )

        val colors = intArrayOf(
            Color.parseColor("#AAAAAA"),  // 눌렀을 때
            Color.parseColor("#23377A")   // 기본 색
        )

        val colors2 = intArrayOf(
            Color.parseColor("#AAAAAA"),  // 눌렀을 때
            Color.parseColor("#D27A2F")   // 주황색 기본
        )

        val colorStateList1 = ColorStateList(states, colors2)
        binding.button1.backgroundTintList = colorStateList1

        val colorStateList2 = ColorStateList(states, colors)
        binding.button2.backgroundTintList = colorStateList2


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}