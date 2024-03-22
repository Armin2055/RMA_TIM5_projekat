package com.example.rma_tim5_projekat.Screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Screen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello EKran $name!",
        modifier = modifier
    )
}