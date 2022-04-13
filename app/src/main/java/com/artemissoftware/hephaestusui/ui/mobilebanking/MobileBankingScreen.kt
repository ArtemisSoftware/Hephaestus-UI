package com.artemissoftware.hephaestusui.ui.mobilebanking

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.artemissoftware.hephaestusui.ui.mobilebanking.composables.*
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.Transaction
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.TransactionGroup
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
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(BgColor)
                .padding(20.dp)
        ) {

            TransactionHeader()

            Spacer(modifier = Modifier.height(5.dp))

            TransactionFilters()

            Spacer(modifier = Modifier.height(5.dp))

            TransactionHistory(transactions = TransactionGroup.getMockList())

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    MobileBankingScreen()
}