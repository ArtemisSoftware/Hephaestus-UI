package com.artemissoftware.hephaestusui.ui.onboardingcook.composables

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PagerIndicator(
    numberOfPages: Int,
    currentPage: Int,
    color: Color
) {

    Row {
        repeat(numberOfPages) {
            Indicator(isSelected = (currentPage == it), color = color)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PagerIndicatorPreview() {
    PagerIndicator(
        numberOfPages =  2,
        currentPage = 1,
        color = Color.Green
    )
}



@Composable
private fun Indicator(
    isSelected: Boolean,
    color: Color
) {
    val width = animateDpAsState(targetValue = if (isSelected) 40.dp else 10.dp)

    Box(
        modifier = Modifier
            .padding(4.dp)
            .height(10.dp)
            .width(width.value)
            .clip(CircleShape)
            .background(
                if (isSelected) color else Color.Gray.copy(alpha = 0.5f)
            )
    )
}

@Preview(showBackground = true)
@Composable
private fun IndicatorPreview() {

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Indicator(isSelected = true, color = Color.Red)

        Indicator(isSelected = false, color = Color.Blue)
    }

}
