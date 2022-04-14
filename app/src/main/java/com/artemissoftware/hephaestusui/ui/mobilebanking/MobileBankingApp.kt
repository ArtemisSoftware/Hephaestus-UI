package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.BottomBar
import com.artemissoftware.hephaestusui.ui.mobilebanking.navigation.MobileNavigation

@Composable
fun MobileBankingApp() {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomBar(navController)
        }
    ) {
        MobileNavigation(navController)
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileBankingApp()
}