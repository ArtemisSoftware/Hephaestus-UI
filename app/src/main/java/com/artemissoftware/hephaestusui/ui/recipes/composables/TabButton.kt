package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.recipes.models.Ingredient
import com.artemissoftware.hephaestusui.ui.theme.*

@Composable
fun TabButton(
    description : String,
    active: Boolean = true,
    modifier: Modifier
){

    val color = if (active) ButtonDefaults.buttonColors(
        backgroundColor = Pink,
        contentColor = White
    ) else ButtonDefaults.buttonColors(
        backgroundColor = LightGray,
        contentColor = DarkGray
    )


    Button(
        onClick = { /*TODO*/ },
        shape = IngedientShapes.medium,
        colors = color,
        modifier = modifier.fillMaxHeight(),
        elevation = null,
    ) {

        Text(text = description)
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Column {
        TabButton("Description", active = false, modifier = Modifier)
        TabButton("Description", modifier = Modifier)
    }

}