package com.example.seniorjobapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.seniorjobapp.databinding.ActivityApplicantStatusBinding

class ApplicantStatusActivity : AppCompatActivity() {
    private lateinit var binding: ActivityApplicantStatusBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplicantStatusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 툴바 설정
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "지원 현황 보기"

        // 더미 데이터
        val applicants = listOf(
            Applicant("OOO", "OOO... ...............", "010-0000-0000")
        )

        // 어댑터 연결
        binding.applicantRecyclerView.adapter = ApplicantAdapter(applicants)
        binding.applicantRecyclerView.layoutManager = LinearLayoutManager(this)

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
