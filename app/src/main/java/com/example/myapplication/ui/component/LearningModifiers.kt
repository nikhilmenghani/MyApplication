package com.example.myapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LearningModifiers() {
    Column(
        modifier = Modifier
            .background(color = Color.Green)
            .fillMaxHeight(fraction = 0.5f)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(10.dp)
            .border(5.dp, Color.Red)
            .padding(15.dp)
    ) {
        Text(
            text = "Hello", modifier = Modifier.offset(0.dp, 20.dp)
        )
        Spacer(modifier = Modifier.height(50.dp))
        Text(text = "World!")
    }
}