package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.component.ColorBoxMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrentLearning()
        }
    }
}

@Composable
fun CurrentLearning() {
//    LearningModifiers()
//    LearningImageCard()
//    Greeting("Android")
//    TextStyling()
    ColorBoxMain()
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurrentLearning()
}