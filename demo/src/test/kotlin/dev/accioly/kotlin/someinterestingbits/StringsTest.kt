// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits

import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class StringsTest {
    
    @Test
    fun `can reverse a string`() {
        val input = "abc"
        val expected = "cba"
        val actual = input.reversed()
        actual shouldBe expected
    }

    @Test
    fun `detects palindromes`() {
        val input = "racecar"
//        val actual = isPalindrome(input)
        val actual = input.isPalindrome()
        actual.shouldBeTrue()
    }

    @Test
    fun `detects non palindromes`() {
        val input = "catrace"
//        val actual = isPalindrome(input)
        val actual = input.isPalindrome()
        actual.shouldBeFalse()
    }

}
