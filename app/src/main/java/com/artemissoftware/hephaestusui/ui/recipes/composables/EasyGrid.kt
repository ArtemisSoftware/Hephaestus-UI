package com.artemissoftware.hephaestusui.ui.recipes.composables

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun <T> EasyGrid(
    numberOfColumns: Int,
    items: List<T>,
    content: @Composable (T) -> Unit
) {
    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        for (index in items.indices step numberOfColumns) {
            Column {
                Row {
                    for (indexColumn in 0 until numberOfColumns) {
                        if (index + indexColumn < items.size) {
                            Box(
                                contentAlignment = Alignment.TopCenter,
                                modifier = Modifier.weight(1f)
                            ) {
                                content(items[index + indexColumn])
                            }
                        }
                        else { //for empty space when there is no more data
                            Spacer(Modifier.weight(1f, fill = true))
                        }
                    }
                }
                if(index != items.size -1) Spacer(Modifier.height(16.dp))
            }

        }
    }
}