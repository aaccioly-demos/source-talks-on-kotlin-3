// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits

data class Person(val firstName: String, val lastName: String, var age: Int)

fun initials(firstName: String, lastName: String) =
    "${firstName.first()}.${lastName.first()}."
