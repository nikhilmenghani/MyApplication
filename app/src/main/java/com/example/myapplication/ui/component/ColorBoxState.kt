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
import com.example.myapplication.ui.theme.Purple200
import com.example.myapplication.ui.theme.Teal200
import kotlin.random.Random

@Composable
fun ColorBox(
    modifier: Modifier,
    color : Color,
    updateColor: (Color) -> Unit
) {
    Box(modifier = modifier
        .background(color = color)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )
        })
}

@Composable
fun ColorBoxMain() {
    Column(modifier = Modifier.fillMaxSize()) {
        val color = remember { mutableStateOf(Purple200) }
        val color2 = remember { mutableStateOf(Teal200) }
        ColorBox(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            color.value) {
            color2.value = it
        }
        ColorBox(modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
            color2.value) {
            color.value = it
        }
    }
}