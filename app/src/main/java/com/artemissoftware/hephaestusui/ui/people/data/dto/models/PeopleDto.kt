package com.artemissoftware.hephaestusui.ui.people.data.dto.models


import com.google.gson.annotations.SerializedName

data class PeopleDto(
    @SerializedName("data")
    val people: List<PersonDto>,
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("support")
    val support: SupportDto,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int
)