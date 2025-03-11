package uz.alien.savedinstance

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.alien.savedinstance.databinding.ActivityMainBinding

class UnsavedState : AppCompatActivity() {

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

    binding.tvCount.setText("Count: $counter")

    binding.bCount.setOnClickListener {
      counter++
      binding.tvCount.setText("Count: $counter")
    }

    /*
    *
    * Xullas bu joyda qiymatlar hech qayerga saqlanmayotgani uchun Activity classidagi
    * barcha o'zgaruvchilar o'chib ketadi, masalan ekran orientatsiyasi yoki shunga o'xshash
    * o'zgarish sodir bo'lganida.
    *
    * Buni oldini olish uchun savedInstanceState yoki companion variable lardan foydalanish kerak
    *
    * Men standardlarga amal qilishni tavfsiya qilaman, shuning uchun savedInstanceState ishlating
    *
    * yoki ViewModel ishlatsangiz ham bo'ladi
    *
    * */
  }
}