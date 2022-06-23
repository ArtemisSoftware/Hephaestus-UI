package com.artemissoftware.hephaestusui.ui.game.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.game.GameDetailsScreen
import com.artemissoftware.hephaestusui.ui.game.models.GameDetail

@Composable
fun PlayTrailer(
    modifier: Modifier = Modifier,
    openGameTrailer: () -> Unit = {}
) {
    Box(modifier = modifier) {

        IconButton(onClick = openGameTrailer) {

            Image(modifier = Modifier/*.width(50.dp)
                    .height(50.dp)
                    .align(Alignment.Center)
                    .graphicsLayer {
                        shadowElevation = 20.dp.toPx()
                        shape =
                            RoundedCornerShape(15.dp)
                        clip = true
                    }
                    .background(Color(0xFFF50057))*/,
                painter =
                painterResource(
                    id = R.drawable.ic_play
                ),
                contentDescription = "Play Trailer"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    PlayTrailer()
}