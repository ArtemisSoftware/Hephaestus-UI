package com.artemissoftware.hephaestusui.ui.nestedgraph.home

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.nestedgraph.composables.bottombar.NGBottomBar


@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        bottomBar = { NGBottomBar(navController = navController) }
    ) {
        HomeNavigationGraph(navController = navController)
    }
}