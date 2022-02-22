package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.recipes.models.Ingredient
import com.artemissoftware.hephaestusui.ui.recipes.models.Recipe
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes
import com.artemissoftware.hephaestusui.ui.theme.Pink

@Composable
fun BasicInfo(recipe: Recipe) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        InfoColumn(iconResouce = R.drawable.ic_clock, text = recipe.cookingTime)
        InfoColumn(iconResouce = R.drawable.ic_flame, text = recipe.energy)
        InfoColumn(iconResouce = R.drawable.ic_star, text = recipe.rating)
    }
}


@Composable
private fun InfoColumn(
    @DrawableRes iconResouce: Int,
    text: String
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = iconResouce),
            contentDescription = null,
            tint = Pink,
            modifier = Modifier.height(24.dp)
        )
        Text(text = text, fontWeight = FontWeight.Bold)
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BasicInfo(Recipe.getMock())
}