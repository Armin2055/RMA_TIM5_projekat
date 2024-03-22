package com.example.rma_tim5_projekat.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.rma_tim5_projekat.R

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    )
    {
        Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.BackgroundTest) )
        {

        }
    }
}

