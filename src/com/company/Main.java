package com.company;

import com.company.Problems.ProjectEulerQuestions;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Project Euler\n");

        if (args.length == 0) {
            System.out.println("No question number input");
            questions(3);
        } else {
            questions(Integer.parseInt(args[0]));
        }


    }

    private static void answer(String qAnswer, int questionId) {
        if (questionId == 0 || qAnswer.equals("")) {
            System.out.println("No question was selected or no answer given");
        }
        System.out.println("The answer to question " + questionId + ": " + qAnswer);
    }

    private static void questions(int questionId) {
        String pAnswer;
        ProjectEulerQuestions solution = new ProjectEulerQuestions();

        switch (questionId) {
            case 1:
                pAnswer = solution.projectEulerQ1();
                break;
            case 2:
                pAnswer = solution.projectEulerQ2();
                break;
            case 3:
                pAnswer = solution.projectEulerQ3();
                break;
            case 4:
                pAnswer = solution.projectEulerQ4();
                break;
            case 5:
                pAnswer = solution.projectEulerQ5();
                break;
            default:
                pAnswer = "";
                questionId = 0;
                break;
        }

        answer(pAnswer, questionId);
    }
}
