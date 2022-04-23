package com.artemissoftware.hephaestusui.ui.people.domain.usecases

import androidx.paging.PagingData
import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import com.artemissoftware.hephaestusui.ui.people.data.repository.PeopleRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPeopleUseCase @Inject constructor(
    private val peopleRepository: PeopleRepository
) {

    operator fun invoke(): Flow<PagingData<PersonDto>> {
        return peopleRepository.getPeople()
    }

}