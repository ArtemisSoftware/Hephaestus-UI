package com.artemissoftware.hephaestusui.ui.stories.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerScope
import com.google.accompanist.pager.PagerState


@ExperimentalPagerApi
@Composable
fun StoryImage(
    pagerState: PagerState,
    content: @Composable PagerScope.(page: Int) -> Unit
){

    HorizontalPager(
        state = pagerState,
        content = content
    )
}

@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    //--StoryImage()
}

//@ExperimentalComposeUiApi
//@OptIn(ExperimentalPagerApi::class)
//@Composable
//fun StoryImage(pagerState: PagerState, onTap: (Boolean) -> Unit, content: @Composable (Int) -> Unit) {
//    HorizontalPager(state = pagerState, dragEnabled = false, modifier = Modifier.pointerInteropFilter {
//        when(it.action) {
//            MotionEvent.ACTION_DOWN -> {
//                onTap(true)
//            }
//
//            MotionEvent.ACTION_UP -> {
//                onTap(false)
//            }
//        }
//        true
//    }) {
//        content(it)
//    }
//}