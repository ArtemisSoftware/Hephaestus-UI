package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.MobileCardHeader
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.MobileCards
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.CardType
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.BgColor

@Composable
fun MobileCardScreen() {
    val visaType by remember { mutableStateOf(CardType.Visa) }
//    val contactless = remember { mutableStateOf(false) }
//    val payment = remember { mutableStateOf(false) }
//    val atm = remember { mutableStateOf(false) }
//    val animatedColor = animateColorAsState(targetValue = Color(0xFF1C478B))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(BgColor)
                .padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))

            MobileCardHeader()

            Spacer(modifier = Modifier.height(20.dp))

            MobileCards(visaType)



//
//            Spacer(modifier = Modifier.height(25.dp))
//
//            Text(
//                text = "Card Settings",
//                color = BankColor,
//                fontFamily = FontFamily(Font(R.font.poppins_bold)),
//                fontSize = 25.sp,
//                fontWeight = FontWeight.Bold
//            )
//            Spacer(modifier = Modifier.height(10.dp))
//
//            Card(
//                modifier = Modifier.padding(5.dp),
//                elevation = 0.dp,
//                backgroundColor = Color.White,
//                shape = RoundedCornerShape(15.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp, vertical = 15.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        modifier = Modifier.weight(0.1f),
//                        horizontalAlignment = Alignment.End
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.ic_outline_wifi_tethering_24),
//                            contentDescription = "Contactless",
//                            tint = BankColor
//                        )
//                    }
//                    Text(
//                        text = "Contactless Payment",
//                        color = BankColor,
//                        modifier = Modifier
//                            .weight(0.7f)
//                            .padding(start = 15.dp),
//                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                        fontSize = 16.sp
//                    )
//                    Switch(
//                        checked = contactless.value,
//                        onCheckedChange = { contactless.value = it },
//                        colors = SwitchDefaults.colors(GreenColor),
//                        modifier = Modifier.weight(0.2f)
//                    )
//                }
//            }
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//            Card(
//                modifier = Modifier.padding(5.dp),
//                elevation = 0.dp,
//                backgroundColor = Color.White,
//                shape = RoundedCornerShape(15.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp, vertical = 15.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        modifier = Modifier.weight(0.1f),
//                        horizontalAlignment = Alignment.End
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.ic_outline_payments_24),
//                            contentDescription = "Payment",
//                            tint = BankColor
//                        )
//                    }
//                    Text(
//                        text = "Online Payment",
//                        color = BankColor,
//                        modifier = Modifier
//                            .weight(0.7f)
//                            .padding(start = 15.dp),
//                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                        fontSize = 16.sp
//                    )
//                    Switch(
//                        checked = payment.value,
//                        onCheckedChange = { payment.value = it },
//                        colors = SwitchDefaults.colors(GreenColor),
//                        modifier = Modifier.weight(0.2f)
//                    )
//                }
//            }
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//            Card(
//                modifier = Modifier.padding(5.dp),
//                elevation = 0.dp,
//                backgroundColor = Color.White,
//                shape = RoundedCornerShape(15.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 10.dp, vertical = 15.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        modifier = Modifier.weight(0.1f),
//                        horizontalAlignment = Alignment.End
//                    ) {
//                        Icon(
//                            painter = painterResource(id = R.drawable.ic_baseline_local_atm_24),
//                            contentDescription = "ATM",
//                            tint = BankColor
//                        )
//                    }
//                    Text(
//                        text = "ATM Withdraws",
//                        color = BankColor,
//                        modifier = Modifier
//                            .weight(0.7f)
//                            .padding(start = 15.dp),
//                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
//                        fontSize = 16.sp
//                    )
//                    Switch(
//                        checked = atm.value,
//                        onCheckedChange = { atm.value = it },
//                        colors = SwitchDefaults.colors(GreenColor),
//                        modifier = Modifier.weight(0.2f)
//                    )
//                }
//            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileCardScreen()
}