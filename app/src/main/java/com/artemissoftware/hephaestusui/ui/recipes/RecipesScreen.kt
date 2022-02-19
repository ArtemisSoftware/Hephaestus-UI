package com.artemissoftware.hephaestusui.ui.recipes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.Greeting
import com.artemissoftware.hephaestusui.ui.recipes.composables.TabButton
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes
import com.artemissoftware.hephaestusui.ui.theme.LightGray

@Preview(showBackground = true)
@Composable
fun RecipesScreen(){

    //val scrollState = rememberLazyListState()

    Box {
        Content(
//            recipe,
//            scrollState
        )
        //ParallaxToolbar(recipe, scrollState)
    }
}


@Composable
fun Content(
//    recipe: Recipe,
//    scrollState: LazyListState
) {
//    LazyColumn(contentPadding = PaddingValues(top = AppBarExpendedHeight), state = scrollState) {
//        item {
//            BasicInfo(recipe)
//            Description(recipe)
//            ServingCalculator()
            IngredientsHeader()
//            IngredientsList(recipe)
//            ShoppingListButton()
//            Reviews(recipe)
//            Images()
//        }
//    }
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

