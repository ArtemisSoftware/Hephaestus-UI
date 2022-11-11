package com.artemissoftware.hephaestusui.ui.onboardingcook

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingCookScreen() {

    val items = OnboardingDetail.mockOnboardingDetailList

    val pagerState = rememberPagerState()
    val scope = rememberCoroutineScope()

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
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
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
                currentPage = pagerState.currentPage,
                onNextClick = {

                    scope.launch {
                        pagerState.scrollToPage(pagerState.currentPage + 1)
                    }
                }
            )
        }
    }

}



@Preview(showBackground = true)
@Composable
private fun OnboardingCookScreenPreview() {
    OnboardingCookScreen()
}