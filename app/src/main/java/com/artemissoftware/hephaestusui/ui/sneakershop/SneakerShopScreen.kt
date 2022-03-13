package com.artemissoftware.hephaestusui.ui.sneakershop

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.sneakershop.models.Sneaker

@Composable
fun SneakerShopScreen(){

    Column(
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 8.dp)
    ) {

        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "", tint = Color.Black)
        }

        Spacer(Modifier.height(16.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Proche Design",
            style = TextStyle(color = Color.Black, fontSize = 30.sp, fontWeight = FontWeight.Bold),
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(16.dp))

        Text(
            text = "list of all imported design shoes",
            style = TextStyle(fontSize = 14.sp, color = Color.Black)
        )

        Spacer(Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(Sneaker.getSneakerListMock()) { sneaker ->
                SneakerCard(sneaker = sneaker)
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    SneakerShopScreen()
}