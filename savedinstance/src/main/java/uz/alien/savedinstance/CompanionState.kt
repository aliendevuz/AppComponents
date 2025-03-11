package uz.alien.savedinstance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.alien.savedinstance.databinding.ActivityMainBinding

class CompanionState : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)
    ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }

    binding.tvCount.setText("Count: ${counter}")
    binding.bCount.setOnClickListener {
      counter++
      binding.tvCount.setText("Count: ${counter}")
    }

    /*
    *
    * Qizig'i shundaki companionda ham saqlanganlar o'chib ketmas ekan,
    * savedInstanceState bilan farqini sezganim yo'q
    *
    * */
  }

  companion object {
    private var counter = 0
  }
}