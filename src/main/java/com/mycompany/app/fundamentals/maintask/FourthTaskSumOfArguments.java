package com.mycompany.app.fundamentals.maintask;

public class FourthTaskSumOfArguments {
    public static void main(String[] args) {
        int sum=0;
        int result=1;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            result *= Integer.parseInt(arg);
        }
        System.out.println(sum);
        System.out.println(result);
    }
}