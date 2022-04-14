package com.artemissoftware.hephaestusui.ui.mobilebanking.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.artemissoftware.hephaestusui.ui.mobilebanking.MobileBankingScreen
import com.artemissoftware.hephaestusui.ui.mobilebanking.MobileCardScreen

@Composable
fun MobileNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            MobileBankingScreen()
        }
        composable(Screen.Cards.route) {
            MobileCardScreen()
        }
    }
}