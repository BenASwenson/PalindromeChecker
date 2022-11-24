package com.sparta;

public class Main {
    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.palindromeChecker("Benjamin"));

        System.out.println(checker.palindromeChecker("Hanna       h"));
        PalindromeCheckerArrays arraysChecker = new PalindromeCheckerArrays();
        System.out.println(arraysChecker.palindromeCheckerArrays(new String[]{"Hannah",
                "Ben", "Charlie", "Ada", "Bob", "Simon"}));
    }
}