// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

package dev.accioly.kotlin.someinterestingbits;

public final class StringUtils {

    private StringUtils() {
        throw new UnsupportedOperationException(
                "This is a utility class and cannot be instantiated");
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    record FirstAndLast(char first, char last) {
    }

    public static FirstAndLast firstAndLast(String s) {
        return new FirstAndLast(
                s.charAt(0),
                s.charAt(s.length() - 1));
    }

/*    public void methodOneShouldntBeAllowedToCall() {
        System.out.println("This is a private method");
    }*/
}
