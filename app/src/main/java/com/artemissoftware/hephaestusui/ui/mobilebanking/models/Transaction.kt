package com.artemissoftware.hephaestusui.ui.mobilebanking.models

import androidx.compose.ui.graphics.Color
import com.artemissoftware.hephaestusui.R
import com.artemissoftware.hephaestusui.ui.theme.BankColor
import com.artemissoftware.hephaestusui.ui.theme.GreenColor

data class Transaction(
    val icon: Int = 0,
    val title: String = "",
    val description: String = "",
    val money: String = "",
    val date: String = "",
    val color: Color = GreenColor
    ){


    companion object{

        fun getMockList1() = listOf<Transaction>(

            Transaction(icon = R.drawable.groceries, title = "Grocery", description = "Eataly Downtown", money = "-$50.68", date = "Oct 14", color = BankColor),
            Transaction(icon = R.drawable.car, title = "Transport", description = "UBER Pool", money = "-$16.02", date = "Oct 14", color = BankColor),

        )

        fun getMockList2() = listOf<Transaction>(

            Transaction(icon = R.drawable.payment, title = "Payment", description = "Payment from Andre", money = "+$650.00", date = "Sep 3", color = GreenColor),

            )
    }

}
