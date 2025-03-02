package com.example.widgetsprac

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var radioGroup:RadioGroup
    private lateinit var radioBtn:RadioButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        radioGroup=findViewById(R.id.radioGroup)

        radioGroup.setOnCheckedChangeListener { radiogroup, id ->
            radioBtn=findViewById(id)

            when(radioBtn.id){
                R.id.YesBtn -> {
                    Toast.makeText(this,"You clicked Yes",Toast.LENGTH_SHORT).show()
                }
                R.id.noBtn -> {
                    Toast.makeText(this,"You clicked No",Toast.LENGTH_SHORT).show()
                }
                R.id.mayBtn -> {
                    Toast.makeText(this, "You Clicked Maybe", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}