package com.example.seniorjobapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.seniorjobapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ❌ Glide 사용 X - PNG는 src로 불러오므로 이 부분 삭제하거나 무시
        // GIF 관련 코드 모두 제거

        // 로그인 버튼
        binding.btnLogin.setOnClickListener {
            val intent = Intent(this, Activity02::class.java)
            startActivity(intent)
        }

        // 비회원 로그인 버튼
        binding.btnGuest.setOnClickListener {
            val intent = Intent(this, Activity02::class.java)
            startActivity(intent)
        }

        // 카카오 로그인 버튼
        binding.btnKakaoLogin.setOnClickListener {
            val intent = Intent(this, Activity02::class.java)
            startActivity(intent)
        }
        // 회원가입 버튼
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

    }
}
