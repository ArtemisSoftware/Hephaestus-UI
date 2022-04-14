package com.artemissoftware.hephaestusui.ui.mobilebanking.models

import androidx.annotation.DrawableRes
import com.artemissoftware.hephaestusui.R

enum class CardType(
    val title: String,
    @DrawableRes val image: Int
) {
    Visa("visa", R.drawable.ic_visa_logo)
}