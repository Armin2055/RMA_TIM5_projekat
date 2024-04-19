package com.example.rma_tim5_projekat.navigation

sealed class Screen (val route : String){
    object HomePage : Screen("HomePage")
    object AboutUs : Screen("AboutUs")
    object Order : Screen("Order")
    object Signin : Screen("Signin")
}