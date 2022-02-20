package com.artemissoftware.hephaestusui.ui.recipes.models

import com.artemissoftware.hephaestusui.R

data class Recipe(
    val title: String,
    val category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
){

    companion object{

        fun getMock() : Recipe{

            val strawberryCake = Recipe(
                title = "Strawberry Cake",
                category = "Desserts",
                cookingTime = "50 min",
                energy = "620 kcal",
                rating = "4,9",
                description = "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.",
                reviews = "84 photos     430 comments",
                ingredients = listOf(
                    Ingredient(R.drawable.flour, "Flour", "450 g"),
                    Ingredient(R.drawable.eggs, "Eggs", "4"),
                    Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
                    Ingredient(R.drawable.strawberry, "Strawberry", "200 g"),
                    Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
                    Ingredient(R.drawable.mind, "Mind", "20 g"),
                    Ingredient(R.drawable.vanilla, "Vanilla", "1/2 teaspoon"),
                )
            )

            return strawberryCake
        }
    }

}

