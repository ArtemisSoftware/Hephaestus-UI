package com.artemissoftware.hephaestusui.ui.delivery.composables

import android.text.Html
import android.widget.TextView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
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
import androidx.compose.ui.viewinterop.AndroidView
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun RecipeSummary(dish: Dish) {
    
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {



        Column(
            modifier = Modifier.weight(0.7f)
        ) {

            Text(
                text = dish.title,
                fontFamily = Poppins,
                color = Color.Black,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = dish.extra,
                    fontFamily = Poppins,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.width(8.dp))
                Image(
                    painter = painterResource(id = dish.extraIcon),
                    contentDescription = "Category Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(20.dp)
                )
            }
        }


        Column(
            modifier = Modifier.weight(0.3f)
        ) {
            AndroidView(
                factory = { context ->
                    TextView(context).apply {
                        text = Html.fromHtml(dish.priceHtml)
                    }
                }
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    RecipeSummary(Dish.getMock())
}