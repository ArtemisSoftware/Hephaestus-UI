package com.artemissoftware.hephaestusui.ui.stories.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LinearIndicator(
    modifier: Modifier,
    indicatorBackgroundColor: Color,
    indicatorProgressColor: Color,
    hideIndicators: Boolean = false
){

    if(!hideIndicators) {
        LinearProgressIndicator(
            backgroundColor = indicatorBackgroundColor,
            color = indicatorProgressColor,
            modifier = modifier
                .padding(vertical = 12.dp)
                .clip(shape = RoundedCornerShape(12.dp)),
//        progress = animatedProgress
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    LinearIndicator(
        modifier = Modifier,
//        startProgress: Boolean = false,
        indicatorBackgroundColor = Color.Blue,
        indicatorProgressColor = Color.Red,
//    slideDurationInSeconds: Long,
//    onPauseTimer: Boolean = false,
        hideIndicators = false,
//    onAnimationEnd: () -> Unit
    )
}


//@Composable
//fun LinearIndicator(modifier: Modifier,
//                    startProgress: Boolean = false,
//                    indicatorBackgroundColor: Color,
//                    indicatorProgressColor: Color,
//                    slideDurationInSeconds: Long,
//                    onPauseTimer: Boolean = false,
//                    hideIndicators: Boolean = false,
//                    onAnimationEnd: () -> Unit) {
//
//    val delayInMillis = rememberSaveable {
//        (slideDurationInSeconds * 1000) / 100
//    }
//
//    var progress by remember {
//        mutableStateOf(0.00f)
//    }
//
//    val animatedProgress by animateFloatAsState(targetValue = progress,
//        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec)
//
//
//    if (startProgress) {
//        LaunchedEffect(key1 = onPauseTimer) {
//            while (progress < 1f && isActive && onPauseTimer.not()) {
//                progress += 0.01f
//                delay(delayInMillis)
//            }
//
//            //When the timer is not paused and animation completes then move to next page.
//            if (onPauseTimer.not()) {
//                delay(200)
//                onAnimationEnd()
//            }
//        }
//    }
//
//    if (hideIndicators.not()) {
//        LinearProgressIndicator(
//            backgroundColor = indicatorBackgroundColor,
//            color = indicatorProgressColor,
//            modifier = modifier
//                .padding(top = 12.dp, bottom = 12.dp)
//                .clip(RoundedCornerShape(12.dp)),
//            progress = animatedProgress
//        )
//    }
//}