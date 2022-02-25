package com.artemissoftware.hephaestusui.ui.dailyweather.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.theme.DailyWeatherTypography
import com.artemissoftware.hephaestusui.ui.theme.DarkBlue

@Composable
fun WeatherSummary(){

    Column(
        modifier = Modifier.padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "11°",
            color = DarkBlue,
            fontSize = 48.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = DailyWeatherTypography
        )

        Text(
            text = "New York City, NY",
            color = DarkBlue,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp),
            fontFamily = DailyWeatherTypography
        )
        Text(
            text = "Rainy to partly cloudy.\nWinds WSW at 10 to 15 km/h",
            color = Color.Gray,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(vertical = 24.dp),
            fontFamily = DailyWeatherTypography
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    WeatherSummary()
}