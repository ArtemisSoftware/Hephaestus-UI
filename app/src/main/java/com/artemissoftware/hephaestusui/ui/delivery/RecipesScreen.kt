package com.artemissoftware.hephaestusui.ui.delivery

import android.app.Activity
import android.text.Html
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.composables.*
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.theme.FoodBackgroundColor
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins
import com.artemissoftware.hephaestusui.ui.theme.Purple700


@Composable
fun RecipesScreen_(dish: Dish) {

    var value = remember { mutableStateOf(5) }
    val activity = LocalContext.current as Activity

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
            TopBar()
        }
        Column(
            modifier = Modifier
                .weight(0.72f)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(Color.White)
        ) { }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(70.dp))
        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "Category Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(width = 220.dp, height = 300.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))

        QuantitySelector(quantity = value)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
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



@Composable
fun RecipesScreen(dish: Dish) {

    ConstraintLayout(
        modifier = Modifier.background(FoodBackgroundColor)
    ) {

        val (surfac, fabe) = createRefs()

        Column(
            modifier = Modifier
                .constrainAs(surfac) {
                    top.linkTo(parent.top)
            }
                .background(FoodBackgroundColor)
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            TopBar()
        }


        RecipeDetail(
            dish = dish,
            modifier= Modifier
            .constrainAs(fabe) {
                top.linkTo(surfac.bottom, margin = (150).dp)
            },
        )
    }


}



@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RecipesScreen(Dish.getMock())
}
