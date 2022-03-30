package com.artemissoftware.hephaestusui.ui.delivery

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish

@ExperimentalMaterialApi
@Composable
fun DeliveryApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home_screen"
    ) {
        composable("home_screen") {
            RestaurantHomeScreen(
                delivery = Delivery.getMock(),
                navController = navController)
        }
        composable("recipe_screen") {
            RecipesScreen(
               dish = Dish.getMock()
            )
        }
    }
}