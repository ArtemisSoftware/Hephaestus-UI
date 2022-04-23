package com.artemissoftware.hephaestusui.ui.people.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import com.artemissoftware.hephaestusui.ui.people.data.pagingsource.GetPeoplePagingSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PeopleRepository @Inject constructor(
    private val getPeoplePagingSource: GetPeoplePagingSource
){

    fun getPeople(): Flow<PagingData<PersonDto>> {

        return Pager(
            config = PagingConfig(pageSize = 2),
            pagingSourceFactory ={
                getPeoplePagingSource
            }
        ).flow

    }
}