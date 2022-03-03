package com.artemissoftware.hephaestusui.ui.login.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.login.RegistrationScreen
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme

@Composable
fun NavigationBar() {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        IconButton(
            onClick = {
                // TODO("BACK BUTOON")
            }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Icon",
                tint = MaterialTheme.colors.primary
            )
        }

        Text(
            text = "Create An Account",
            style = MaterialTheme.typography.h5.copy(
                color = MaterialTheme.colors.primary
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    NavigationBar()
}