package com.artemissoftware.hephaestusui.ui.game.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.game.GameDetailsScreen
import com.artemissoftware.hephaestusui.ui.game.models.GameDetail
import com.artemissoftware.hephaestusui.ui.game.shapes.BottomRoundedArcShape

@Composable
fun GameImage(
    image: String,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
            .graphicsLayer {
                clip = true
                shape = BottomRoundedArcShape()
                shadowElevation = 50.dp.toPx()
            }
        ,
        contentScale = ContentScale.Crop,
        painter = rememberImagePainter(
            data = image,
            builder = {
                placeholder(R.drawable.artemis_2)
                crossfade(true)
            }
        ),
        contentDescription = "Game Image"
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    GameImage(image = GameDetail.getMock().backgroundImage)
}