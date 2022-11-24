package com.sparta;

public class PalindromeChecker {

    public boolean palindromeChecker(String str) {
        str = str.replaceAll("\\s+", "");
        String lower = str.toLowerCase();
        String reversed = "";
        for (int i=lower.length()-1; i >= 0; i--) {
            reversed += lower.charAt(i);
        }
        if (lower.equals(reversed)) {
            System.out.println("Yes, this is a palindrome!");
            return true;

        }
        System.out.println("No, this is NOT a palindrome!");
        return false;

    }
}
