package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.recipes.models.Ingredient
import com.artemissoftware.hephaestusui.ui.recipes.models.Recipe
import com.artemissoftware.hephaestusui.ui.theme.DarkGray
import com.artemissoftware.hephaestusui.ui.theme.Pink
import com.artemissoftware.hephaestusui.ui.theme.Transparent

@ExperimentalMaterialApi
@Composable
fun Reviews(recipe: Recipe){

    Column (
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Reviews", fontWeight = Bold, modifier = Modifier.align(Alignment.Top))

            Surface(
                onClick = {},
                shape = MaterialTheme.shapes.small,
                color = Transparent,
                contentColor = Pink,
                role = Role.Button,
            ) {

                Row{
                    Text("See all")
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
        Text(recipe.reviews, color = DarkGray)
    }

}



@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Reviews(Recipe.getMock())
}