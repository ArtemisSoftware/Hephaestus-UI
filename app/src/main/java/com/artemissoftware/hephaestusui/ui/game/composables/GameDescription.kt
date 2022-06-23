package com.artemissoftware.hephaestusui.ui.game.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.artemissoftware.hephaestusui.ui.game.models.GameDetail

@Composable
fun GameDescription(description: String) {
//    val maxLines = remember { mutableStateOf(4) }
//
//    val toggle = remember {
//        mutableStateOf(DescriptionStatus.DEFAULT)
//    }

    Column {
        // Desctiption text
        Text(
            modifier = Modifier/*.getDetailsModifier()*/,
            text = description,
            overflow = TextOverflow.Ellipsis,
//            maxLines = maxLines.value,
//            onTextLayout = {
//                if (it.lineCount == 4 &&
//                    it.isLineEllipsized(3)
//                ) {
//                    // game description has overflowed maxLines
//                    // show Show More
//                    toggle.value =
//                        DescriptionStatus.SHOW_MORE
//                } else if (it.lineCount > 4) {
//                    // showing entire description
//                    // show Show Less
//                    toggle.value =
//                        DescriptionStatus.SHOW_LESS
//                } else {
//                    // game description has not overflowed maxLines
//                    // do not show Show More at all
//                }
//            }
        )
//        when (toggle.value) {
//            DescriptionStatus.SHOW_MORE -> {
//                // display show more
//                Text(
//                    modifier =
//                    Modifier.padding(
//                        start = 16.dp,
//                        end = 16.dp
//                    )
//                        .clickable {
//                            maxLines.value =
//                                Int.MAX_VALUE
//                        },
//                    text = "Show More",
//                    color = Color(0xFFF50057),
//                    textDecoration =
//                    TextDecoration.Underline,
//                )
//            }
//            DescriptionStatus.SHOW_LESS -> {
//                // display show less
//                Text(
//                    modifier =
//                    Modifier.padding(
//                        start = 16.dp,
//                        end = 16.dp
//                    )
//                        .clickable {
//                            maxLines.value = 4
//                        },
//                    text = "Show Less",
//                    color = Color(0xFFF50057),
//                    textDecoration =
//                    TextDecoration.Underline,
//                )
//            }
//            else -> {
//                // show more is not displayed at all
//                // do not do anything
//            }
//        }
    }
}

enum class DescriptionStatus {
    DEFAULT,
    SHOW_MORE,
    SHOW_LESS
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    GameDescription(description = GameDetail.getMock().description)
}