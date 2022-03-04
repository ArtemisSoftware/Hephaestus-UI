package com.artemissoftware.hephaestusui.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@Composable
fun HomeScreen(
    email: String,
    password: String
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Home Screen",
            style = MaterialTheme.typography.h3
        )

        Text("Email: $email, password: $password")
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        HomeScreen(
            email = "email",
            password = "password"
        )
    }
}