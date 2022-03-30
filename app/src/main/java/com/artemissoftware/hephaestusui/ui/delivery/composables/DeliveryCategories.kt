package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.theme.CategoryBackgroundColor
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun DeliveryCategories(delivery: Delivery) {

    Column(

    ) {

        Text(
            text = "Categories",
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(25.dp))

        LazyRow {
            items(10) { index ->

                Pill(food = delivery.getFood(index), index = index, foodImage = delivery.getImage(index))
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }

}

@Composable
private fun Pill(
    food: String,
    index: Int,
    foodImage: Int
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .background(
                if (index == 0) FoodColor else CategoryBackgroundColor
            )
            .wrapContentWidth()
            .padding(horizontal = 15.dp, vertical = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(
                    id = foodImage
                ),
                contentDescription = "Category Image",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(25.dp)
                    .clip(CircleShape)
                    .background(Color.White)
            )
        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = food,
            fontFamily = Poppins,
            color = if (index == 0) Color.White else Color.Black,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DeliveryCategories(delivery = Delivery.getMock())
}

@Preview(showBackground = true)
@Composable
private fun PillPreview() {
    Pill(food = "Burger", index = 0, foodImage = R.drawable.burger_one)
}