package com.sparta.test;

import com.sparta.PalindromeChecker;
import com.sparta.PalindromeCheckerArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTests {
    @Test
    @DisplayName("Given String input Hannah Returns true")
    public void palindromeCheckerWithInputHannahReturnsTrue() {
        PalindromeChecker checker = new PalindromeChecker();
        boolean actual = checker.palindromeChecker("Hannah");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Given String input 'Hann ah' Returns true")
    public void palindromeCheckerWithInputHannahWithSpaceReturnsTrue() {
        PalindromeChecker checker = new PalindromeChecker();
        boolean actual = checker.palindromeChecker("Hann ah");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Given String input Benjamin Returns false")
    public void palindromeCheckerWithInputBenjaminReturnsFalse() {
        PalindromeChecker checker = new PalindromeChecker();
        boolean expected = false;
        boolean actual = checker.palindromeChecker("Benjamin");
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Given String array input with Hannah, Ben, Charlie, Ada, Bob, Simon Returns Hannah, Ada, Bob")
    public void pallindromeCheckerArraysWithInputHannahBenCharlieAdaBobSimonReturnsHannaAdaBob() {
        PalindromeCheckerArrays checkerArrays = new PalindromeCheckerArrays();
        String[] array = {"Hannah", "Ben", "Charlie", "Ada", "Bob", "Simon"};
        String[] expected = {"Hannah", "Ada", "Bob"};
        String[] actual = checkerArrays.palindromeCheckerArrays(array).toArray(new String[0]);
        assertArrayEquals(expected, actual);
    }
}
