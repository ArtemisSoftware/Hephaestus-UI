package com.artemissoftware.hephaestusui.ui.login

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.login.composables.NavigationBar
import com.artemissoftware.hephaestusui.ui.login.composables.RegisterForm
import com.artemissoftware.hephaestusui.ui.login.composables.RegisterOptions
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@ExperimentalFoundationApi
@Composable
fun RegistrationScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ){

        item {

            Column {

                NavigationBar()
                RegisterForm()
                RegisterOptions()
            }
        }
    }

}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        RegistrationScreen()
    }
}