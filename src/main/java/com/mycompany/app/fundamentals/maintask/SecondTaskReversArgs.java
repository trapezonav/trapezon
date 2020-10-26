package com.mycompany.app.fundamentals.maintask;

import java.util.Arrays;

public class SecondTaskReversArgs {
    public static void main(String[] args) {
        String temp;
        for (int i = 0; i < args.length/2; i++) {
            temp=args[args.length-i-1];
            args[args.length-i-1]=args[i];
            args[i]=temp;
        }
        for (String a:args) {
            System.out.print(a + " ");
        }
    }
}
