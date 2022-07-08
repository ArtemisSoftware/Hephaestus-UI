package com.artemissoftware.hephaestusui.ui.multiselect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.multiselect.composables.SelectableItem
import com.artemissoftware.hephaestusui.ui.multiselect.models.SelectItem

@Composable
fun MultiSelectScreen() {

    var items by remember {
        mutableStateOf(
            (1..20).map {

                SelectItem(
                    title = "Item $it",
                    subtitle="Subtitle of item $it",
                    isSelected = false
                )

            }
        )
    }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        items(items.size) { i ->

            SelectableItem(
                selected = items[i].isSelected,
                title = items[i].title,
                subtitle = items[i].subtitle,
                onClick = {
                    items = items.mapIndexed { j, item ->
                        if(i == j) {
                            item.copy(isSelected = !item.isSelected)
                        } else item
                    }
                }
            )

        }
    }


}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {

    MultiSelectScreen()

}