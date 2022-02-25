package com.artemissoftware.hephaestusui.ui.dailyweather.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.artemissoftware.hephaestusui.R

@Composable
fun HeaderImage(){

    Image(
        painter = painterResource(id = R.drawable.ic_couple),
        contentDescription = null,
        //modifier = Modifier.width(200.dp)
    )
}