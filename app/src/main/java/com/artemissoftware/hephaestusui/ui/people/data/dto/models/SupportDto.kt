package com.artemissoftware.hephaestusui.ui.people.data.dto.models


import com.google.gson.annotations.SerializedName

data class SupportDto(
    @SerializedName("text")
    val text: String,
    @SerializedName("url")
    val url: String
)