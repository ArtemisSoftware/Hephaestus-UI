package com.artemissoftware.hephaestusui.ui.onboardingcook

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.onboardingcook.composables.OnboardingCard
import com.artemissoftware.hephaestusui.ui.onboardingcook.models.OnboardingDetail
import com.artemissoftware.hephaestusui.ui.theme.ColorBlue
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingCookScreen() {

    val items = OnboardingDetail.mockOnboardingDetailList

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0,
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = ColorBlue)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(state = pagerState, count = items.size) { page ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(items[page].backgroundColor),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Top
                ) {

                    Image(
                        painter = painterResource(id = items[page].image),
                        contentDescription = items[page].title,
                        modifier = Modifier
                            .fillMaxWidth()
                    )


                }
            }

        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        ) {
            OnboardingCard(
                onboardingDetail = items[pagerState.currentPage],
                numberOfPages = pagerState.pageCount,
                currentPage = pagerState.currentPage
            )
        }
    }

}

@ExperimentalPagerApi
@Composable
fun rememberPagerState(
    @androidx.annotation.IntRange(from = 0) pageCount: Int,
    @androidx.annotation.IntRange(from = 0) initialPage: Int = 0,
    @FloatRange(from = 0.0, to = 1.0) initialPageOffset: Float = 0f,
    @androidx.annotation.IntRange(from = 1) initialOffscreenLimit: Int = 1,
    infiniteLoop: Boolean = false
): PagerState = rememberSaveable(saver = PagerState.Saver) {
    PagerState(
//        pageCount = pageCount,
        currentPage = initialPage,
//        currentPageOffset = initialPageOffset,
//        offscreenLimit = initialOffscreenLimit,
//        infiniteLoop = infiniteLoop
    )
}

@Preview(showBackground = true)
@Composable
private fun OnboardingCookScreenPreview() {
    OnboardingCookScreen()
}