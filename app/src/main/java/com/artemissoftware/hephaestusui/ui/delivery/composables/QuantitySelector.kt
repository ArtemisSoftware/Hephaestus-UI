package com.artemissoftware.hephaestusui.ui.delivery.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.FoodColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun QuantitySelector(quantity: MutableState<Int>) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .background(FoodColor)
            .padding(horizontal = 10.dp)
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_minus),
            contentDescription = "Minus",
            modifier = Modifier
                .clickable {
                    quantity.value--
                }
                .size(25.dp),
            tint = Color.White
        )
        Text(
            text = "${quantity.value}",
            modifier = Modifier.padding(vertical = 10.dp, horizontal = 16.dp),
            fontFamily = Poppins,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_plus),
            contentDescription = "Add",
            modifier = Modifier
                .clickable {
                    quantity.value++
                }
                .size(25.dp),
            tint = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    val value = remember { mutableStateOf(5) }
    QuantitySelector(value)
}