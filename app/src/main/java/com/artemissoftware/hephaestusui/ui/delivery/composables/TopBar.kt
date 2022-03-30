package com.artemissoftware.hephaestusui.ui.delivery.composables

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish

@Preview(showBackground = true)
@Composable
fun TopBar() {

    val activity = LocalContext.current as Activity

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier
                .weight(1f),

        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(40.dp)
                    .clickable {
                        activity.onBackPressed()
                    }
                    .background(Color.White)
            ) {
                Icon(
                    Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "Back Arrow",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(25.dp),
                    tint = Color.Black
                )
            }
        }

        Column(
            modifier = Modifier
                .weight(1f),

        ) {

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(40.dp)
                    .background(Color.White)
                    .align(Alignment.End)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.two_dot),
                    contentDescription = "Menu",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(15.dp)
                        .rotate(90f),
                    tint = Color.Black
                )
            }
        }
    }

}