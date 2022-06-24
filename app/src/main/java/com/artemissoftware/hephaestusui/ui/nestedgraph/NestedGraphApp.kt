package com.artemissoftware.hephaestusui.ui.nestedgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.nestedgraph.graphs.RootNavigationGraph

@Composable
fun NestedGraphApp() {
    RootNavigationGraph(navController = rememberNavController())
}