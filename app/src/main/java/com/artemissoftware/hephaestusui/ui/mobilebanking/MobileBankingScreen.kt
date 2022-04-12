package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.BalanceInfo
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.BankingOptions
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.TransactionFilters
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.TransactionHeader
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.BgColor

@Composable
fun MobileBankingScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {

        Spacer(modifier = Modifier.height(25.dp))

        Column(
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {

            BalanceInfo()

            Spacer(modifier = Modifier.height(15.dp))

            BankingOptions()
        }
        Column(
            modifier = Modifier
                .weight(0.72f)
                .fillMaxSize()
//                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(BgColor)
                .padding(20.dp)
        ) {

            TransactionHeader()

            Spacer(modifier = Modifier.height(5.dp))

            TransactionFilters()

            Spacer(modifier = Modifier.height(5.dp))

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
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileBankingScreen()
}