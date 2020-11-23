package com.mycompany.app.fundamentals.maintask;

import java.util.Scanner;

public class FifthTaskMonths {
    public static void main(String[] args) {
        int monthNum=0;
        boolean flag=true;
        String nameOfMonth;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            System.out.println("Введите номер месяца");
            monthNum = scanner.nextInt();
            if (monthNum > 0 && monthNum <=12){
                flag = false;
            }else {
                System.out.println("Нет месяца с таким номером");
            }
        }
        switch (monthNum){
            case 1: nameOfMonth="Январь";
            break;
            case 2: nameOfMonth="Февраль";
            break;
            case 3: nameOfMonth="Март";
            break;
            case 4: nameOfMonth="Апрель";
            break;
            case 5: nameOfMonth="Май";
            break;
            case 6: nameOfMonth="Июнь";
            break;
            case 7: nameOfMonth="Июль";
            break;
            case 8: nameOfMonth="Август";
            break;
            case 9: nameOfMonth="Сентябрь";
            break;
            case 10: nameOfMonth="Октябрь";
            break;
            case 11: nameOfMonth="Ноябрь";
            break;
            case 12: nameOfMonth="Декабрь";
            break;
            default: nameOfMonth="Не верный номер месяца";
        }
        System.out.println(nameOfMonth);
    }
}

