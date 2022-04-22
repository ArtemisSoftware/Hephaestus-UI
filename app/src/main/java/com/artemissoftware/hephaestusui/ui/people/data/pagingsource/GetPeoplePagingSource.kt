package com.artemissoftware.hephaestusui.ui.people.data.pagingsource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.artemissoftware.hephaestusui.ui.people.data.ReqresApi
import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetPeoplePagingSource @Inject constructor(
    private val reqresApi: ReqresApi
): PagingSource<Int, PersonDto>() {

    override fun getRefreshKey(state: PagingState<Int, PersonDto>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PersonDto> {
        return try {
            val nextPage = params.key ?: 1
            val userList = reqresApi.getPeople(nextPage)
            LoadResult.Page(
                data = userList.people,
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (userList.people.isEmpty()) null else userList.page + 1
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}