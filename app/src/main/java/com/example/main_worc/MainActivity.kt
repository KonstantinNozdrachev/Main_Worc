package com.example.main_worc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.example.main_worc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            Open.setOnClickListener{
                drawer.openDrawer(GravityCompat.START)
            }
            orion.setOnClickListener{
            val intent = Intent(this@MainActivity,Activity2::class.java)
                startActivity(intent)
            drawer.closeDrawer(GravityCompat.START)
            }
            pegas.setOnClickListener{
                val intent = Intent(this@MainActivity,Activity3::class.java)
                startActivity(intent)
                drawer.closeDrawer(GravityCompat.START)
            }
            andromeda.setOnClickListener{
                val intent = Intent(this@MainActivity,Activity4::class.java)
                startActivity(intent)
                drawer.closeDrawer(GravityCompat.START)

            }
        }
    }
}