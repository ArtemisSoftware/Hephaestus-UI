package com.artemissoftware.hephaestusui.ui.stories

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.stories.components.LinearIndicator
import com.google.accompanist.pager.ExperimentalPagerApi

@Composable
fun StoriesScreen(){

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
        ){

            ListOfIndicators(
                numberOfPages = 1,
                indicatorBackgroundColor = Color.Blue,
                indicatorProgressColor = Color.Red
            )

        }

    }

}


@Composable
private fun RowScope.ListOfIndicators(
    numberOfPages: Int,
    indicatorBackgroundColor: Color,
    indicatorProgressColor: Color,
) {


    for (index in 0 until numberOfPages) {
        LinearIndicator(
            modifier = Modifier,
//        modifier = indicatorModifier.weight(1f),
//        index == currentPage,
            indicatorBackgroundColor = indicatorBackgroundColor,
            indicatorProgressColor = indicatorProgressColor,
//        slideDurationInSeconds,
//        pauseTimer,
//        hideIndicators
        )
//    {
//        coroutineScope.launch {
//
//            currentPage++
//
//            if (currentPage < numberOfPages) {
//                onEveryStoryChange?.invoke(currentPage)
//                pagerState.animateScrollToPage(currentPage)
//            }
//
//            if (currentPage == numberOfPages) {
//                onComplete()
//            }
//        }
//    }

    }
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    StoriesScreen()
}

//@OptIn(ExperimentalPagerApi::class, ExperimentalComposeUiApi::class)
//@Composable
//fun Stories(
//    numberOfPages: Int,
//    indicatorModifier: Modifier = Modifier
//        .padding(top = 12.dp, bottom = 12.dp)
//        .clip(RoundedCornerShape(12.dp)),
//    spaceBetweenIndicator: Dp = 4.dp,
//    indicatorBackgroundColor: Color = Color.LightGray,
//    indicatorProgressColor: Color = Color.White,
//    indicatorBackgroundGradientColors: List<Color> = emptyList(),
//    slideDurationInSeconds: Long = 5,
//    touchToPause: Boolean = true,
//    hideIndicators: Boolean = false,
//    onEveryStoryChange: ((Int) -> Unit)? = null,
//    onComplete: () -> Unit,
//    content: @Composable (Int) -> Unit,
//) {
//    val pagerState = rememberPagerState(pageCount = numberOfPages)
//    val coroutineScope = rememberCoroutineScope()
//
//    var pauseTimer by remember {
//        mutableStateOf(false)
//    }
//
//    Box(modifier = Modifier.fillMaxSize()) {
//        //Full screen content behind the indicator
//        StoryImage(pagerState = pagerState, onTap = {
//            if (touchToPause)
//                pauseTimer = it
//        }, content)
//
//        //Indicator based on the number of items
//        val modifier =
//            if (hideIndicators) {
//                Modifier.fillMaxWidth()
//            } else {
//                Modifier
//                    .fillMaxWidth()
//                    .background(
//                        brush = Brush.verticalGradient(
//                            if (indicatorBackgroundGradientColors.isEmpty()) listOf(
//                                Color.Black,
//                                Color.Transparent
//                            ) else indicatorBackgroundGradientColors
//                        )
//                    )
//            }
//
//        Row(
//            modifier = modifier,
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Spacer(modifier = Modifier.padding(spaceBetweenIndicator))
//
//            ListOfIndicators(
//                numberOfPages,
//                indicatorModifier,
//                indicatorBackgroundColor,
//                indicatorProgressColor,
//                slideDurationInSeconds,
//                pauseTimer,
//                hideIndicators,
//                coroutineScope,
//                pagerState,
//                spaceBetweenIndicator,
//                onEveryStoryChange = onEveryStoryChange,
//                onComplete = onComplete,
//            )
//        }
//    }
//
//}
//
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//private fun RowScope.ListOfIndicators(
//    numberOfPages: Int,
//    indicatorModifier: Modifier,
//    indicatorBackgroundColor: Color,
//    indicatorProgressColor: Color,
//    slideDurationInSeconds: Long,
//    pauseTimer: Boolean,
//    hideIndicators: Boolean,
//    coroutineScope: CoroutineScope,
//    pagerState: PagerState,
//    spaceBetweenIndicator: Dp,
//    onEveryStoryChange: ((Int) -> Unit)? = null,
//    onComplete: () -> Unit,
//) {
//    var currentPage by remember {
//        mutableStateOf(0)
//    }
//
//    for (index in 0 until numberOfPages) {
//        LinearIndicator(
//            modifier = indicatorModifier.weight(1f),
//            index == currentPage,
//            indicatorBackgroundColor,
//            indicatorProgressColor,
//            slideDurationInSeconds,
//            pauseTimer,
//            hideIndicators
//        ) {
//            coroutineScope.launch {
//
//                currentPage++
//
//                if (currentPage < numberOfPages) {
//                    onEveryStoryChange?.invoke(currentPage)
//                    pagerState.animateScrollToPage(currentPage)
//                }
//
//                if (currentPage == numberOfPages) {
//                    onComplete()
//                }
//            }
//        }
//
//        Spacer(modifier = Modifier.padding(spaceBetweenIndicator))
//    }
//}