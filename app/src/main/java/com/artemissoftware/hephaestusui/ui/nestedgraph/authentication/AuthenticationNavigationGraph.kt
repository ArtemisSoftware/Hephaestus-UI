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
        startDestination = AuthScreen.Login.route
    ) {
        composable(route = AuthScreen.Login.route) {
            LoginScreen(
                onClick = {
                    navController.popBackStack()
                    navController.navigate(Graph.HOME)
                },
                onSignUpClick = {
                    navController.navigate(AuthScreen.SignUp.route)
                },
                onForgotClick = {
                    navController.navigate(AuthScreen.Forgot.route)
                }
            )
        }
        composable(route = AuthScreen.SignUp.route) {
            NGGenericScreen(name = AuthScreen.SignUp.route, icon = R.drawable.artemis_2) {}
        }
        composable(route = AuthScreen.Forgot.route) {
            NGGenericScreen(name = AuthScreen.Forgot.route) {}
        }
    }
}

sealed class AuthScreen(val route: String) {
    object Login : AuthScreen(route = "LOGIN")
    object SignUp : AuthScreen(route = "SIGN_UP")
    object Forgot : AuthScreen(route = "FORGOT")
}