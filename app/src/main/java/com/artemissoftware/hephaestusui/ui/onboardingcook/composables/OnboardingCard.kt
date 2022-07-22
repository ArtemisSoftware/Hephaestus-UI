package com.artemissoftware.hephaestusui.ui.onboardingcook.composables

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.onboardingcook.models.OnboardingDetail
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun OnboardingCard(
    onboardingDetail: OnboardingDetail,
    numberOfPages: Int,
    currentPage: Int,
) { //item[pagerState.currentPage]

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(340.dp),
//        backgroundColor = Color.White,
//        elevation = 0.dp,
//        shape = BottomCardShape.large
    ) {
        Box {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
//                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                PagerIndicator(
                    numberOfPages = numberOfPages,
                    currentPage = currentPage,
                    color = onboardingDetail.mainColor
                )


                Text(
                    text = onboardingDetail.title,
                    modifier = Modifier
                        .fillMaxWidth(),
//                        .padding(top = 20.dp, end = 30.dp),
                    color = onboardingDetail.mainColor,
                    fontFamily = Poppins,
                    textAlign = TextAlign.Right,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )


                Text(
                    text = onboardingDetail.desc,
//                    modifier = Modifier.padding(top = 20.dp, start = 40.dp, end = 20.dp),
                    color = Color.Gray,
                    fontFamily = Poppins,
                    fontSize = 17.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.ExtraLight
                )

            }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
//                    .padding(30.dp)
            ) {

                OnboardingOptions(onboardingDetail = onboardingDetail)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun OnboardingCardPreview() {
    OnboardingCard(OnboardingDetail.mockOnboardingDetailList[0], numberOfPages = 3, currentPage = 1)
}