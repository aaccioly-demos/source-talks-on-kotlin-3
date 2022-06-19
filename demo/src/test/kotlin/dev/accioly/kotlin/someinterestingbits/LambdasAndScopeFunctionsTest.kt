// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits

import io.kotest.assertions.fail
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldBeSingleLine
import io.kotest.matchers.string.shouldContain
import org.junit.jupiter.api.Test

class LambdasAndScopeFunctionsTest {

    @Test
    fun `scope functions are cool`() {
        val jackson = Person("Michael", "Jackson", 50)

        val result = jackson.copy(lastName = "Jordan", age = 59)
            .let { jordan -> // Temporary variable for Michael Jordan
                jordan.firstName shouldBe "Michael"
                jordan.lastName shouldBe "Jordan"
                jordan.age shouldBe 59 // Michael Jordan is 59 as of 16/06/2022
                jackson// Forwards Michael Jackson, despite operating on Michael Jordan
            }.apply { // Changes Michael Jackson age
                age += 13
            }.also { // Useful for logging and additional effects
                it.age shouldBe 63 // Michael Jackson would be 63 as of 16/06/2022
            }.run {
                age += 1
                val mjInitials = initials(firstName, lastName)
                "By 29 August 2022 $mjInitials would be $age years old"
            }

        with(result) {
            shouldBeSingleLine()
            shouldContain("64")
            shouldBe("By 29 August 2022 M.J. would be 64 years old")
        }
    }

    @Test
    fun `handle nulls with let`() {
        var nullableString: String? = null

        val executedStatementInsideFirstBlock = nullableString?.let {
            fail("This should not be executed as $it should be null")
            true
        } ?: false

        executedStatementInsideFirstBlock.shouldBeFalse()

        nullableString = "Hello"

        val executedStatementInsideSecondBlock = nullableString?.let {
            it shouldBe "Hello"
            true
        } ?: false

        executedStatementInsideSecondBlock.shouldBeTrue()
    }

}
