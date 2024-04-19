package com.example.rma_tim5_projekat.navigation

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.rma_tim5_projekat.Screens.AboutUs
import com.example.rma_tim5_projekat.Screens.HomePage
import com.example.rma_tim5_projekat.Screens.Order
import com.example.rma_tim5_projekat.Screens.Signin

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(
    context: Context,
    lifecycleOwner: LifecycleOwner
){
    val navController = rememberNavController();

    NavHost(navController = navController, startDestination = Screen.Signin.route) {
        composable(
            route = Screen.Signin.route, ){
            Signin(
                navController = navController,
            )
        }
        composable(
            route = Screen.Order.route){
            Order(
                navController = navController,
            )
        }
        composable(
            route = Screen.AboutUs.route){
            AboutUs(
                navController = navController,
            )
        }
        composable(
            route = Screen.HomePage.route + "/{ime}",
            arguments = listOf(
                navArgument("ime"){
                    type = NavType.StringType
                    nullable = true
                }
            )
        )
        { entry ->
            entry.arguments?.getString("ime")?.let { HomePage(navController,ime = it) }
        }

    }
}