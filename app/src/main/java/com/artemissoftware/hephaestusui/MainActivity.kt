package com.artemissoftware.hephaestusui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.hilt.navigation.compose.hiltViewModel
import com.artemissoftware.hephaestusui.ui.game.GameDetailsScreen
import com.artemissoftware.hephaestusui.ui.game.models.GameDetail
import com.artemissoftware.hephaestusui.ui.login.navigation.LoginNavigation
import com.artemissoftware.hephaestusui.ui.nestedgraph.NestedGraphApp
import com.artemissoftware.hephaestusui.ui.onboarding.OnboardingApp
import com.artemissoftware.hephaestusui.ui.onboarding.screens.SplashViewModel
import com.artemissoftware.hephaestusui.ui.people.screens.PeopleScreen
import com.artemissoftware.hephaestusui.ui.people.screens.PeopleViewModel
import com.artemissoftware.hephaestusui.ui.theme.HephaestusUITheme
import com.artemissoftware.hephaestusui.ui.theme.LoginJetpackComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel


    @ExperimentalAnimationApi
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    @ExperimentalComposeUiApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }

        setContent {
            HephaestusUIGeneral()
            //HephaestusUILogin()
            //HephaestusUIOnboarding(splashViewModel.startDestination)
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
        //MobileBankingApp()
        //PeopleScreen(peopleViewModel = hiltViewModel())
        //GameDetailsScreen(gameDetail = GameDetail.getMock())
        NestedGraphApp()
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


@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun HephaestusUIOnboarding(startDestination: State<String>) {
    HephaestusUITheme {
        OnboardingApp(startDestination)
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