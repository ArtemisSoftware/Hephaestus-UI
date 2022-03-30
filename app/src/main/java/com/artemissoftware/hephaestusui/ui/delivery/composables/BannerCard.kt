package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.theme.FoodBackgroundColor
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun BannerCard(delivery: Delivery){

    Card(
        modifier = Modifier
            .height(150.dp)
            .fillMaxWidth(),
        backgroundColor = FoodBackgroundColor,
        shape = RoundedCornerShape(15.dp),
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp, bottom = 10.dp, start = 20.dp, end = 10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier
                    .weight(0.4f)
                    .fillMaxWidth()
            ) {

                HtmlTextFormater(htmlText = delivery.banner)

                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = { },
                    modifier = Modifier
                        .width(100.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    colors = ButtonDefaults.buttonColors(FoodColor)
                ) {
                    Text(
                        text = "Order Now",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 10.sp
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.6f)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.delivery_image),
                    contentDescription = "Delivery Image",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

        }

    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    BannerCard(delivery = Delivery.getMock())
}