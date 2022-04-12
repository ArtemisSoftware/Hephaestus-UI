package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.sneakershop.SneakerCard
import com.artemissoftware.hephaestusui.ui.sneakershop.models.Sneaker
import com.artemissoftware.hephaestusui.ui.theme.BadgeColor
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.NotifyColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun BalanceInfo() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "$4,258.50",
                color = Color.White,
                modifier = Modifier.weight(1f),
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .align(Alignment.End),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BadgedBox(
                        badge = {
                            Badge(backgroundColor = BadgeColor) { }
                        }
                    ) {
                        Icon(
                            Icons.Filled.Notifications,
                            contentDescription = "Notification",
                            tint = NotifyColor,
                            modifier = Modifier
                                .rotate(10f)
                                .size(25.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(15.dp))

                    Image(
                        painter = painterResource(id = R.drawable.artemis_3),
                        contentDescription = "Profile Icon",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .border(1.dp, Color.White, RoundedCornerShape(10.dp))
                            .size(40.dp)
                            .padding(3.dp)
                            .clip(RoundedCornerShape(7.dp))
                    )
                }
            }
        }


        Text(
            text = "Available Balance",
            color = Color.White.copy(alpha = 0.5f),
            fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BalanceInfo()
}