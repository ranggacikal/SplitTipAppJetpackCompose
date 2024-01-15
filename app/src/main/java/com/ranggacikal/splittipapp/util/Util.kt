package com.ranggacikal.splittipapp.util

fun calculateTotalTipAmount(totalBill: String, tipPercentage: Int): Double {
    return if (totalBill.toDouble() > 1 && totalBill.isNotEmpty())
        (totalBill.toDouble() * tipPercentage) / 100 else 0.0
}

fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy: Int,
    tipPercentage: Int
): Double {
    val bill =
        calculateTotalTipAmount(
            totalBill = totalBill.toString(),
            tipPercentage = tipPercentage
        ) + totalBill

    return  (bill / splitBy)
}