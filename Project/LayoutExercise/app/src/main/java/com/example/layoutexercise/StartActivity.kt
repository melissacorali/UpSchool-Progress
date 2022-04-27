package com.example.layoutexercise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.layoutexercise.databinding.ActivityMainBinding

class StartActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)
        super.onCreate(savedInstanceState)
        binding.button.setOnClickListener(this)

       // setContentView(R.layout.activity_start)
    }

    override fun onClick(p0: View?) {
      val intent: Intent = Intent(this, PremiumActiviy::class.java)
    }
}