package com.artemissoftware.hephaestusui.ui.dailyweather

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.HeaderImage
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.WeatherSummary
import com.artemissoftware.hephaestusui.ui.dailyweather.composables.WeatherTable

@Composable
fun DailyWeatherScreen(){

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 64.dp)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            HeaderImage()
        }
        item {
            WeatherSummary()
        }
        item {
            WeatherTable()
        }
    }
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 64.dp)
//            .padding(horizontal = 16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//        HeaderImage()
//        WeatherSummary()
//        WeatherTable()
//    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DailyWeatherScreen()
}