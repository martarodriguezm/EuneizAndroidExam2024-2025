package marta.rodriguez.awesomecalculator

import marta.rodriguez.awesomecalculator.history.OperationRecord

class Calculator {
    private var firstOperand: Double? = null
    private var secondOperand: Double? = null
    private var operation: String? = null

    fun inputNumber(number: String): String {
        if (operation == null) {
            val newFirstOperand = (firstOperand?.toString() ?: "") + number
            firstOperand = newFirstOperand.toDoubleOrNull()
            return newFirstOperand
        } else {
            val newSecondOperand = (secondOperand?.toString() ?: "") + number
            secondOperand = newSecondOperand.toDoubleOrNull()
            return newSecondOperand
        }
    }

    fun inputOperation(op: String) {
        operation = op
    }

    fun getCurrentOperationRecord() : OperationRecord {
        return OperationRecord(firstOperand!!, secondOperand!!, operation!!, "")
    }

    fun calculate(): String {
        if (firstOperand == null || secondOperand == null || operation == null) {
            return "Error"
        }

        val result = when (operation) {
            "+" -> firstOperand!!.plus(secondOperand!!)
            "-" -> firstOperand!!.minus(secondOperand!!)
            "x" -> firstOperand!!.times(secondOperand!!)
            "÷" -> if (secondOperand == 0.0) {
                return "Error"
            } else {
                firstOperand!!.div(secondOperand!!)
            }
            else -> return "Error"
        }

        firstOperand = result
        secondOperand = null
        operation = null
        return result.toString()
    }

    fun clear() {
        firstOperand = null
        secondOperand = null
        operation = null
    }
}