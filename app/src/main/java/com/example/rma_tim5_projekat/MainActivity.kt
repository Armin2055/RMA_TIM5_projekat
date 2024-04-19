package com.example.rma_tim5_projekat

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import com.example.rma_tim5_projekat.Screens.AboutUs
import com.example.rma_tim5_projekat.Screens.HomePage
import com.example.rma_tim5_projekat.Screens.Order
import com.example.rma_tim5_projekat.navigation.Navigation
import com.example.rma_tim5_projekat.ui.theme.RMA_TIM5_projekatTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RMA_TIM5_projekatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val lifecycleOwner = this
                    Navigation(applicationContext, lifecycleOwner = lifecycleOwner)
                }
            }
        }
    }
}


