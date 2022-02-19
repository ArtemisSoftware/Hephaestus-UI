package com.artemissoftware.hephaestusui.ui.stories

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.stories.components.LinearIndicator
import com.artemissoftware.hephaestusui.ui.stories.components.StoryImage
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@ExperimentalComposeUiApi
@ExperimentalPagerApi
@Composable
fun StoriesScreen(
    numberOfPages: Int,
    hideIndicators: Boolean = false,
    indicatorBackgroundColor: Color = Color.LightGray,
    indicatorProgressColor: Color = Color.White,
    indicatorBackgroundGradientColors: List<Color> = emptyList(),
    spaceBetweenIndicator: Dp = 4.dp,
    slideDurationInSeconds: Long = 5,
    touchToPause: Boolean = true,
    onEveryStoryChange: ((Int) -> Unit)? = null,
    onComplete: () -> Unit,
    content: @Composable PagerScope.(Int) -> Unit
){

    val coroutineScope = rememberCoroutineScope()

    val pagerState = rememberPagerState(pageCount = numberOfPages)
    var pauseTimer by remember { mutableStateOf(false) }


    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        //Full screen content behind the indicator
        StoryImage(
            pagerState = pagerState,
            onTap = {
                if (touchToPause)
                    pauseTimer = it
            },
            content = content
        )


        Row(
            modifier = Indicators(
                hideIndicators = hideIndicators,
                indicatorBackgroundGradientColors = indicatorBackgroundGradientColors
            ),
            horizontalArrangement = Arrangement.SpaceBetween
        ){

            Spacer(modifier = Modifier.padding(spaceBetweenIndicator))

            ListOfIndicators(
                pagerState = pagerState,
                numberOfPages = numberOfPages,
                indicatorBackgroundColor = indicatorBackgroundColor,
                indicatorProgressColor = indicatorProgressColor,
                hideIndicators = hideIndicators,
                spaceBetweenIndicator = spaceBetweenIndicator,
                onComplete = onComplete,
                onEveryStoryChange = onEveryStoryChange,
                pauseTimer = pauseTimer,
                slideDurationInSeconds = slideDurationInSeconds,
                coroutineScope = coroutineScope
            )

        }

    }

}


@ExperimentalPagerApi
@Composable
private fun RowScope.ListOfIndicators(
    pagerState: PagerState,
    coroutineScope: CoroutineScope,
    numberOfPages: Int,
    indicatorBackgroundColor: Color,
    indicatorProgressColor: Color,
    hideIndicators: Boolean,
    spaceBetweenIndicator: Dp,
    pauseTimer: Boolean,
    slideDurationInSeconds: Long,
    onComplete: () -> Unit,
    onEveryStoryChange: ((Int) -> Unit)? = null,
) {


    var currentPage by remember { mutableStateOf(0) }

    for (index in 0 until numberOfPages) {

        LinearIndicator(
            modifier = Modifier.weight(1f),
            indicatorBackgroundColor = indicatorBackgroundColor,
            indicatorProgressColor = indicatorProgressColor,
            slideDurationInSeconds = slideDurationInSeconds,
            startProgress = (index == currentPage),
            onPauseTimer = pauseTimer,
            hideIndicators = hideIndicators,
            onAnimationEnd = {
                coroutineScope.launch {

                    currentPage++

                    if (currentPage < numberOfPages) {
                        onEveryStoryChange?.invoke(currentPage)
                        pagerState.animateScrollToPage(currentPage)
                    }

                    if (currentPage == numberOfPages) {
                        onComplete()
                    }
                }

            }
        )

        Spacer(modifier = Modifier.padding(spaceBetweenIndicator))

    }
}

/**
 * Indicator based on the number of items
 */
@Composable
private fun Indicators(
    hideIndicators: Boolean,
    indicatorBackgroundGradientColors: List<Color> = emptyList(),
): Modifier {

    return if (hideIndicators) {
        Modifier
            .fillMaxWidth()
    } else {
        Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.verticalGradient(
                    if (indicatorBackgroundGradientColors.isEmpty()) listOf(
                        Color.Black,
                        Color.Transparent
                    ) else indicatorBackgroundGradientColors
                )
            )
    }

}

@ExperimentalComposeUiApi
@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    StoriesScreen(
        numberOfPages = 3,
        hideIndicators = false,
        content = { index ->
            Image(
                painter = painterResource(id = R.drawable.artemis),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        },
        onComplete = {}

    )
}


