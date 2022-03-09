package com.kata.gbsuftblai.stringBuilder

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class BuildFullInputNumber(
    @Qualifier("stringBuilderFromInput") @Autowired val stringBuilder: StringBuilderFromInput,
    @Autowired val stringBuilderFromNumberFive: StringBuilderFromNumberFive,
    @Autowired val stringBuilderFromNumberThree: StringBuilderFromNumberThree) {

    fun buildFullInputNumber(inputNumber: Int): String {
        var result = ""

        when{
            inputNumber % 3 == 0 -> {
                result += stringBuilderFromNumberThree.buildStringNumber(inputNumber)
                result += stringBuilderFromNumberFive.buildStringNumber(inputNumber)
                result += stringBuilder.buildStringNumber(inputNumber)
            }
            inputNumber % 5 == 0 || inputNumber.toString().startsWith("5" ) -> {
                result += stringBuilderFromNumberFive.buildStringNumber(inputNumber)
                result += stringBuilderFromNumberThree.buildStringNumber(inputNumber)
                result += stringBuilder.buildStringNumber(inputNumber)
            }
            inputNumber.toString().startsWith("7") -> {
                result += stringBuilder.buildStringNumber(inputNumber)
                result += stringBuilderFromNumberThree.buildStringNumber(inputNumber)
                result += stringBuilderFromNumberFive.buildStringNumber(inputNumber)
            }
            else ->  {
                result += stringBuilderFromNumberThree.buildStringNumber(inputNumber)
                result += stringBuilderFromNumberFive.buildStringNumber(inputNumber)
                result += stringBuilder.buildStringNumber(inputNumber)
            }
        }

        return result
    }
}