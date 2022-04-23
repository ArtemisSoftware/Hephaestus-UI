package com.artemissoftware.hephaestusui.ui.people.screens

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.artemissoftware.hephaestusui.ui.people.data.dto.models.PersonDto
import com.artemissoftware.hephaestusui.ui.people.domain.usecases.GetPeopleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow

import androidx.lifecycle.viewModelScope


@HiltViewModel
class PeopleViewModel(
    private val getPeopleUseCase: GetPeopleUseCase
): ViewModel() {

    val people: Flow<PagingData<PersonDto>> = getPeopleUseCase().cachedIn(viewModelScope)

}