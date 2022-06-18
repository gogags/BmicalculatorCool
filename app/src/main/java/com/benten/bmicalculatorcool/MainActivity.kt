package com.benten.bmicalculatorcool

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etHeigh:EditText = findViewById(R.id.etHeight)
        val etWeigh:EditText = findViewById(R.id.etWeight)
        val button : Button = findViewById(R.id.testButton)
        val bmiTextView: TextView = findViewById(R.id.tvYourBmiValue)
        val imageView : ImageView = findViewById(R.id.ivBMI)

        button.setOnClickListener {
            val bmi = calculateBmi(etHeigh.text.toString().toDouble(), etWeigh.text.toString().toDouble())
            bmiTextView.text = bmi.toString()
            if(bmi > 25 ){
                imageView.setImageResource(R.drawable.ic_workout)
            }
            else
                imageView.setImageResource(R.drawable.ic_eat)
        }



    }
    fun calculateBmi(heigh: Double, weigh: Double):Double{
        val x = heigh / 100
        val y = weigh / x * x
        return y
    }






}