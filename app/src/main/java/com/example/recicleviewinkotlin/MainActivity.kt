package com.example.recicleviewinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Display.Mode
import android.widget.Toast
import androidx.navigation.NavController
import com.example.recicleviewinkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val fragment =  FirstFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,fragment)
            .commit()
    }
}
//"Single Activity Architecture" или "Одноактивитная архитектура".
// Этот подход стал популярным в Android-разработке благодаря ряду преимуществ,
// таких как упрощение навигации, повышение гибкости и переиспользования компонентов интерфейса,
// а также улучшение производительности при переключении между различными экранами.