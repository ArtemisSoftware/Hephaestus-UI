package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.CardSettings
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.MobileCardHeader
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.MobileCards
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.CardType
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.BgColor

@Composable
fun MobileCardScreen() {
    val visaType by remember { mutableStateOf(CardType.Visa) }
    val contactless = remember { mutableStateOf(false) }
    val payment = remember { mutableStateOf(false) }
    val atm = remember { mutableStateOf(false) }


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

            LazyColumn {
                item { MobileCards(visaType) }
                item { Spacer(modifier = Modifier.height(25.dp)) }
                item { CardSettings(contactless, payment, atm) }
                item { Spacer(modifier = Modifier.height(40.dp)) }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileCardScreen()
}