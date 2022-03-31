package com.artemissoftware.hephaestusui.ui.onboarding

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.onboarding.navigation.OnboardingNavigation
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun OnboardingApp() {

    //val startDestination by splashViewModel.startDestination
    val navController = rememberNavController()
    OnboardingNavigation(navController = navController, startDestination = "welcome")
}