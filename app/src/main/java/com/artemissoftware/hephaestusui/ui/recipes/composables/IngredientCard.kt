package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.Greeting
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme
import com.artemissoftware.hephaestusui.ui.theme.Shapes

@Composable
fun IngredientCard(){

    Card(
        shape = Shapes.large,
        backgroundColor = Color.Red,
        modifier = Modifier
            .size(100.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.artemis_3),
            contentDescription = null,
            modifier = Modifier.padding(16.dp)
        )
    }


}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    IngredientCard()
}