package com.company.Problems;

public class ProjectEulerQuestions {

    private HelperMethods Hm;

    public ProjectEulerQuestions() {
        Hm = new HelperMethods();
    }

    public String projectEulerQ1() {
        int answer = 0;

        for (int i = 0; i < 1000; i++) {
            if(i % 3 == 0){
                answer += i;
            }
            else if(i % 5 == 0){
                answer += i;
            }
        }

        return Integer.toString(answer);
    }

    public String projectEulerQ2() {
        int answer = 0;
        int prev = 1;
        int current = 2;
        int t = 0;
        while (current < 4000000) {
            if (current % 2 == 0) {
                answer += current;
            }
            t = current + prev;
            prev = current;
            current = t;
        }


        return Integer.toString(answer);
    }

    public String projectEulerQ3() {
        //long int requires a suffix of L
        long answer = Hm.largestPrimeFactor(600851475143L);
        return Long.toString(answer);
    }

    public String projectEulerQ4() {
        int answer = 0;

        int greatest = 0;
        int product = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                if(Hm.isPalindrome(Integer.toString(product)) && product > greatest) {
                    greatest = product;
                }
            }
        }

        return Integer.toString(greatest);
    }

    public String projectEulerQ5() {

        //get dictionary of factors
        return  "";
    }

}
