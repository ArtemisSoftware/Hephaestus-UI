package com.artemissoftware.hephaestusui.ui.game.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.game.GameDetailsScreen

@Composable
fun GameImage(
    image: String,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            /*.fillMaxWidth()
            .height(300.dp)
            .graphicsLayer {
                clip = true
                shape = BottomRoundedArcShape()
                shadowElevation = 50.dp.toPx()
            }*/,
//        contentScale = ContentScale.Crop,
        painter = rememberImagePainter(
            data = image,
            builder = {
                placeholder(R.drawable.artemis)
                crossfade(true)
            }
        ),
        contentDescription = "Game Image"
    )
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    GameImage(image = "https://rawg.io/assets/images/cover@2x.1e0ff948d9c0e7d05e0496c6ffe2e8a8.png")
}