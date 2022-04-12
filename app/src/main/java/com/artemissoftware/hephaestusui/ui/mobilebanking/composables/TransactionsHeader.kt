package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.Poppins

@Composable
fun TransactionHeader() {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().weight(0.7f)
        ) {
            Text(
                text = "Recent Transactions",
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                color = BankColor,
                fontSize = 22.sp
            )
        }
        Column(
            modifier = Modifier
                .weight(0.3f)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.align(Alignment.End)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "See all",
                        fontFamily = Poppins,
                        color = BankColor.copy(alpha = 0.7f),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    TransactionHeader()
}