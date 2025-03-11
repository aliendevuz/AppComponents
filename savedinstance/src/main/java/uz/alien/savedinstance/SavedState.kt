package uz.alien.savedinstance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.alien.savedinstance.databinding.ActivityMainBinding

class SavedState : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private var counter = 0

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

    savedInstanceState?.let { counter = it.getInt("counter", 0) }

    binding.tvCount.setText("Count: ${counter}")
    binding.bCount.setOnClickListener {
      counter++
      binding.tvCount.setText("Count: ${counter}")
    }

    /*
    *
    * Bu yerda standard larga amal qilgan holda savedInstanceStatega saqladik
    *
    * */
  }

  override fun onSaveInstanceState(outState: Bundle) {
    super.onSaveInstanceState(outState)
    outState.putInt("counter", counter)
  }
}