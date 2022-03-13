package com.artemissoftware.hephaestusui.ui.sneakershop

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.login.composables.LoginMenu
import com.artemissoftware.hephaestusui.ui.login.states.LoginState
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@Composable
fun SneakerShopScreen(){

    Column {

        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "", tint = Color.Black)
        }

        Text(text = "Title")

        Text(text = "Description")

    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SneakerShopScreen()
}