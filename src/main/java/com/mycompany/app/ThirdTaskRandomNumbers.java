package com.mycompany.app;

import java.util.Random;

public class ThirdTaskRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int quantity = 5;
        for (int i = 0; i < quantity; i++) {
            System.out.println(random.nextInt());
        }
        for (int i = 0; i < quantity; i++) {
            System.out.print(random.nextInt() + " ");
        }

    }
}
