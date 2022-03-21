package com.artemissoftware.hephaestusui.ui.dating

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.artemissoftware.hephaestusui.ui.dating.composables.DateCard
import com.artemissoftware.hephaestusui.ui.dating.composables.DateSelector
import com.artemissoftware.hephaestusui.ui.dating.models.Album

@Composable
fun DatingHomeScreen() {

    val viewModel: DatingViewModel = viewModel()
    val fruits = viewModel.album

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Box {

            fruits.value?.forEachIndexed { index, album ->

                DateCard(album = album)
            }
        }

        DateSelector()
    }

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DatingHomeScreen()
}