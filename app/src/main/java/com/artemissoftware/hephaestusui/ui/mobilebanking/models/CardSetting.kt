package com.artemissoftware.hephaestusui.ui.mobilebanking.models

import androidx.annotation.DrawableRes
import com.artemissoftware.hephaestusui.R

data class CardSetting(
    val description: String,
    @DrawableRes val icon: Int
){

    companion object{

        fun getMockList() = listOf<CardSetting>(
            CardSetting(description = "Contactless Payment", icon = R.drawable.ic_outline_wifi_tethering_24),
            CardSetting(description = "Online Payment", icon = R.drawable.ic_outline_payments_24),
            CardSetting(description = "ATM Withdraws", icon = R.drawable.ic_baseline_local_atm_24),
        )


    }

}
