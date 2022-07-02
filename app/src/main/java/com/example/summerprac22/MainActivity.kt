package com.example.summerprac22

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn_calc)
        button.setOnClickListener {
            val editTextName = findViewById<EditText>(R.id.et_name)
            val editTextHeight = findViewById<EditText>(R.id.et_height)
            val editTextWeight = findViewById<EditText>(R.id.et_weight)
            val editTextAge = findViewById<EditText>(R.id.et_age)
            val result = findViewById<TextView>(R.id.tv_result)
            if (editTextName.length() != 0 && editTextHeight.length() != 0 && editTextWeight.length() != 0 && editTextAge.length() != 0) {
                val name:String = editTextName.text.toString()
                val height: Int = editTextHeight?.text.toString().toInt()
                val weight: Double = editTextWeight?.text.toString().toDouble()
                val age: Int = editTextAge?.text.toString().toInt()

                if (name.length > 50 || height <= 0 || height >= 250 || weight <= 0.0 //fun
                    || weight >= 250.0 || age <= 0 || age >= 150){
                    result.text = "Validation failed"
                }else {
                    result.text = calculate(name, height, weight, age)
                }
            } else {
                result.text = "Form shouldn't be null"
            }
            result.visibility = View.VISIBLE
        }
    }
    private fun calculate(name: String, height: Int, weight: Double, age: Int): String{
        val result = (weight * 10 + height * 6.25 - age * 5 - 83)*1.2 + name.length //суточная норма каллорий, без физ. активности
        return "$name : $result kkal"

    }
}