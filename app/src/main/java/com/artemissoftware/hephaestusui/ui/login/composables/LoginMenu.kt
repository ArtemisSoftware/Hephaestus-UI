package com.artemissoftware.hephaestusui.ui.login.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.login.LoginScreen
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@Composable
fun LoginMenu() {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column {
            Text(
                text = "Welcome Back!",
                style = MaterialTheme.typography.h4.copy(
                    fontWeight = FontWeight.Medium
                )
            )

            Text(
                text = "Login to your Account",
                style = MaterialTheme.typography.h5.copy(
                    color = MaterialTheme.colors.primary
                )
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        LoginMenu()
    }
}