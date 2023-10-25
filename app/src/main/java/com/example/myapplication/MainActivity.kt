package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click: Button = findViewById(R.id.button)
        click.setOnClickListener {
            Num()
        }


    }

    private fun Num() {


        var diceImage: ImageView = findViewById(R.id.Image)
        var Result = when ((1..6).random()) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        diceImage.setImageResource(Result)


    }
}