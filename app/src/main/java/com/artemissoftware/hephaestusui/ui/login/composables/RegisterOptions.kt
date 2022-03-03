package com.artemissoftware.hephaestusui.ui.login.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.theme.FACEBOOKCOLOR
import com.artemissoftware.hephaestusui.ui.theme.GMAILCOLOR

@Composable
fun RegisterOptions(){

    Column(
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){

            Divider(
                modifier = Modifier.width(24.dp),
                thickness = 1.dp,
                color = Color.Gray
            )

            Text(
                modifier = Modifier.padding(8.dp),
                text = "OR",
                style = MaterialTheme.typography.h6.copy(
                    fontWeight = FontWeight.Black
                )
            )

            Divider(
                modifier = Modifier.width(24.dp),
                thickness = 1.dp,
                color = Color.Gray
            )
        }

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Login with",
            style = MaterialTheme.typography.body1.copy(
                MaterialTheme.colors.primary
            ),
            textAlign = TextAlign.Center
        )


        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            SocialMediaButton(
                text = "Login with Facebook",
                onClick = {  },
                socialMediaColor = FACEBOOKCOLOR
            )

            SocialMediaButton(
                text = "Login with Gmail",
                onClick = { },
                socialMediaColor = GMAILCOLOR
            )
        }
    }


}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RegisterOptions()
}