package example.com.viewmodelleak.secondary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import example.com.viewmodelleak.R
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {

    private val viewModel: SecondaryViewModel by lazy {
        ViewModelProviders.of(this).get(SecondaryViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        setupView()

    }

    private fun setupView() {
        requestButton.setOnClickListener {
            viewModel.onPerformFakeRequestClicked()
        }
    }
}