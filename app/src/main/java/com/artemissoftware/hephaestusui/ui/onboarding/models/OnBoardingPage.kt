package com.artemissoftware.hephaestusui.ui.onboarding.models

import androidx.annotation.DrawableRes
import com.artemissoftware.hephaestusui.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.artemis,
        title = "Artemis one",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
    object Second: OnBoardingPage(
        image = R.drawable.artemis_2,
        title = "Artemis Two",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
    object Third: OnBoardingPage(
        image = R.drawable.artemis_3,
        title = "Artemis Three",
        description = "Lorem Ipsum dolor sit amet, consectetur adipiscing elit, sed do elusemod tempor incididunt labore."
    )
}
