package com.artemissoftware.hephaestusui.ui.delivery.models

import com.artemissoftware.hephaestusui.R

data class Delivery(
    val banner: String,
    private val foods: List<String>,
    private val images: List<Int>,
    val popularDelivery: PopularDelivery
){

    fun getFood(index: Int): String{
        return when(index) {
            0 -> foods[0]
            1 -> foods[1]
            2 -> foods[2]
            else -> foods[3]
        }
    }

    fun getImage(index: Int): Int{
        return when(index) {
            0 -> images[0]
            1 -> images[1]
            else ->images[0]
        }
    }

    companion object{
        fun getMock() = Delivery(
            banner = "<string><big><b><span style = \"color:#000000\">The Fastest In Delivery </span><span style = \"color:#F54748\">Food</span></b></big></string>",
            foods = listOf("Burger", "Pizza", "Sandwich", "Toast"),
            images = listOf(R.drawable.burger_one, R.drawable.pizza),
            popularDelivery = PopularDelivery.getMock()
        )
    }

}
