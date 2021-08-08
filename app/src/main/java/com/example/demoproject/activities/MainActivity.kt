package com.example.demoproject.activities

import android.os.Bundle
import android.text.Editable
import android.text.Html
import android.text.TextWatcher
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.demoproject.Validation
import com.example.demoproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private lateinit var validation:Validation
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.getRoot()
        setContentView(view)
        supportActionBar?.hide()

       validation = Validation()

//       binding.title.text = Html.fromHtml(getColoredSpanned("H", "#FFFFFF") +
//                getColoredSpanned("I", "#00E557"))

        binding.userName.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                binding.userNameError.visibility = View.GONE
            }

        })

        binding.password.addTextChangedListener(object : TextWatcher
        {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                binding.passwordError.visibility = View.GONE
            }

        })


        binding.loginBtn.setOnClickListener{
            binding.userName.clearFocus()
            binding.password.clearFocus()
            if (!validation.isUserName(binding.userName.text.toString()))
            {
                binding.userNameError.visibility = View.VISIBLE
            }
            if (!validation.isPassword(binding.password.text.toString()))
            {
                binding.passwordError.visibility = View.VISIBLE
            }
        }
    }
    private fun getColoredSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }

}