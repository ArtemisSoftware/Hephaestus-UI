package com.artemissoftware.hephaestusui.ui.nestedgraph.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R

@Composable
fun CircularImage(
    icon: Int = R.drawable.medusa,
) {

    Image(
        modifier = Modifier.
        size(300.dp)
            .clip(CircleShape)
            .border(
                width = 10.dp,
                color = Color.Cyan,
                shape = CircleShape
            ),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = icon),
        contentDescription = ""
    )
}