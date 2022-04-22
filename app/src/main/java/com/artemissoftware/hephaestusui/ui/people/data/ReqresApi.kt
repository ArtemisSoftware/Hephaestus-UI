package com.artemissoftware.hephaestusui.ui.people.data

import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PeopleDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ReqresApi {
    @GET("users")
    suspend fun getPeople(@Query("page") page: Int): PeopleDto
}