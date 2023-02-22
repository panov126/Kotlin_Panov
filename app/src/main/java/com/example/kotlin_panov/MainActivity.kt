package com.example.kotlin_panov

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //Объявление переменных

    private var text: String = "В магазине <осталось> 10 банок колы, ф может и больше"
    private var tvText: TextView? = null;
    private var tvText2: TextView? = null;



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvTextView)
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringAfter('>')

        tvText?.setText(subText2)


    }


}


