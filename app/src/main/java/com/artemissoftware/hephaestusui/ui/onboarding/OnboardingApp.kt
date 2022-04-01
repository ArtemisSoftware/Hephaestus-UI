package com.artemissoftware.hephaestusui.ui.onboarding

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.navigation.compose.rememberNavController
import com.artemissoftware.hephaestusui.ui.onboarding.navigation.OnboardingNavigation
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalAnimationApi
@Composable
fun OnboardingApp(startDestination: State<String>) {

    val navController = rememberNavController()
    OnboardingNavigation(navController = navController, startDestination = startDestination.value)
}