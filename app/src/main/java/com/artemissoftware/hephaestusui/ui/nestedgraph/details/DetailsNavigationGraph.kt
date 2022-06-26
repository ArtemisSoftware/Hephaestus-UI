package com.artemissoftware.hephaestusui.ui.nestedgraph.details

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.nestedgraph.composables.NGGenericScreen
import com.artemissoftware.hephaestusui.ui.nestedgraph.graphs.Graph

fun NavGraphBuilder.detailsNavigationGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsDestinationScreen.Information.route
    ) {
        composable(route = DetailsDestinationScreen.Information.route) {
            NGGenericScreen(
                name = DetailsDestinationScreen.Information.route,
                icon = R.drawable.artemis_3
            ) {
                navController.navigate(DetailsDestinationScreen.Overview.route)
            }
        }
        composable(route = DetailsDestinationScreen.Overview.route) {
            NGGenericScreen(name = DetailsDestinationScreen.Overview.route) {
                navController.popBackStack(
                    route = DetailsDestinationScreen.Information.route,
                    inclusive = false
                )
            }
        }
    }
}

sealed class DetailsDestinationScreen(val route: String) {
    object Information : DetailsDestinationScreen(route = "INFORMATION")
    object Overview : DetailsDestinationScreen(route = "OVERVIEW")
}