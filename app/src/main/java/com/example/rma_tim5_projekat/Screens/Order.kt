package com.example.rma_tim5_projekat.Screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.rma_tim5_projekat.R
import com.example.rma_tim5_projekat.components.Artikal

@Composable
fun Order() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.aboutusbg),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )

        Column {

            //HEADER
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.height(Dp(150F))
            ) {

                Image(
                    modifier = Modifier.size(Dp(150F)),
                    painter = painterResource(id = R.drawable.restorankinglogo),
                    contentDescription = null
                )
                Text(text = "Order", color = Color.White, modifier = Modifier.padding(Dp(15F)), fontSize = 30.sp, fontWeight = FontWeight.Bold)


            }
            //HEADER

            var data = arrayOf(
                Triple(painterResource(id = R.drawable.italianoburger), "Godfather Burger", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"),
                Triple(painterResource(id = R.drawable.burgir1), "King Burger", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"),
                Triple(painterResource(id = R.drawable.burgir2), "Pljeska", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"),
                Triple(painterResource(id = R.drawable.burgir3), "Pomfra", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"),
                Triple(painterResource(id = R.drawable.burgir4), "Pica", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"),
                Triple(painterResource(id = R.drawable.burgir5), "Pizza peperoni", "470 gr beef, Swiss cheese, mushrooms, onion, truffle oil, rucola, ranch sauce, lettuce"))



            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Top
            ) {




                items(data.size/4) {
                    data.forEach { item ->
                        Artikal(item.first, item.second, item.third)
                    }





            }

        }
    }
}
}




