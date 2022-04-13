package com.artemissoftware.hephaestusui.ui.mobilebanking.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.Transaction
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.TransactionGroup
import com.artemissoftware.hephaestusui.ui.mobilebanking.models.TransactionType
import com.artemissoftware.hephaestusui.ui.theme.*

@Composable
fun TransactionHistory(transactions: List<TransactionGroup>) {

    LazyColumn {

        items(transactions){ transition->

            when(transition.type){

                TransactionType.DATE->{

                    Text(
                        text = transition.day,
                        color = TextColor,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
                TransactionType.VALUE->{
                    Transactions(transactionGroup = transition)
                }
            }

            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}


@Composable
private fun Transactions(transactionGroup: TransactionGroup) {
    Card(
        modifier = Modifier,
        elevation = 0.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(15.dp)
    ) {

        Column {

            for (item in transactionGroup.transactions){

                TransactionItem(transaction = item)
                Divider(modifier = Modifier.height(1.5.dp), color = BgColor)

            }

        }

    }
}

@Composable
private fun TransactionItem(transaction: Transaction) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Column(
            modifier = Modifier.weight(0.2f),
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(ItemBgColor)
                    .size(65.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(
                        id = transaction.icon
                    ),
                    contentDescription = "Item Image",
                    modifier = Modifier.size(40.dp),
                    colorFilter = ColorFilter.tint(BankColor)
                )
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(
            modifier = Modifier.weight(0.55f),
//            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = transaction.title,
                color = BankColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
            Text(
                text = transaction.description,
                color = TextColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp
            )
        }
        Column(
            modifier = Modifier
                .weight(0.25f)
                .fillMaxWidth()
        ) {
            Text(
                text = transaction.money,
                color = transaction.color,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
            Text(
                text = transaction.date,
                color = TextColor,
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                fontSize = 15.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.End
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
private fun TransactionItemPreview() {
    Column {


        TransactionItem(transaction = Transaction.getMockList1()[1])
        TransactionItem(transaction = Transaction.getMockList2()[0])
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    TransactionHistory(TransactionGroup.getMockList())
}