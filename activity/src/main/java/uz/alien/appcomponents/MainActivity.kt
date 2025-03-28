package uz.alien.appcomponents

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_main)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
      v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
      insets
    }
    Log.d("LIFECYCLE", "onCreate")
  }

  override fun onStart() {
    super.onStart()
    Log.d("LIFECYCLE", "onStart")
  }

  override fun onResume() {
    super.onResume()
    Log.d("LIFECYCLE", "onResume")
  }

  override fun onPause() {
    super.onPause()
    Log.d("LIFECYCLE", "onPause")
  }

  override fun onStop() {
    super.onStop()
    Log.d("LIFECYCLE", "onStop")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d("LIFECYCLE", "onDestroy")
  }
}