package com.artemissoftware.hephaestusui.ui.recipes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.recipes.composables.EasyGrid
import com.artemissoftware.hephaestusui.ui.recipes.composables.TabButton
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes
import com.artemissoftware.hephaestusui.ui.theme.LightGray
import com.artemissoftware.hephaestusui.ui.recipes.composables.IngredientCard
import com.artemissoftware.hephaestusui.ui.recipes.composables.ServingCalculator
import com.artemissoftware.hephaestusui.ui.recipes.models.Recipe
import com.artemissoftware.hephaestusui.ui.theme.White

@Preview(showBackground = true)
@Composable
fun RecipesScreen(){

    //val scrollState = rememberLazyListState()

    Box {
        Content(
            recipe = Recipe.getMock(),
//            scrollState
        )
        //ParallaxToolbar(recipe, scrollState)
    }
}


@Composable
fun Content(
    recipe: Recipe,
//    scrollState: LazyListState
) {
//    LazyColumn(contentPadding = PaddingValues(top = AppBarExpendedHeight), state = scrollState) {
//        item {
//            BasicInfo(recipe)
//            Description(recipe)
    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ServingCalculator()
        IngredientsHeader()
        IngredientsList(recipe = recipe)
        ShoppingListButton()
    }

//
//
//            Reviews(recipe)
//            Images()
//        }
//    }
}


@Composable
private fun ShoppingListButton(){

    Button(
        onClick = {},
        contentPadding = PaddingValues(),
        elevation = null,
        shape = IngedientShapes.small,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = LightGray,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(text = "Add to shopping list", modifier = Modifier.padding(8.dp))
    }
}





@Composable
private fun IngredientsList(recipe: Recipe) {
    EasyGrid(
        numberOfColumns = 3,
        items = recipe.ingredients,
        content = {
            IngredientCard(
                ingredient = it,
                modifier = Modifier
            )
        }
    )
}



@Composable
private fun IngredientsHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
//            .padding(horizontal = 16.dp, vertical = 16.dp)
            .clip(IngedientShapes.medium)
            .background(LightGray)
            .fillMaxWidth()
            .height(44.dp)
    ) {
        TabButton("Ingredients", true, Modifier.weight(1f))
        TabButton("Tools", false, Modifier.weight(1f))
        TabButton("Steps", false, Modifier.weight(1f))
    }
}

