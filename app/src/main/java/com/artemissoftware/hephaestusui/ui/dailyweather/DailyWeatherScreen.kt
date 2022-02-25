package com.artemissoftware.hephaestusui.ui.dailyweather

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.HeaderImage
import com.artemissoftware.hephaestusui.ui.recipes.composables.BasicInfo
import com.artemissoftware.hephaestusui.ui.recipes.models.Recipe
import com.artemissoftware.hephaestusui.ui.theme.IngedientShapes

@Composable
fun DailyWeatherScreen(){

    Column {

        HeaderImage()
//        MainInfo()
//        InfoTable()


    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DailyWeatherScreen()
}