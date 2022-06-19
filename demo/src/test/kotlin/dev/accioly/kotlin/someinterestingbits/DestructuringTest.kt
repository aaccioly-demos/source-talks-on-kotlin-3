// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits

import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class DestructuringTest {

    @Test
    fun `returns first and last characters at once`() {
        val input = "behind the scenes"
        val (first, last) = input.firstAndLast()
        first shouldBe 'b'
        last shouldBe 's'
    }

    @Test
    fun `returns the same first and last characters for single letter string`() {
        val input = "a"
        val (first, last) = input.firstAndLast()
        first shouldBe 'a'
        last shouldBe 'a'
    }


    @Test
    fun `has nice syntax to retrieve only first letter`() {
        val input = "RIP"
        val (first, _) = input.firstAndLast()
        first shouldBe 'R'
    }


    @Test
    fun `destructuring is useful with lambdas`() {
        val mapOfNames = mapOf(
            "Michael" to "Jordan",
            "Franz" to "Ferdinand"
        )

        // Local function shadows initials in Person.kt
        fun initials(firstName: String, lastName: String) =
            // String interpolation
            "${firstName.first()}.${lastName.first()}"

        // Destructuring pairs into lambda parameters
        val names = mapOfNames.map { (fn, ln) -> initials(fn, ln) }

        names.shouldContainInOrder("M.J", "F.F")

    }
}
