package com.mycompany.app.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteToFileInReversOrder {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("list.txt");

        Scanner scanner = new Scanner(file);

        List <String> list = new ArrayList<>();

        while (scanner.hasNext()){
           list.add(scanner.nextLine());
        }

        scanner.close();

        System.out.println(list);

        for (int i = 0; i < list.size() / 2; i++) {
            String tempString = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, tempString );
        }

        System.out.println(list);

        PrintWriter printWriter = new PrintWriter(file);

        for (String s : list) {
            printWriter.println(s);
        }

        printWriter.close();
    }
}
