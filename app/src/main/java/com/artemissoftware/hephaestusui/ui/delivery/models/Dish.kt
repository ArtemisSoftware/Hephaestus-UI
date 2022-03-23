package com.artemissoftware.hephaestusui.ui.delivery.models

import com.artemissoftware.hephaestusui.R

data class Dish(
    val title: String,
    val extra: String,
    val extraIcon: Int,
    val priceHtml: String
) {

    companion object{

        fun getMock(): Dish{

            return Dish(
                title = "Beef Burger",
                extra = "Cheesy Mozarella",
                extraIcon = R.drawable.cheese,
                priceHtml = "<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>14.10</big></big></span></b></string>"
            )
        }

    }

}