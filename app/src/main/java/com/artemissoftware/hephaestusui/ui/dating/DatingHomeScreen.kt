package com.artemissoftware.hephaestusui.ui.dating

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.artemissoftware.hephaestusui.ui.dating.composables.DateContent
import com.artemissoftware.hephaestusui.ui.dating.composables.DateSelector
import com.artemissoftware.hephaestusui.ui.dating.composables.DatingLoader
import com.artemissoftware.hephaestusui.ui.dating.composables.DraggableCard
import com.artemissoftware.hephaestusui.ui.dating.models.Date
import com.artemissoftware.hephaestusui.ui.theme.LIGHTBLUE50

@Composable
fun DatingHomeScreen() {

    val viewModel: DatingViewModel = viewModel()
    val fruits = viewModel.date

    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp.dp
    val cardHeight = screenHeight - 200.dp

    val noMoreDates = remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = LIGHTBLUE50
    ) {

        Column {

            Box {

                DatingLoader(modifier = Modifier)
                fruits.value?.forEachIndexed { index, date ->

                    DraggableDateCard(
                        date = date,
                        index = index,
                        onSwiped = {
                            noMoreDates.value = viewModel.removeDate(it)
                        }
                    ) {
                        DateContent(date = date, height = cardHeight)
                    }
                }

                DateSelector(noMoreDates = noMoreDates, height = cardHeight)
            }
        }
    }
}

@Composable
private fun DraggableDateCard(
    date: Date,
    index: Int,
    onSwiped: (Date) -> Unit,
    content: @Composable (Date) -> Unit
){

    DraggableCard(
        item = date,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                top = 16.dp + (index + 2).dp,
                bottom = 16.dp,
                start = 16.dp,
                end = 16.dp
            ),
        onSwiped = { _, swipedDate ->

            onSwiped(swipedDate as Date)

        }
    ) {
        content(date)
    }

}


@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    DatingHomeScreen()
}