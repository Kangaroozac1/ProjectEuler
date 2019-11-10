package com.company.test;

import static org.junit.jupiter.api.Assertions.*;
import com.company.Problems.HelperMethods;

import java.util.HashMap;

class HelperMethodsTest {

    @org.junit.jupiter.api.Test
    void largestPrimeFactor() {
        HelperMethods Hm = new HelperMethods();
        assertEquals(5, Hm.largestPrimeFactor(75));
        assertEquals(6857, Hm.largestPrimeFactor(600851475143L));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        HelperMethods Hm = new HelperMethods();
        assertEquals(true, Hm.isPalindrome("906609"));
        assertEquals(true, Hm.isPalindrome("90609"));
    }

    @org.junit.jupiter.api.Test
    void dicPrimeFactor() {
        HelperMethods Hm = new HelperMethods();
        HashMap<Integer, Integer> factors = new HashMap<>();
        Hm.dicPrimeFactor(75, factors);
    }
}