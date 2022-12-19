package com.artemissoftware.hephaestusui.ui.deeplinking

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun HomeDeepLinkScreen(navController: NavHostController, navigate: String) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(onClick = {
            navController.navigate(navigate)
        }) {
            Text(text = "To detail")
        }

        Button(onClick = {
            navController.navigate("Second_One_3")
        },modifier = Modifier.align(Alignment.BottomCenter)) {
            Text(text = "Tmove")
        }
    }

}