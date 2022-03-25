package com.artemissoftware.hephaestusui.ui.delivery

import android.app.Activity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.delivery.composables.HtmlTextFormater
import com.artemissoftware.hephaestusui.ui.delivery.composables.QuantitySelector
import com.artemissoftware.hephaestusui.ui.delivery.composables.RecipeSpecifications
import com.artemissoftware.hephaestusui.ui.delivery.composables.RecipeSummary
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun RecipesScreen(dish: Dish) {
    var value = remember { mutableStateOf(5) }
    val activity = LocalContext.current as Activity

    /*
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FoodBackgroundColor)
    ) {
        Column(
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 30.dp, end = 30.dp)
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .size(40.dp)
                            .clickable {
                                activity.onBackPressed()
                            }
                            .background(Color.White),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            Icons.Filled.KeyboardArrowLeft,
                            contentDescription = "Back Arrow",
                            modifier = Modifier
                                .size(25.dp),
                            tint = Color.Black
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Column(
                            modifier = Modifier
                                .clip(RoundedCornerShape(10.dp))
                                .size(40.dp)
                                .background(Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.two_dot),
                                contentDescription = "Menu",
                                modifier = Modifier
                                    .size(15.dp)
                                    .rotate(90f),
                                tint = Color.Black
                            )
                        }
                    }
                }
            }
        }
        Column(
            modifier = Modifier
                .weight(0.72f)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(Color.White)
        ) { }
    }
*/
    Column {

        Spacer(modifier = Modifier.height(70.dp))
        /*
Image(
    painter = painterResource(id = R.drawable.burger_img),
    contentDescription = "Category Image",
    contentScale = ContentScale.FillBounds,
    modifier = Modifier.size(width = 220.dp, height = 300.dp)
)

 */
        Spacer(modifier = Modifier.height(30.dp))
        QuantitySelector(value)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                //.padding(30.dp)
        ) {

            RecipeSummary(dish = dish)

            Spacer(modifier = Modifier.height(25.dp))
            
            RecipeSpecifications(dish = dish)

            Spacer(modifier = Modifier.height(25.dp))

            HtmlTextFormater(htmlText = dish.descriptionHtml)

            Spacer(modifier = Modifier.height(25.dp))

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(FoodColor),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp))
                    .height(65.dp)
            ) {

                Text(
                    text = "Add to Cart",
                    fontFamily = Poppins,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RecipesScreen(Dish.getMock())
}