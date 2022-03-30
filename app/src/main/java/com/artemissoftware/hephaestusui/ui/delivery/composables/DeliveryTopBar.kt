package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun DeliveryTopBar() {

    TopAppBar(
        backgroundColor = Color.White,
        elevation = 0.dp,
        navigationIcon = {
            IconButton(
                onClick = { }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.four_dot),
                    contentDescription = "Navigation Menu",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.size(25.dp)
                )
            }
        },
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    Icons.Outlined.LocationOn,
                    contentDescription = "Location",
                    tint = FoodColor,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Pick Location",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        },
        actions = {
            IconButton(
                onClick = { }
            ) {
                Icon(
                    Icons.Outlined.Person,
                    contentDescription = "Profile"
                )
            }
        },

    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DeliveryTopBar()
}