package com.example.rma_tim5_projekat.Screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rma_tim5_projekat.R
import com.example.rma_tim5_projekat.navigation.Screen

@Composable
fun HomePage(navController: NavController, ime: String) {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    )
    {
        Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.backgroundhome), contentDescription = null, contentScale = ContentScale.Crop )

    }
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(Dp(200F))
        ){

            Image(modifier = Modifier.size(Dp(150F)), painter = painterResource(id = R.drawable.restorankinglogo), contentDescription = null)
            Text(text = "Sign in", color = Color.White, modifier = Modifier
                .padding(Dp(15F))
                .clickable { navController.navigate(Screen.Signin.route) })
            Text(text = "About Us", color = Color.White, modifier = Modifier
                .padding(Dp(15F))
                .clickable { navController.navigate(Screen.AboutUs.route) })

        }
        Row (modifier = Modifier.fillMaxWidth())
        {
            Text(text = "Zdravo $ime", color = Color.White, fontSize = 20.sp, modifier = Modifier.padding(start = 20.dp))
        }
        Row(modifier = Modifier.padding(Dp(20F))) {
            Text(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White, text = "Embark on a culinary adventure where speed meets sensational flavour. " +
                    "At “King”, we redefine fast food with instant gratification for your taste buds.")
        }
        Row(modifier = Modifier
            .padding(horizontal = 40.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.End ) {
            Button(onClick = { navController.navigate(Screen.Order.route) }, colors = ButtonDefaults.buttonColors(Color(0xFFFFA500)), ) {
              Text(text = "Order now", fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.Black)
            }
        }
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(top = 250.dp),
            horizontalArrangement = Arrangement.Center){

            Image(modifier = Modifier.size(150.dp), painter = painterResource(id = R.drawable.restorankinglogo), contentDescription = null)

        }
    }

}




