package com.artemissoftware.hephaestusui.ui.sneakershop.models

import androidx.compose.ui.graphics.Color
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.Blue500
import com.artemissoftware.hephaestusui.ui.theme.CYAN500
import com.artemissoftware.hephaestusui.ui.theme.LIGHTBLUE50

data class Sneaker(val price:String, val color: Color, val image:Int){

    companion object{

        fun getSneakerListMock() = listOf<Sneaker>(
            Sneaker("330$", LIGHTBLUE50, R.drawable.ic_sun_full),
            Sneaker("4990$", CYAN500, R.drawable.ic_sun_full),
            Sneaker("1000$", Blue500, R.drawable.ic_sun_full),
        )
    }
}