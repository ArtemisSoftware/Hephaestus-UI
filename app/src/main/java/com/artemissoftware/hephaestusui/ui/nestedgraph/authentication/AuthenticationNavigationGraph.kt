package com.artemissoftware.hephaestusui.ui.nestedgraph.authentication

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.nestedgraph.composables.NGGenericScreen
import com.artemissoftware.hephaestusui.ui.nestedgraph.graphs.Graph

fun NavGraphBuilder.authenticationNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthDestinationScreen.Login.route
    ) {
        composable(route = AuthDestinationScreen.Login.route) {
            LoginScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthDestinationScreen.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthDestinationScreen.Forgot.route)
                }
            )
        }
        composable(route = AuthDestinationScreen.SignUp.route) {
            NGGenericScreen(name = AuthDestinationScreen.SignUp.route, icon = R.drawable.artemis_2) {}
        }
        composable(route = AuthDestinationScreen.Forgot.route) {
            NGGenericScreen(name = AuthDestinationScreen.Forgot.route) {}
        }
    }
}

sealed class AuthDestinationScreen(val route: String) {
    object Login : AuthDestinationScreen(route = "LOGIN")
    object SignUp : AuthDestinationScreen(route = "SIGN_UP")
    object Forgot : AuthDestinationScreen(route = "FORGOT")
}