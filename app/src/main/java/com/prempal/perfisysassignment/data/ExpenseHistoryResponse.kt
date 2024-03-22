package com.prempal.perfisysassignment.data

data class ExpenseHistoryResponse(
    val date: String,
    val item: String,
    val price: String,
    val paidBy: String
)