// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

@file:JvmName("KotlinStringUtils")

package dev.accioly.kotlin.someinterestingbits

// Top-level
/*fun isPalindrome(string: String): Boolean {
    return string == string.reversed()
}*/

// Expression
/*
fun isPalindrome(string: String): Boolean =
    string == string.reversed()
*/

// Type inference
/*fun isPalindrome(string: String) =
    string == string.reversed()*/

// Extension function
fun String.isPalindrome() =
    this == this.reversed()

/*data class FirstAndLast(val first: Char, val last: Char)

fun String.firstAndLast(): FirstAndLast =
    FirstAndLast(first(), last())*/

fun String.firstAndLast(): Pair<Char, Char> =
    first() to last()
