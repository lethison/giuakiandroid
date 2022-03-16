package com.example.leson

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leson.databinding.InformationLayoutBinding

class InformationLayout: AppCompatActivity() {
    private lateinit var  binding:InformationLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = InformationLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {
            val intent: Intent = Intent (this, MainActivity::class.java)

            val datadetail=ArrayList<String>()
            val data=ArrayList<String>()
            data.add(binding.tvname.text.toString())
            data.add(binding.tvphone.text.toString())
            intent.putExtra("data",data)

            startActivity(intent)
        }
    }
}