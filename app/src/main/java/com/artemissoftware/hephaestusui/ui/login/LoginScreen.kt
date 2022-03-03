package com.artemissoftware.hephaestusui.ui.login

import android.R.attr
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import androidx.compose.ui.layout.ContentScale



@Composable
fun LoginScreen() {

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)

    ) {

        Image(
            painter = painterResource(id = R.drawable.login_logo),
            contentDescription = "Login Image",
            contentScale = ContentScale.Inside
        )

        LoginMenu(
            modifier = Modifier.align(Alignment.BottomCenter)
        )

    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LoginJetpackComposeTheme {
        LoginScreen()
    }
}