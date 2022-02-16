package com.artemissoftware.hephaestusui.ui.stories

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.artemissoftware.hephaestusui.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.PagerScope

@ExperimentalPagerApi
@Composable
fun StoriesApp(){

    Surface(color = MaterialTheme.colors.background) {

        val listOfImages = listOf(R.drawable.artemis, R.drawable.artemis_2, R.drawable.artemis_3)

        StoriesScreen(
            numberOfPages = listOfImages.size,
//            onEveryStoryChange = { position ->
//                Log.i("DATA", "Story Change $position")
//            },
//            onComplete = {
//                Log.i("Action", "Completed")
//            },
            content = { index ->
                Image(
                    painter = painterResource(id = listOfImages[index]),
                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
        )
    }
}