package com.mycompany.app.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadFromFileAndSort {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/list.txt");
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()){
            list.add(scanner.nextLine());
        }

        Collections.sort(list);
    }
}
