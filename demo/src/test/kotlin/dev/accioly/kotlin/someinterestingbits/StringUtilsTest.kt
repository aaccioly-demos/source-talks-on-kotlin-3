// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits

import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.reflect.InvocationTargetException
import kotlin.reflect.jvm.isAccessible
import kotlin.test.fail

class StringUtilsTest {

    @Test
    fun `can't be instantiated`() {
        assertThrows<InvocationTargetException> {
            StringUtils::class.constructors.first().run {
                isAccessible = true
                call().run {
                    // methodOneShouldntBeAllowedToCall()
                }
                fail("StringUtils should not be instantiated")
            }
        }
    }

    @Test
    fun `can reverse a string`() {
        val input = "abc"
        val expected = "cba"
        val actual = StringUtils.reverse(input)
        actual shouldBe expected
    }

    @Test
    fun `detects palindromes`() {
        val input = "racecar"
        val actual = StringUtils.isPalindrome(input)
        actual.shouldBeTrue()
    }

    @Test
    fun `detects non palindromes`() {
        val input = "catrace"
        val actual = StringUtils.isPalindrome(input)
        actual.shouldBeFalse()
    }

    @Test
    fun `returns first and last characters at once`() {
        val input = "behind the scenes"
        val firstAndLast = StringUtils.firstAndLast(input)

        with(firstAndLast) {
            first shouldBe 'b'
            last shouldBe 's'
        }
    }

    @Test
    fun `returns the same first and last characters for single letter string`() {
        val input = "a"
        val firstAndLast = StringUtils.firstAndLast(input)

        with(firstAndLast) {
            first shouldBe 'a'
            last shouldBe 'a'
        }
    }

    @Test
    fun `throws NPE on null input`() {
        val input: String? = null
        assertThrows<java.lang.NullPointerException> {
            StringUtils.firstAndLast(input)
        }
    }
}
