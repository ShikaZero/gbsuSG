package com.kata.gbsuftblai.stringBuilder

import org.springframework.stereotype.Component

@Component("stringBuilderFromInput")
class StringBuilderFromInput{

    fun buildStringNumber(inputNumber: Int) = inputNumber
        .takeIf { it.toString().contains("7") }?.let { "Lai" }.orEmpty()

}

@Component
class StringBuilderFromNumberFive: StringBuilderFromInput() {

    override fun buildStringNumber(inputNumber: Int): String {
        var resultValueFromInput = ""
        inputNumber.takeIf { it % 5 == 0 }?.let { resultValueFromInput += "Ftb" }
        inputNumber.toString().forEach { input ->
            input.takeIf { it.toString().contains("5") }?.let { resultValueFromInput += "Ftb" }
        }
        println(resultValueFromInput)
        return resultValueFromInput
    }
}

@Component
class StringBuilderFromNumberThree: StringBuilderFromInput(){

    override fun buildStringNumber(inputNumber: Int): String {
        var resultValueFromInput = ""
        inputNumber.takeIf { it % 3 == 0 }?.let { resultValueFromInput += "Gbsu" }
        inputNumber.toString().forEach { input ->
            input.takeIf { it.toString().contains("3") }?.let { resultValueFromInput += "Gbsu" }
        }
        println(resultValueFromInput)
        return resultValueFromInput
    }
}