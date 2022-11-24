package com.sparta;

import java.util.ArrayList;

public class PalindromeCheckerArrays {
    public ArrayList<String> palindromeCheckerArrays(String[] array) {
        ArrayList<String> palindromes = new ArrayList<String>();
        for (int i=0; i<array.length; i++) {
            PalindromeChecker checker = new PalindromeChecker();
            if(checker.palindromeChecker(array[i])) {
                palindromes.add(array[i]);
            }
        }
        return palindromes;
    }
}
