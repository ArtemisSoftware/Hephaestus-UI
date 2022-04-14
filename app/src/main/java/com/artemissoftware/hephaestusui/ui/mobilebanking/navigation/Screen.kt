package com.artemissoftware.hephaestusui.ui.mobilebanking.navigation

sealed class Screen(val route: String, val title: String) {
    object Home: Screen("Home", "Home")
    object Cards: Screen("Cards", "Cards")
}
