package com.artemissoftware.hephaestusui.ui.delivery.models

import com.artemissoftware.hephaestusui.R

data class Dish(
    val title: String,
    val extra: String,
    val extraIcon: Int,
    val priceHtml: String,
    val rating: String,
    val calories: String,
    val duration: String,
    val descriptionHtml: String
) {

    companion object{

        fun getMock(): Dish{

            return Dish(
                title = "Beef Burger",
                extra = "Cheesy Mozarella",
                extraIcon = R.drawable.cheese,
                priceHtml = "<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>14.10</big></big></span></b></string>",
                rating = "3.5",
                calories = "150 Kcal",
                duration = "10-15 Mins",
                descriptionHtml = "<string><span style = \"color:#424242\">This beef burger uses 100% quality beef with sliced tomates, cucumbers, vegetables and onions... </span><span style = \"color:#F54748\">Read More</span></string>"
            )
        }

    }

}