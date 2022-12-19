package com.artemissoftware.hephaestusui.ui.deeplinking

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun DetailDeepLinkScreen(id: Int?, message: String = "", navController: NavHostController? = null) {

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = message + "The id is $id")

        Button(onClick = {
            navController?.popBackStack(route = "home", inclusive = false)
        }, modifier = Modifier.align(Alignment.TopCenter)) {
            Text(text = "Back")
        }


//        BackHandler {
//            navController?.popBackStack(route = "home", inclusive = false)
//        }
        //ThirdGraph(rememberNavController())
    }
}