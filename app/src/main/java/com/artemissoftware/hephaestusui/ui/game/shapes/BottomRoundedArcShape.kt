package com.artemissoftware.hephaestusui.ui.game.shapes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.artemissoftware.hephaestusui.R

class BottomRoundedArcShape: Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        return Outline.Generic(
            path = drawArcPath(size = size)
        )
    }

    private fun drawArcPath(size: Size): Path {
        return Path().apply {
            reset()

            // go from (0,0) to (width, 0)
            lineTo(size.width, 0f)

            // go from (width, 0) to (width, height)
            lineTo(size.width, size.height)

            // Draw an arch from (width, height) to (0, height)
            // starting from 0 degree to 180 degree
            arcTo(
                rect = Rect(
                    Offset(0F, 0F),
                    Size(size.width, size.height)
                ),
                startAngleDegrees = 0f,
                sweepAngleDegrees = 180f,
                forceMoveTo = false
            )

            // go from (0, height) to (0, 0)
            lineTo(0f, 0f)
            close()
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .graphicsLayer {
                clip = true
                shape = BottomRoundedArcShape()
                shadowElevation = 50.dp.toPx()
            },
        contentScale = ContentScale.Crop,
        painter = rememberImagePainter(
            data = R.drawable.artemis_2,
            builder = {
                placeholder(R.drawable.artemis_2)
                crossfade(true)
            }
        ),
        contentDescription = "Game Image"
    )
}