package com.mycompany.app;

import java.util.Scanner;

public class FirstTaskHelloUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name= scan.nextLine();
        System.out.println("Hello " + name);
    }
}
