package com.artemissoftware.hephaestusui.ui.dating

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.artemissoftware.hephaestusui.ui.dating.models.Date

class DatingViewModel : ViewModel() {

    private val _album = mutableStateOf(mutableListOf<Date>())
    val date: State<List<Date>> = _album

    init {
        _album.value = Date.getListMock().toMutableList()
    }

    fun removeDate(date: Date): Boolean{

        if (_album.value.isNotEmpty().or(false) == true) {
            _album.value.remove(date)
        }

        return _album.value.isEmpty()
    }
}