package com.artemissoftware.hephaestusui.ui.dating.models

import com.artemissoftware.hephaestusui.R
import java.io.Serializable

data class Album(
    val id: Int,
    val fruitName: String,
    val descriptions: String,
    val imageId: Int,
    val swiped: Boolean = false
) : Serializable{

    companion object{

        fun getListMock(): MutableList<Album> {

            val albums = mutableListOf(
                Album(
                    id = 1,
                    fruitName = "Apple",
                    descriptions = "Apple Description",
                    imageId = R.drawable.artemis
                ),
                Album(
                    id = 2,
                    fruitName = "Banana",
                    descriptions = "Banana Description",
                    imageId = R.drawable.artemis_2
                ),
                Album(
                    id = 3,
                    fruitName = "Cherries",
                    descriptions = "Cherries Description",
                    imageId = R.drawable.artemis_3
                ),
//                Album(
//                    id = 4,
//                    fruitName = "Dates",
//                    descriptions = "Dates Description",
//                    imageId = R.drawable.dates
//                ),
//                Album(
//                    id = 5,
//                    fruitName = "EggFruit",
//                    descriptions = "EggFruit Description",
//                    imageId = R.drawable.eggfruit
//                ),
//                Album(
//                    id = 6,
//                    fruitName = "Fig",
//                    descriptions = "Fig Description",
//                    imageId = R.drawable.fig
//                ),
//                Album(
//                    id = 7,
//                    fruitName = "Grapes",
//                    descriptions = "Grapes Description",
//                    imageId = R.drawable.grapes
//                ),
//                Album(
//                    id = 8,
//                    fruitName = "HackBerry",
//                    descriptions = "HackBerry Description",
//                    imageId = R.drawable.hackberry
//                )
            )

            return albums
        }
    }

}