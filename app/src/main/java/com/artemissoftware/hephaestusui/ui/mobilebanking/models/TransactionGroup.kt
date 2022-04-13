package com.artemissoftware.hephaestusui.ui.mobilebanking.models

data class TransactionGroup(
    val type: TransactionType,
    val day: String,
    val transactions: List<Transaction> = emptyList()
    ){

    companion object{

        fun getMockList() = listOf<TransactionGroup>(

            TransactionGroup(type = TransactionType.DATE, day = "TODAY"),
            TransactionGroup(type = TransactionType.VALUE, day = "TODAY", transactions = Transaction.getMockList1()),
            TransactionGroup(type = TransactionType.DATE, day = "YESTERDAY"),
            TransactionGroup(type = TransactionType.VALUE, day = "YESTERDAY", transactions = Transaction.getMockList2()),
            )

    }

}
