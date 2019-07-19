package com.decirama.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Grilliant", "Snabbmat", "Eddy's", "Elegant Garden", "Chilliz", "Nånting nytt", "Korfu kolgrill", "Nha trang2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideButton.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]

        }

        addFoodButton.setOnClickListener {
            val newFood = addFoodFieldID.text.toString()
            foodList.add(newFood)
            addFoodFieldID.text.clear()
        }

    }
}
