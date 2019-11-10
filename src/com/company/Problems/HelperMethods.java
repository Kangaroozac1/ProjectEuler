package com.company.Problems;

import java.util.*;

public class HelperMethods {

    public long largestPrimeFactor(long num) {
        long factor = 0;
        long factor2 = 0;
        for (int i = 2; i < num / 2; i++) {
            if(num % i != 0){
                continue;
            }

            factor = largestPrimeFactor(i);
            factor2 = largestPrimeFactor(num/i);

            if (factor > factor2) {
                return factor;
            }
            else {
                return factor2;
            }
        }
        return num;
    }

    public boolean isPalindrome(String palindrome) {
        int l = palindrome.length();
        for (int i = 0; i < l / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public HashMap<Integer, Integer> dicPrimeFactor(int num, HashMap factors) {

        for (int i = 2; i < num / 2; i++) {
            if(num % i != 0){
                continue;
            }

            factors = dicPrimeFactor(i, factors);

            factors = dicPrimeFactor(num/i, factors);


        }

        return factors;
    }

}
