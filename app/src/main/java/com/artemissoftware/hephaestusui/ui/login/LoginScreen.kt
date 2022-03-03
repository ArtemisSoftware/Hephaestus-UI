package com.artemissoftware.hephaestusui.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme


@Composable
fun LoginScreen() {

    Box (
        modifier = Modifier.fillMaxSize()
    ){

        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = null,
        )

        LoginMenu()
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        LoginScreen()
    }
}