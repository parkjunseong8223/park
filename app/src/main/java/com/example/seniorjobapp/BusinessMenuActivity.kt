package com.example.seniorjobapp

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.seniorjobapp.databinding.ActivityBusinessMenuBinding

class BusinessMenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBusinessMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBusinessMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 툴바 설정
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "사업자 메뉴"

        // 버튼 클릭 이벤트
        binding.registerStatusLayout.setOnClickListener {
            val intent = Intent(this, JobStatusActivity::class.java)
            startActivity(intent)
        }

        binding.registerJobLayout.setOnClickListener {
            val intent = Intent(this, JobRegisterActivity::class.java)
            startActivity(intent)
        }
    }

    // 👉 툴바의 뒤로가기(<) 버튼 클릭 처리
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
