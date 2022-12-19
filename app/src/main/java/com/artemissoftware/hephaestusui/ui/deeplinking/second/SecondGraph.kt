package com.artemissoftware.hephaestusui.ui.deeplinking

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import com.artemissoftware.hephaestusui.ui.deeplinking.third.thirdGraph

fun NavGraphBuilder.secondGraph(navController: NavHostController) {

    navigation(
        startDestination = "Second_One",
        route = "SECOND_LINK"
    ) {


        composable(
            route = "Second_One",
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://pl-coding.com/{id}"
                    action = Intent.ACTION_VIEW
                }
            ),
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = -1
                }
            )
        ) { entry ->

            val id = entry.arguments?.getInt("id")
            DetailDeepLinkScreen(id, "secondGraph")
        }

        composable(
            route = "Second_One_two",
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://pl-coding.com/second/{id}"
                    action = Intent.ACTION_VIEW
                }
            ),
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = -1
                }
            )
        ) { entry ->

            val id = entry.arguments?.getInt("id")
            DetailDeepLinkScreen(id, "secondGraph_two", navController)
        }


                composable(
            route = "Second_One_3",
        ) { entry ->

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {
                    navController.navigate("Third_One_2")
                }) {
                    Text(text = "Second_One_3")
                }
            }

            //DetailDeepLinkScreen(11111, "thirdGraph")
        }


        thirdGraph(navController)

    }

}