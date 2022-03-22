package com.artemissoftware.hephaestusui.ui.dating.models

import com.artemissoftware.hephaestusui.R
import java.io.Serializable

data class Date(
    val id: Int,
    val name: String,
    val description: String,
    val imageId: Int,
    val swiped: Boolean = false
) : Serializable{

    companion object{

        fun getListMock(): MutableList<Date> {

            return mutableListOf(
                Date(
                    id = 1,
                    name = "Medusa",
                    description = "Beast",
                    imageId = R.drawable.medusa
                ),
                Date(
                    id = 9,
                    name = "Atlas",
                    description = "Titan",
                    imageId = R.drawable.atlas
                ),
                Date(
                    id = 11,
                    name = "Artemis",
                    description = "Goddess",
                    imageId = R.drawable.artemis_2
                ),
            )
        }
    }

}