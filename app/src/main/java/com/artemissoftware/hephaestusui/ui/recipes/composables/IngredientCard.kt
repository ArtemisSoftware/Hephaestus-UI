package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.Greeting
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.recipes.models.Ingredient
import com.artemissoftware.hephaestusui.ui.theme.*

@Composable
fun IngredientCard(
    ingredient: Ingredient,
    modifier: Modifier
){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        //modifier = modifier.padding(bottom = 16.dp)
    ) {
        Card(
            shape = IngedientShapes.large,
            backgroundColor = LightGray,
            modifier = Modifier
                .size(100.dp)
                .padding(bottom = 8.dp)
        ) {
            Image(
                painter = painterResource(id = ingredient.icon),
                contentDescription = null,
                modifier = Modifier.padding(16.dp)
            )
        }


        Text(
            text = ingredient.title,
            modifier = Modifier.width(100.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = ingredient.description,
            modifier = Modifier.width(100.dp),
            fontSize = 14.sp,
            color = DarkGray

        )

    }



}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    IngredientCard(Ingredient.getMockList()[0], modifier = Modifier)
}