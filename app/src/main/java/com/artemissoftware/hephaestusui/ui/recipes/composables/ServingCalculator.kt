package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality.Companion.Medium
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes
import com.artemissoftware.hephaestusui.ui.theme.LightGray
import com.artemissoftware.hephaestusui.ui.theme.Pink

@Composable
fun ServingCalculator(){

    var value by remember { mutableStateOf(6) }



    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            //.padding(horizontal = 16.dp, vertical = 8.dp)
            .clip(IngedientShapes.medium)
            .background(LightGray)
            .padding(horizontal = 16.dp)
    ){

        Text(
            text = "Serving",
            fontWeight = FontWeight.Medium,
            modifier = Modifier.weight(1f)
        )

        IconFlatButton(
            iconResource = R.drawable.ic_minus,
            elevation = null,
            color = Pink,
            onClick = {
                --value
            }
        )

        Text(
            text = value.toString(),
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(16.dp)
        )

        IconFlatButton(
            iconResource = R.drawable.ic_plus,
            elevation = null,
            color = Pink,
            onClick = {
                ++value
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    ServingCalculator()
}