package com.artemissoftware.hephaestusui.ui.recipes.models

import androidx.annotation.DrawableRes
import com.artemissoftware.hephaestusui.R

data class Ingredient(@DrawableRes val icon: Int, val title: String, val description : String){


    companion object{

        fun getMockList(): List<Ingredient>{
            return listOf(
                Ingredient(R.drawable.mind, "title", "description")
            )
        }

    }

}
