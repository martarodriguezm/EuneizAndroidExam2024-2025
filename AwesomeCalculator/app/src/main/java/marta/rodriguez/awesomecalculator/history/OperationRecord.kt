package marta.rodriguez.awesomecalculator.history

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OperationRecord (val operand1: Double, val operand2: Double, val operation: String, val result: String) : Parcelable