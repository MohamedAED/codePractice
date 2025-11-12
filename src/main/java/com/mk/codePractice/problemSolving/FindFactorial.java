package com.mk.codePractice.problemSolving;

public class FindFactorial {

    public static void main(String[] args) {
        int num = 10;
        long factorialResult = 1L;
        for(int i = 1; i <= num; ++i)
            factorialResult *= i;
        System.out.println("Factorial: "+factorialResult);
    }

}
