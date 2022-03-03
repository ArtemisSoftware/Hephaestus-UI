package com.artemissoftware.hephaestusui.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.login.composables.NavigationBar
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@Composable
fun RegistrationScreen() {

    LazyColumn{

        item {

            Column {

                NavigationBar()
//                RegisterForm()
//                RegisterOptions()
            }

        }

    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        RegistrationScreen()
    }
}