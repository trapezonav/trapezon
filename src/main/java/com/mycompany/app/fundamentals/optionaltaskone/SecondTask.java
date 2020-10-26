package com.mycompany.app.fundamentals.optionaltaskone;

import java.util.Arrays;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличесто чисел");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число и нажмите ENTER");
            numbers[i] = scanner.nextInt();
        }
        for (int i = numbers.length-1; i > 0  ; i--) {
            for (int j = 0; j < i; j++) {
                int temp;
                if (String.valueOf(numbers[j]).length() > String.valueOf(numbers[j+1]).length()){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
