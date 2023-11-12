package com.example.myapplication.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import kotlin.random.Random

@Composable
fun ColorBox(
    modifier: Modifier,
    updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .background(color = Color.Blue)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        }) {

    }
}

@Composable
fun ColorBoxMain() {
    Column(modifier = Modifier.fillMaxSize()) {
        val color = remember { mutableStateOf(Color.Yellow) }
        ColorBox(modifier = Modifier
            .weight(1f)
            .fillMaxSize()) {
            color.value = it
        }
        Box(
            modifier = Modifier
                .background(color = color.value)
                .weight(1f)
                .fillMaxSize()
        )
    }
}