package com.kata.gbsuftblai.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GbsuFtbLaiServiceTest{

    private val gbsuFtbLaiService = GbsuFtbLaiService()
    @Test
    fun `1 should return 1`() {

        //given
        val input = 1

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("1",expectedValue)

    }

    @Test
    fun `3 should return GbsuGbsu`() {

        //given
        val input = 3

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("GbsuGbsu",expectedValue)

    }

    @Test
    fun `5 should return FtbFtb`() {

        //given
        val input = 5

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("FtbFtb",expectedValue)


    }

    @Test
    fun `7 should return Lai`() {

        //given
        val input = 7

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("Lai",expectedValue)
    }

    @Test
    fun `9 should return Gbsu`() {

        //given
        val input = 9

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("Gbsu",expectedValue)
    }

    @Test
    fun `51 should return GbsuFtb`() {

        //given
        val input = 51

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
         assertEquals("GbsuFtb",expectedValue)
    }

    @Test
    fun `53 should return FtbGbsu`() {

        //given
        val input = 53

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("FtbGbsu",expectedValue)
    }

    @Test
    fun `27 should return GbsuLai`() {

        //given
        val input = 27

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("GbsuLai",expectedValue)
    }

    @Test
    fun `15 should return GbsuFtbFtb`() {

        //given
        val input = 15

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("GbsuFtbFtb",expectedValue)
    }

    @Test
    fun `33 should return GbsuGbsuGbsu`() {

        //given
        val input = 33

        //when
        val expectedValue = gbsuFtbLaiService.convertNumber(input)

        //then
        assertEquals("GbsuGbsuGbsu",expectedValue)
    }

}