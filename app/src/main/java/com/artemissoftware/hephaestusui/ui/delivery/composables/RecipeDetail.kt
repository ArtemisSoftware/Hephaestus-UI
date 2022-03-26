package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun RecipeDetail(
    modifier: Modifier = Modifier,
    dish: Dish
){

    var value = remember { mutableStateOf(5) }

    ConstraintLayout(
        modifier = modifier
    ) {

        val (surface, fab) = createRefs()

        Card(
            modifier = Modifier
                .fillMaxWidth()
                //.height(400.dp)
                .constrainAs(surface) {
                    bottom.linkTo(parent.bottom)
                }
            ,
            shape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)
        ) {

            RecipeDetails(dish = dish, value)
        }

        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "Category Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(width = 220.dp, height = 300.dp)
                .constrainAs(fab) {
                    top.linkTo(surface.top, margin = (-150).dp)
                    end.linkTo(surface.end, margin = 36.dp)
                    start.linkTo(surface.start, margin = 36.dp)
                },
        )
    }

}



@Composable
private fun RecipeDetails(
    dish: Dish,
    value: MutableState<Int>){

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(150.dp))

        QuantitySelector(quantity = value)

        Spacer(modifier = Modifier.height(30.dp))

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





@Preview(showBackground = true)
@Composable
private fun RecipeDetailPreview() {
    RecipeDetail(modifier = Modifier, dish = Dish.getMock())
}