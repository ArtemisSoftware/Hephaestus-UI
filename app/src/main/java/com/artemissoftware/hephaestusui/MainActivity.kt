package com.artemissoftware.hephaestusui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.dailyweather.DailyWeatherScreen
import com.artemissoftware.hephaestusui.ui.login.LoginScreen
import com.artemissoftware.hephaestusui.ui.recipes.RecipesScreen
import com.artemissoftware.hephaestusui.ui.stories.StoriesApp
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    @ExperimentalComposeUiApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //HephaestusUIGeneralTheme()
            HephaestusUILoginTheme()
        }
    }
}


@Composable
fun HephaestusUIGeneralTheme() {
    HephaestusUITheme {
        //StoriesApp()
        //RecipesScreen()
        DailyWeatherScreen()
    }
}

@Composable
fun HephaestusUILoginTheme() {
    LoginJetpackComposeTheme {
        LoginScreen()
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HephaestusUITheme {
        Greeting("Android")
    }
}