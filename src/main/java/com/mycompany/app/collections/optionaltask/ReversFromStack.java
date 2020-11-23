package com.mycompany.app.collections.optionaltask;


import java.util.Stack;

public class ReversFromStack {
    public static void main(String[] args) {

        StringBuilder inputNumber = new StringBuilder("12345");

        System.out.println("Your number " + inputNumber);

        Stack <Character> stackPartOfInputNumber = new Stack<>();

        for (int i = 0; i < inputNumber.length(); i++) {
            stackPartOfInputNumber.push(inputNumber.charAt(i));
        }

        System.out.print ("Result ");
        while (!stackPartOfInputNumber.empty()){
            System.out.print(stackPartOfInputNumber.pop());
        }
    }
}