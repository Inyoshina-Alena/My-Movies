package com.example.mymovies

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mymovies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMenu.setOnClickListener{
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        binding.buttonFavorites.setOnClickListener{
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        binding.buttonSeeItLater.setOnClickListener{
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }
        binding.buttonCompilations.setOnClickListener{
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }
        binding.buttonSettings.setOnClickListener{
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }

    }


}