package com.mycompany.app;

public class FourthTaskSumOfArguments {
    public static void main(String[] args) {
        int sum=0;
        int result=1;
        for (int i = 0; i < args.length; i++) {
            sum +=Integer.parseInt(args[i]);
            result *=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(result);
    }
}
