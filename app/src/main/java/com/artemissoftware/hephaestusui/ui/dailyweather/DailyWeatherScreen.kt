package com.artemissoftware.hephaestusui.ui.dailyweather

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.HeaderImage
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.WeatherSummary

@Composable
fun DailyWeatherScreen(){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        HeaderImage()
        WeatherSummary()
//        InfoTable()


    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DailyWeatherScreen()
}