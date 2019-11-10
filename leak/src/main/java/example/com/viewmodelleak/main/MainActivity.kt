package example.com.viewmodelleak.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import example.com.viewmodelleak.R
import example.com.viewmodelleak.Repository
import example.com.viewmodelleak.secondary.SecondaryActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        showSecondaryScreenButton.setOnClickListener {
            startActivity(Intent(this, SecondaryActivity::class.java))
        }

        endFakeRequestButton.setOnClickListener {
            Repository.finishFakeRequest()
        }
    }
}