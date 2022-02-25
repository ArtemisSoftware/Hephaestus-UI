package com.artemissoftware.hephaestusui.ui.dailyweather.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.*

@Composable
fun WeatherTable(){

    Column(
        modifier = Modifier.fillMaxWidth()
            .clip(RoundedCornerShape(4.dp))
            .background(
                VeryLightGray
            )
    ) {

        Row(Modifier.padding(16.dp)) {
            WeatherInfo(
                iconRes = R.drawable.ic_humidity,
                title = "Humidity",
                subtitle = "85%",
                modifier = Modifier.weight(1f)
            )
            WeatherInfo(
                iconRes = R.drawable.ic_sun_full,
                title = "UV Index",
                subtitle = "2 of 10",
                modifier = Modifier.weight(1f)
            )
        }

        Divider(
            color = LightGray_2,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Row(Modifier.padding(16.dp)) {

            WeatherInfo(
                iconRes = R.drawable.ic_sun_half,
                title = "Sunrise",
                subtitle = "7:30 AM",
                modifier = Modifier.weight(1f)
            )
            WeatherInfo(
                iconRes = R.drawable.ic_sun_half,
                title = "Sunset",
                subtitle = "4:28 PM",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun WeatherInfo(
    @DrawableRes iconRes: Int, 
    title: String, 
    subtitle: String, 
    modifier: Modifier
) {

    Row(modifier = modifier) {

        Image(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 8.dp)
                .width(40.dp)
        )

        Column {
            Text(
                text = title,
                color = Color.Gray,
                fontFamily = DailyWeatherTypography
            )
            Text(
                text = subtitle,
                color = DarkBlue,
                fontWeight = FontWeight.Bold,
                fontFamily = DailyWeatherTypography)
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Column {

        WeatherInfo(iconRes = R.drawable.ic_sun_full, title = "title", subtitle = "subtitle", modifier = Modifier)
        
        WeatherTable()
    }
    
}