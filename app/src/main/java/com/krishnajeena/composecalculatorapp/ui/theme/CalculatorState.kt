package com.krishnajeena.composecalculatorapp.ui.theme

import com.krishnajeena.composecalculatorapp.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
