package com.artemissoftware.hephaestusui.ui.nestedgraph.home

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.artemissoftware.hephaestusui.ui.nestedgraph.composables.NGGenericScreen
import com.artemissoftware.hephaestusui.ui.nestedgraph.graphs.Graph
import com.artemissoftware.hephaestusui.ui.nestedgraph.models.BottomBarItem

@Composable
fun HomeNavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.HOME,
        startDestination = BottomBarItem.Home.route
    ) {

        composable(route = BottomBarItem.Home.route) {
            NGGenericScreen(
                name = BottomBarItem.Home.route,
                onClick = {
                    navController.navigate(Graph.DETAILS)
                }
            )
        }

        composable(route = BottomBarItem.Profile.route) {
            NGGenericScreen(
                name = BottomBarItem.Profile.route,
                onClick = { }
            )
        }

        composable(route = BottomBarItem.Settings.route) {
            NGGenericScreen(
                name = BottomBarItem.Settings.route,
                onClick = { }
            )
        }

        //detailsNavGraph(navController = navController)
    }
}