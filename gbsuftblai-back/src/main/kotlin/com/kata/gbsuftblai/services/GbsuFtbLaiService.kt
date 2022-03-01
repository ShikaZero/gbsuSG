package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {
    fun convertNumber(inputNumber: Int): String {
        var result = ""

        when{
            inputNumber % 3 == 0 -> {
                result += buildStringNumberFrom3(inputNumber)
                result += buildStringNumberFrom5(inputNumber)
                result += buildStringNumberFrom7(inputNumber)
            }
            inputNumber % 5 == 0 || inputNumber.toString().startsWith("5" ) -> {
                result += buildStringNumberFrom5(inputNumber)
                result += buildStringNumberFrom3(inputNumber)
                result += buildStringNumberFrom7(inputNumber)
            }
            inputNumber.toString().startsWith("7") -> {
                result += buildStringNumberFrom7(inputNumber)
                result += buildStringNumberFrom3(inputNumber)
                result += buildStringNumberFrom5(inputNumber)
            }
            else ->  {
                result += buildStringNumberFrom3(inputNumber)
                result += buildStringNumberFrom5(inputNumber)
                result += buildStringNumberFrom7(inputNumber)
            }
        }
        return result.takeIf {it != ""} ?: inputNumber.toString()
    }

    fun buildStringNumberFrom3(inputNumber: Int): String {
        var resultValueFromInput = ""
        inputNumber.takeIf { it % 3 == 0}?.let { resultValueFromInput += "Gbsu" }
        inputNumber.takeIf { it.toString().contains("3")}?.let { resultValueFromInput += "Gbsu" }
        return resultValueFromInput
    }

    fun buildStringNumberFrom5(inputNumber: Int): String {
        var resultValueFromInput = ""
        inputNumber.takeIf { it % 5 == 0}?.let { resultValueFromInput += "Ftb" }
        inputNumber.takeIf { it.toString().contains("5")}?.let { resultValueFromInput += "Ftb" }
        return resultValueFromInput
    }

    fun buildStringNumberFrom7(inputNumber: Int) =
        inputNumber.takeIf { it.toString().contains("7") }?.let { "Lai" }.orEmpty()

}

