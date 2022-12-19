package com.artemissoftware.hephaestusui.ui.deeplinking.third

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.deeplinking.DetailDeepLinkScreen

fun NavGraphBuilder.thirdGraph(navController: NavHostController) {

    navigation(
        startDestination = "Third_One",
        route = "Third_LINK"
    ) {

        composable(
            route = "Third_One",
            deepLinks = listOf(
                navDeepLink {
                    uriPattern = "https://pl-coding.com/third/{id}"
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
            DetailDeepLinkScreen(id, "thirdGraph", navController)
        }

        composable(
            route = "Third_One_2",
        ) { entry ->

            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(onClick = {

                }) {
                    Text(text = "Third_One_2")
                }
            }

            //DetailDeepLinkScreen(11111, "thirdGraph")
        }
    }

}
//
//
//@Composable
//fun ThirdGraph(rememberNavController: NavHostController) {
//
//    val navController = rememberNavController()
//
//    NavHost(
//        navController = navController,
//        startDestination = "Third_One"
//    ) {
//
//        composable(
//            route = "Third_One",
//        ) { entry ->
//
//            Box(
//                modifier = Modifier.fillMaxSize(),
//                contentAlignment = Alignment.Center
//            ) {
//                Button(onClick = {
//
//                }) {
//                    Text(text = "Third To detail")
//                }
//            }
//
//            //DetailDeepLinkScreen(11111, "thirdGraph")
//        }
//
//
//        composable(
//            route = "Third_One_two",
//            deepLinks = listOf(
//                navDeepLink {
//                    uriPattern = "https://pl-coding.com/third/{id}"
//                    action = Intent.ACTION_VIEW
//                }
//            ),
//            arguments = listOf(
//                navArgument("id") {
//                    type = NavType.IntType
//                    defaultValue = -1
//                }
//            )
//        ) { entry ->
//
//            val id = entry.arguments?.getInt("id")
//            DetailDeepLinkScreen(id, "thirdGraph")
//        }
//    }
//}