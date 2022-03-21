package com.artemissoftware.hephaestusui.ui.dating

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.artemissoftware.hephaestusui.ui.dating.models.Album

class DatingViewModel : ViewModel() {

    private val _album = mutableStateOf(mutableListOf<Album>())
    val album: State<List<Album>> = _album

    init {
        _album.value = Album.getListMock().toMutableList()
    }
}