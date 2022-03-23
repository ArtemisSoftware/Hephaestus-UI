package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun RecipeSpecifications(dish: Dish) {


    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Row {
            Image(
                painter = painterResource(id = R.drawable.star),
                contentDescription = "Rating",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(20.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = dish.rating,
                fontFamily = Poppins,
                color = Color.Black,
                fontSize = 14.sp
            )
        }



        Row {
            Image(
                painter = painterResource(id = R.drawable.flame),
                contentDescription = "Rating",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(20.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = dish.calories,
                fontFamily = Poppins,
                color = Color.Black,
                fontSize = 14.sp
            )
        }


        Row {
            Image(
                painter = painterResource(id = R.drawable.chronometer),
                contentDescription = "Rating",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(20.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = dish.duration,
                fontFamily = Poppins,
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RecipeSpecifications(Dish.getMock())
}