package com.artemissoftware.hephaestusui.ui.delivery.models

import com.artemissoftware.hephaestusui.R

data class PopularDelivery(
    private val titles: List<String>,
    private val descriptions: List<String>,
    private val images: List<Int>,
    private val supplements: List<Int>,
    private val prices: List<String>
){

    fun getTitle(index: Int): String{

        return when(index) {
            0 -> titles[0]
            1 -> titles[1]
            else -> titles[2]
        }
    }

    fun getDescription(index: Int): String{

        return when(index) {
            0 -> descriptions[0]
            1 -> descriptions[1]
            else -> descriptions[2]
        }
    }

    fun getImages(index: Int): Int{

        return if (index % 2 == 0) {
            images[0]
        } else {
            images[1]
        }
    }

    fun getSupplement(index: Int): Int{

        return if (index % 2 == 0) {
            supplements[0]
        } else {
            supplements[1]
        }
    }

    fun getPrice(index: Int): String{

        return if (index % 2 == 0) {
            prices[0]
        } else {
            prices[1]
        }
    }

    companion object{

        fun getMock() = PopularDelivery(

            titles = listOf<String>("Beef Burger", "Double Burger", "Cheese Burger"),
            descriptions = listOf<String>("Cheesy", "Beef", "Chilli"),
            images = listOf<Int>(R.drawable.burger, R.drawable.double_burger),
            supplements = listOf<Int>(R.drawable.cheese, R.drawable.beef),
            prices = listOf<String>(
                "<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>14.10</big></big></span></b></string>",
                "<string><b><span style = \"color:#F54748\"><big>$ </big></span><span style = \"color:#000000\"><big><big>8.35</big></big></span></b></string>"
            )
        )

    }

}
