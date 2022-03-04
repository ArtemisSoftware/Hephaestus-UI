package com.artemissoftware.hephaestusui.ui.login

import androidx.navigation.NavType
import androidx.navigation.compose.NamedNavArgument
import androidx.navigation.compose.navArgument

sealed class LoginScreens(
    val route: String,
    val arguments: List<NamedNavArgument>
){

    object Login: LoginScreens("login", emptyList())
    object Register: LoginScreens("register", emptyList())
    object Home: LoginScreens(
        "home",
        listOf(
            navArgument("email"){ type = NavType.StringType },
            navArgument("password"){ type = NavType.StringType }
        )
    )

}
