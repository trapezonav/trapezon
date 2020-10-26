package com.mycompany.app.fundamentals.optionaltaskone;

import java.util.Arrays;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int maxLength=1;
        int minLength=Integer.MAX_VALUE;
        int tempLength = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число и нажмите Enter");
            numbers[i]=scanner.nextInt();
            tempLength=String.valueOf(numbers[i]).length();
            if (tempLength >= maxLength){
                max = numbers[i];
                maxLength = tempLength;
            }
            if (tempLength <=minLength){
                min=numbers[i];
                minLength=tempLength;
            }
        }
        System.out.println("Самое длинное число : " + max +" Его длинна: "+ maxLength + " Самое короткое число: " + min + " Его длинна " + minLength );

    }
}
