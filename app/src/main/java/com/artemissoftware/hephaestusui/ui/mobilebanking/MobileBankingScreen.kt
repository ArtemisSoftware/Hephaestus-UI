package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.BalanceInfo
import com.artemissoftware.hephaestusui.ui.theme.BankColor

@Composable
fun MobileBankingScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {
//        Spacer(modifier = Modifier.height(25.dp))
        Column(
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            BalanceInfo()

//            Text(
//                text = "Available Balance",
//                color = Color.White.copy(alpha = 0.5f),
//                fontFamily = FontFamily(Font(R.font.poppins_light)),
//                fontSize = 14.sp
//            )
//            Spacer(modifier = Modifier.height(15.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Column(
//                    modifier = Modifier.weight(1f),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color.White)
//                            .size(65.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.send),
//                            contentDescription = "Send",
//                            modifier = Modifier.size(35.dp),
//                            colorFilter = ColorFilter.tint(BankColor)
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(10.dp))
//                    Text(
//                        text = "Send",
//                        color = Color.White.copy(alpha = 0.5f),
//                        fontFamily = FontFamily(Font(R.font.poppins_light)),
//                        fontSize = 14.sp
//                    )
//                }
//                Column(
//                    modifier = Modifier.weight(1f),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color.White)
//                            .size(65.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.request),
//                            contentDescription = "Request",
//                            modifier = Modifier.size(35.dp),
//                            colorFilter = ColorFilter.tint(BankColor)
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(10.dp))
//                    Text(
//                        text = "Request",
//                        color = Color.White.copy(alpha = 0.5f),
//                        fontFamily = FontFamily(Font(R.font.poppins_light)),
//                        fontSize = 14.sp
//                    )
//                }
//                Column(
//                    modifier = Modifier.weight(1f),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color.White)
//                            .size(65.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.loan),
//                            contentDescription = "Loan",
//                            modifier = Modifier.size(35.dp),
//                            colorFilter = ColorFilter.tint(BankColor)
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(10.dp))
//                    Text(
//                        text = "Loan",
//                        color = Color.White.copy(alpha = 0.5f),
//                        fontFamily = FontFamily(Font(R.font.poppins_light)),
//                        fontSize = 14.sp
//                    )
//                }
//                Column(
//                    modifier = Modifier.weight(1f),
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Column(
//                        modifier = Modifier
//                            .clip(RoundedCornerShape(20.dp))
//                            .background(Color.White)
//                            .size(65.dp),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.top_up),
//                            contentDescription = "Topup",
//                            modifier = Modifier.size(35.dp),
//                            colorFilter = ColorFilter.tint(BankColor)
//                        )
//                    }
//                    Spacer(modifier = Modifier.height(10.dp))
//                    Text(
//                        text = "Topup",
//                        color = Color.White.copy(alpha = 0.5f),
//                        fontFamily = FontFamily(Font(R.font.poppins_light)),
//                        fontSize = 14.sp
//                    )
//                }
//            }
        }
//        Column(
//            modifier = Modifier
//                .weight(0.72f)
//                .fillMaxSize()
//                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
//                .background(BgColor)
//                .padding(20.dp)
//        ) {
//            Row(
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Column(
//                    modifier = Modifier.weight(0.7f)
//                ) {
//                    Text(
//                        text = "Recent Transactions",
//                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                        color = BankColor,
//                        fontSize = 22.sp,
//                        modifier = Modifier.fillMaxWidth()
//                    )
//                }
//                Column(
//                    modifier = Modifier
//                        .weight(0.3f)
//                        .fillMaxWidth()
//                ) {
//                    Column(
//                        modifier = Modifier.align(Alignment.End)
//                    ) {
//                        Row(
//                            verticalAlignment = Alignment.CenterVertically
//                        ) {
//                            Text(
//                                text = "See all",
//                                fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                                color = BankColor.copy(alpha = 0.7f),
//                                fontSize = 16.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Card(
//                    modifier = Modifier.padding(5.dp),
//                    elevation = 0.dp,
//                    backgroundColor = Color.White,
//                    shape = RoundedCornerShape(15.dp)
//                ) {
//                    Text(
//                        text = "All",
//                        color = BankColor,
//                        modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp),
//                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                        fontSize = 16.sp,
//                        fontWeight = FontWeight.Bold
//                    )
//                }
//                Card(
//                    modifier = Modifier.padding(5.dp),
//                    elevation = 0.dp,
//                    backgroundColor = Color.White,
//                    shape = RoundedCornerShape(15.dp)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
//                            .alpha(0.4f),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.arrow_down),
//                            contentDescription = "Income",
//                            colorFilter = ColorFilter.tint(GreenColor)
//                        )
//                        Spacer(modifier = Modifier.width(5.dp))
//                        Text(
//                            text = "Income",
//                            color = BankColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//                Card(
//                    modifier = Modifier.padding(5.dp),
//                    elevation = 0.dp,
//                    backgroundColor = Color.White,
//                    shape = RoundedCornerShape(15.dp)
//                ) {
//                    Row(
//                        modifier = Modifier
//                            .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
//                            .alpha(0.4f),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.arrow_up),
//                            contentDescription = "Expense",
//                            colorFilter = ColorFilter.tint(BadgeColor)
//                        )
//                        Spacer(modifier = Modifier.width(5.dp))
//                        Text(
//                            text = "Expense",
//                            color = BankColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "TODAY",
//                color = TextColor,
//                fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                fontSize = 18.sp
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Card(
//                modifier = Modifier,
//                elevation = 0.dp,
//                backgroundColor = Color.White,
//                shape = RoundedCornerShape(15.dp)
//            ) {
//                LazyColumn {
//                    items(2) { index ->
//                        Row(
//                            verticalAlignment = Alignment.CenterVertically,
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(15.dp)
//                        ) {
//                            Column(
//                                modifier = Modifier.weight(0.2f),
//                                verticalArrangement = Arrangement.Center
//                            ) {
//                                Column(
//                                    modifier = Modifier
//                                        .clip(RoundedCornerShape(20.dp))
//                                        .background(ItemBgColor)
//                                        .size(65.dp),
//                                    horizontalAlignment = Alignment.CenterHorizontally,
//                                    verticalArrangement = Arrangement.Center
//                                ) {
//                                    Image(
//                                        painter = painterResource(
//                                            id = if (index % 2 == 0) {
//                                                R.drawable.groceries
//                                            } else {
//                                                R.drawable.car
//                                            }
//                                        ),
//                                        contentDescription = "Item Image",
//                                        modifier = Modifier.size(40.dp),
//                                        colorFilter = ColorFilter.tint(BankColor)
//                                    )
//                                }
//                            }
//                            Spacer(modifier = Modifier.width(10.dp))
//                            Column(
//                                modifier = Modifier.weight(0.55f),
//                                verticalArrangement = Arrangement.Center
//                            ) {
//                                Text(
//                                    text = if (index % 2 == 0) {
//                                        "Grocery"
//                                    } else {
//                                        "Transport"
//                                    },
//                                    color = BankColor,
//                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                                    fontSize = 17.sp
//                                )
//                                Text(
//                                    text = if (index % 2 == 0) {
//                                        "Eataly Downtown"
//                                    } else {
//                                        "UBER Pool"
//                                    },
//                                    color = TextColor,
//                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                                    fontSize = 15.sp
//                                )
//                            }
//                            Column(
//                                modifier = Modifier
//                                    .weight(0.25f)
//                                    .fillMaxWidth()
//                            ) {
//                                Text(
//                                    text = if (index % 2 == 0) {
//                                        "-$50.68"
//                                    } else {
//                                        "-$16.02"
//                                    },
//                                    color = BankColor,
//                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                                    fontSize = 17.sp,
//                                    modifier = Modifier.fillMaxWidth(),
//                                    textAlign = TextAlign.End
//                                )
//                                Text(
//                                    text = if (index % 2 == 0) {
//                                        "Oct 14"
//                                    } else {
//                                        "Oct 14"
//                                    },
//                                    color = TextColor,
//                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                                    fontSize = 15.sp,
//                                    modifier = Modifier.fillMaxWidth(),
//                                    textAlign = TextAlign.End
//                                )
//                            }
//                        }
//                        Divider(modifier = Modifier.height(1.5.dp), color = BgColor)
//                    }
//                }
//            }
//            Spacer(modifier = Modifier.height(5.dp))
//            Text(
//                text = "YESTERDAY",
//                color = TextColor,
//                fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                fontSize = 18.sp
//            )
//            Spacer(modifier = Modifier.height(5.dp))
//            Card(
//                modifier = Modifier,
//                elevation = 0.dp,
//                backgroundColor = Color.White,
//                shape = RoundedCornerShape(15.dp)
//            ) {
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(15.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.weight(0.2f),
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Column(
//                            modifier = Modifier
//                                .clip(RoundedCornerShape(20.dp))
//                                .background(ItemBgColor)
//                                .size(65.dp),
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                            verticalArrangement = Arrangement.Center
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.payment),
//                                contentDescription = "Item Image",
//                                modifier = Modifier.size(40.dp),
//                                colorFilter = ColorFilter.tint(BankColor)
//                            )
//                        }
//                    }
//                    Spacer(modifier = Modifier.width(10.dp))
//                    Column(
//                        modifier = Modifier.weight(0.55f),
//                        verticalArrangement = Arrangement.Center
//                    ) {
//                        Text(
//                            text = "Payment",
//                            color = BankColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                            fontSize = 17.sp
//                        )
//                        Text(
//                            text = "Payment from Andre",
//                            color = TextColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                            fontSize = 15.sp
//                        )
//                    }
//                    Column(
//                        modifier = Modifier
//                            .weight(0.25f)
//                            .fillMaxWidth()
//                    ) {
//                        Text(
//                            text = "+$650.00",
//                            color = GreenColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                            fontSize = 17.sp,
//                            modifier = Modifier.fillMaxWidth(),
//                            textAlign = TextAlign.End
//                        )
//                        Text(
//                            text = "Sep 3",
//                            color = TextColor,
//                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                            fontSize = 15.sp,
//                            modifier = Modifier.fillMaxWidth(),
//                            textAlign = TextAlign.End
//                        )
//                    }
//                }
//            }
//        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileBankingScreen()
}