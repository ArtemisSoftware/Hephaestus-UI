package com.artemissoftware.hephaestusui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.dailyweather.DailyWeatherScreen
import com.artemissoftware.hephaestusui.ui.dating.DatingHomeScreen
import com.artemissoftware.hephaestusui.ui.delivery.DeliveryApp
import com.artemissoftware.hephaestusui.ui.delivery.RestaurantHomeScreen
import com.artemissoftware.hephaestusui.ui.delivery.models.Delivery
import com.artemissoftware.hephaestusui.ui.delivery.models.Dish
import com.artemissoftware.hephaestusui.ui.login.LoginScreen
import com.artemissoftware.hephaestusui.ui.login.RegistrationScreen
import com.artemissoftware.hephaestusui.ui.login.navigation.LoginNavigation
import com.artemissoftware.hephaestusui.ui.onboarding.OnboardingApp
import com.artemissoftware.hephaestusui.ui.recipes.RecipesScreen
import com.artemissoftware.hephaestusui.ui.sneakershop.SneakerShopScreen
import com.artemissoftware.hephaestusui.ui.stories.StoriesApp
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    @ExperimentalComposeUiApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HephaestusUIGeneral()
            //HephaestusUILogin()
        }
    }
}


@ExperimentalAnimationApi
@ExperimentalPagerApi
@ExperimentalMaterialApi
@Composable
fun HephaestusUIGeneral() {
    HephaestusUITheme {
        //StoriesApp()
        //RecipesScreen()
        //DailyWeatherScreen()
        //SneakerShopScreen()
        //DatingHomeScreen()
        //DeliveryApp()
        OnboardingApp()
    }
}

@ExperimentalAnimationApi
@ExperimentalFoundationApi
@ExperimentalComposeUiApi
@Composable
fun HephaestusUILogin() {
    LoginJetpackComposeTheme {
        LoginNavigation()
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