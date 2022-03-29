package com.artemissoftware.hephaestusui.ui.delivery.models

data class Delivery(val banner: String){

    companion object{
        fun getMock() = Delivery(
            banner = "<string><big><b><span style = \"color:#000000\">The Fastest In Delivery </span><span style = \"color:#F54748\">Food</span></b></big></string>"
        )
    }

}
