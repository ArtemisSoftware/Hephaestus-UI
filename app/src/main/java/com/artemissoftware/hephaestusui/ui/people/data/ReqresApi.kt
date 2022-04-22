package com.artemissoftware.hephaestusui.ui.people.data

import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ReqresApi {
    @GET("users")
    suspend fun getUserList(@Query("page") page: Int): PersonDto
}