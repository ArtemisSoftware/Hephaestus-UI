package com.artemissoftware.hephaestusui.ui.dating.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.dating.models.Album

@Composable
fun DateSelector(){

    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
//            .padding(top = cardHeight)
//            .alpha(animateFloatAsState(if (listEmpty.value) 0f else 1f).value)
    ) {

        IconButton(
            onClick = {
                /* TODO Hook to swipe event */
            },
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .size(60.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colors.background)
        ) {
            Icon(
                imageVector = Icons.Default.Cancel,
                tint = Color.Gray,
                contentDescription = null,
                modifier = Modifier.size(36.dp)
            )
        }
        IconButton(
            onClick = {
                /* TODO Hook to swipe event */
            },
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .size(60.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colors.background)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                tint = Color.Red,
                modifier = Modifier.size(36.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DateSelector()
}