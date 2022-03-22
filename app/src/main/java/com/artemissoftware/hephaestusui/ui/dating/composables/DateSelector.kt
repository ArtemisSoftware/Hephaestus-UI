package com.artemissoftware.hephaestusui.ui.dating.composables

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DateSelector(
    noMoreDates: MutableState<Boolean>,
    height: Dp
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = height + 40.dp)
            .alpha(animateFloatAsState(if (noMoreDates.value) 0.2f else 1f).value)
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

@SuppressLint("UnrememberedMutableState")
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DateSelector(noMoreDates = mutableStateOf(true), height = 100.dp)
}