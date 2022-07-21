package com.artemissoftware.hephaestusui.ui.onboardingcook.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OnboardingInfo() {

/*
    Box(modifier = Modifier.align(Alignment.BottomCenter)) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(340.dp),
            backgroundColor = Color.White,
            elevation = 0.dp,
            shape = BottomCardShape.large
        ) {
            Box() {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PagerIndicator(items = item, currentPage = pagerState.currentPage)
                    Text(
                        text = item[pagerState.currentPage].title,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp, end = 30.dp),
//                            color = Color(0xFF292D32),
                        color = item[pagerState.currentPage].mainColor,
                        fontFamily = Poppins,
                        textAlign = TextAlign.Right,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Text(
                        text = item[pagerState.currentPage].desc,
                        modifier = Modifier.padding(top = 20.dp, start = 40.dp, end = 20.dp),
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
                        .padding(30.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {


                        if (pagerState.currentPage != 2) {
                            TextButton(onClick = {
                                //skip
                            }) {
                                Text(
                                    text = "Skip Now",
                                    color = Color(0xFF292D32),
                                    fontFamily = Poppins,
                                    textAlign = TextAlign.Right,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }

                            OutlinedButton(
                                onClick = {
                                    GlobalScope.launch {
                                        pagerState.scrollToPage(
                                            pagerState.currentPage + 1,
                                            pageOffset = 0f
                                        )
                                    }
                                },
                                border = BorderStroke(
                                    14.dp,
                                    item[pagerState.currentPage].mainColor
                                ),
                                shape = RoundedCornerShape(50), // = 50% percent
                                //or shape = CircleShape
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = item[pagerState.currentPage].mainColor),
                                modifier = Modifier.size(65.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_right_arrow),
                                    contentDescription = "",
                                    tint = item[pagerState.currentPage].mainColor,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        } else {
                            Button(
                                onClick = {
                                    //show home screen
                                },
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(
                                    backgroundColor = item[pagerState.currentPage].mainColor
                                ),
                                contentPadding = PaddingValues(vertical = 12.dp),
                                elevation = ButtonDefaults.elevation(
                                    defaultElevation = 0.dp
                                )
                            ) {
                                Text(
                                    text = "Get Started",
                                    color = Color.White,
                                    fontSize = 16.sp
                                )
                            }
                        }
                    }
                }
            }
        }

    }
    */

}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    OnboardingInfo()
}