package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.theme.Poppins
import com.artemissoftware.hephaestusui.ui.theme.ViewAllColor
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.PopularDelivery

@Composable
fun PopularNow(popularDelivery: PopularDelivery) {

    Column {


        Row {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Popular Now",
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 18.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }

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
                    Text(
                        text = "View All",
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        color = ViewAllColor,
                        fontSize = 12.sp
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ic_baseline_arrow_circle_right_24),
                        contentDescription = "view all Image",
                        modifier = Modifier.size(20.dp),
                        colorFilter = ColorFilter.tint(ViewAllColor)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyRow {
            items(10) { index ->
                Popular(popularDelivery = popularDelivery, index = index)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }

    }
}


@Composable
fun Popular(
    popularDelivery: PopularDelivery,
    index: Int) {

    Card(
        modifier = Modifier
            .width(180.dp)
            .wrapContentHeight()
            .padding(start = 5.dp)
            .clickable {
                //navController.navigate("recipe_screen")
            }
            ,
        elevation = 5.dp,
        shape = RoundedCornerShape(10.dp)
    ) {
        
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 16.dp, bottom = 20.dp)
        ) {


            Image(
                painter = painterResource(id = popularDelivery.getImages(index = index)),
                contentDescription = "Category Image",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(120.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = popularDelivery.getTitle(index),
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = popularDelivery.getDescription(index),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Light,
                    color = Color.Gray,
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.width(5.dp))

                Image(
                    painter = painterResource(id = popularDelivery.getSupplement(index)),
                    contentDescription = "Category Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                )
            }


            Spacer(modifier = Modifier.height(12.dp))
            
            HtmlTextFormater(htmlText = popularDelivery.getPrice(index))
        }
        
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    PopularNow(PopularDelivery.getMock())
}

@Preview(showBackground = true)
@Composable
private fun PopularPreview() {
    Popular(PopularDelivery.getMock(), 0)
}