package com.artemissoftware.hephaestusui.ui.login.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.artemissoftware.hephaestusui.ui.login.HomeScreen
import com.artemissoftware.hephaestusui.ui.login.LoginScreen
import com.artemissoftware.hephaestusui.ui.login.LoginViewModel
import com.artemissoftware.hephaestusui.ui.login.RegistrationScreen
import com.artemissoftware.hephaestusui.ui.login.states.LoginState
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@ExperimentalAnimationApi
@Composable
fun LoginNavigation() {

    val navController = rememberAnimatedNavController()

    //BoxWithConstraints {
        AnimatedNavHost(
            navController = navController,
            startDestination = LoginScreens.Login.route
        ){
            login(navController)

            Register(navController)

            Home()
        }
    //}
}



@ExperimentalComposeUiApi
@ExperimentalFoundationApi
@ExperimentalAnimationApi
private fun NavGraphBuilder.login(
    navController: NavHostController
){
    composable(
        route = LoginScreens.Login.route,
        enterTransition = { _, _ ->
            slideInHorizontally(
                initialOffsetX = { 1000 },
                animationSpec = tween(500)
            )
        },
        exitTransition = { _, _ ->
            slideOutHorizontally(
                targetOffsetX = { -1000 },
                animationSpec = tween(500)
            )
        },
        popEnterTransition = {_,_ ->
            slideInHorizontally(
                initialOffsetX = { -1000 },
                animationSpec = tween(500)
            )
        },
        popExitTransition = { _, _ ->
            slideOutHorizontally(
                targetOffsetX = { 1000 },
                animationSpec = tween(500)
            )
        }
    ){

        val viewModel: LoginViewModel = hiltViewModel()

//        val email = viewModel.state.value.email
//        val password = viewModel.state.value.password
//
//        if(viewModel.state.value.successLogin){
//            LaunchedEffect(key1 = Unit){
//                navController.navigate(
//                    Destinations.Home.route + "/$email" + "/$password"
//                ){
//                    popUpTo(Destinations.Login.route){
//                        inclusive = true
//                    }
//                }
//            }
//        } else {
            LoginScreen(
                state = viewModel.state.value,
                onLogin = viewModel::login,
                onNavigateToRegister = {
                    navController.navigate(LoginScreens.Register.route)
                },
                onDismissDialog = viewModel::hideErrorDialog
            )
//        }
    }
}




@ExperimentalFoundationApi
@ExperimentalAnimationApi
fun NavGraphBuilder.Register(
    navController: NavHostController
){
    composable(
        route = LoginScreens.Register.route,
        enterTransition = { _, _ ->
            slideInHorizontally(
                initialOffsetX = { 1000 },
                animationSpec = tween(500)
            )
        },
        exitTransition = { _, _ ->
            slideOutHorizontally(
                targetOffsetX = { -1000 },
                animationSpec = tween(500)
            )
        },
        popEnterTransition = {_,_ ->
            slideInHorizontally(
                initialOffsetX = { -1000 },
                animationSpec = tween(500)
            )
        },
        popExitTransition = { _, _ ->
            slideOutHorizontally(
                targetOffsetX = { 1000 },
                animationSpec = tween(500)
            )
        }
    ){
//        val viewModel: RegisterViewModel = hiltViewModel()

        RegistrationScreen(
//            state = viewModel.state.value,
//            onRegister = viewModel::register,
//            onBack = {
//                navController.popBackStack()
//            },
//            onDismissDialog = viewModel::hideErrorDialog
        )
    }
}

@ExperimentalAnimationApi
fun NavGraphBuilder.Home() {
    composable(
        route = LoginScreens.Home.route + "/{email}" + "/{password}",
        arguments = LoginScreens.Home.arguments
    ){ backStackEntry ->

        val email = backStackEntry.arguments?.getString("email") ?: ""
        val password = backStackEntry.arguments?.getString("password") ?: ""

        HomeScreen(email, password)
    }
}
