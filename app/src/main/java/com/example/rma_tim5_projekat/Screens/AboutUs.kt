package com.example.rma_tim5_projekat.Screens



import android.icu.text.ListFormatter.Width
import android.text.style.BackgroundColorSpan
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.rma_tim5_projekat.R
import com.example.rma_tim5_projekat.navigation.Screen
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun AboutUs(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
    )
    {
        Image(modifier = Modifier.fillMaxSize()
            .clickable { navController.navigate("${Screen.HomePage.route}/${""}") }
            , painter = painterResource(id = R.drawable.aboutusbg), contentDescription = null, contentScale = ContentScale.Crop )

    }
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.height(Dp(150F))
        ){
            Column(modifier = Modifier
                .width(120.dp)
                .padding(20.dp)
            ) {
                Image(modifier = Modifier.size(Dp(50F))
                    .clickable { navController.navigate(Screen.HomePage.route) }
                    , painter = painterResource(id = R.drawable.back), contentDescription = null)
            }
            Column {
                Image(modifier = Modifier.size(Dp(150F)), painter = painterResource(id = R.drawable.restorankinglogo), contentDescription = null)
            }

        }
        Row(modifier = Modifier.padding(Dp(20F))) {
            Text(fontSize = 20.sp, color = Color.White, text = "Indulge in our flavuor-packed burgers, " +
                    "meticulously crafted with premium ingredients. Beyond food, our inviting ambiance and " +
                    "exceptional service ensure a memorable dining experience. With multiple locations catering to " +
                    "locals and explorers alike, Restaurant King promises a royal feast at every visit.")
        }
        Row(modifier = Modifier.padding(Dp(20F))) {
            Text(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = Color.White, text = "Join us for a royal " +
                    "culinary adventure across our four convenient locations:\n" +
                    "Kranjčevićeva 20, Sarajevo 71000\n" +
                    "Huse Maslića, Mostar 88000\n" +
                    "Fra Grge Martića 30, Tuzla 75000\n" +
                    "Prve zeničke brigade 60, Zenica 72000")
        }
        Row(modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center){

            Image(modifier = Modifier.size(150.dp), painter = painterResource(id = R.drawable.restorankinglogo), contentDescription = null)
            
        }

    }

}




