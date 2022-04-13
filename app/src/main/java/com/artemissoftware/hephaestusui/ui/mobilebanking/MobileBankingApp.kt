package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.BottomBar

@Composable
fun MobileBankingApp() {
    Scaffold(
        bottomBar = {
            BottomBar()
        }
    ) {
        MobileBankingScreen()
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileBankingApp()
}