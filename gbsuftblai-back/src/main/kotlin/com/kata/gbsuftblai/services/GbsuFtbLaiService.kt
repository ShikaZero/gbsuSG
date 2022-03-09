package com.kata.gbsuftblai.services

import com.kata.gbsuftblai.stringBuilder.BuildFullInputNumber
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService(@Autowired val builderFromInput: BuildFullInputNumber) {

    fun convertNumber(inputNumber: Int): String = builderFromInput.buildFullInputNumber(inputNumber)
                                                    .takeIf {it != ""} ?: inputNumber.toString()


}

