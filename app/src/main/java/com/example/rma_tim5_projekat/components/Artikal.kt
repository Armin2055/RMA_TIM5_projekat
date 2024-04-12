package com.example.rma_tim5_projekat.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Artikal(painterResource: Painter, ime: String, opis: String)
{
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Box(modifier = Modifier.width(300.dp)){
            Image(painter = painterResource, contentDescription = null, modifier = Modifier
                .height(150.dp)
                .width(500.dp),
                contentScale = ContentScale.FillBounds
            )
        }


        Box(modifier = Modifier
            .width(300.dp)
            .background(Color.White))
        {
            Column {
                Text(ime, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth() .padding(top = 10.dp), color = Color.Black, fontSize = 28.sp)
                Text(opis, color = Color.Black, fontSize = 20.sp, modifier = Modifier.width(250.dp) .padding(start = 20.dp, top = 10.dp))
                Button(modifier = Modifier.padding(start = 200.dp), colors = ButtonDefaults.buttonColors(Color(0xFFFFA500)) ,onClick = { /*TODO*/ }) {
                 Text(text = "Order")
                }
            }
            

        }

        Spacer(modifier = Modifier.height(50.dp) )
    }



}