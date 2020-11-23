package com.mycompany.app.collections.optionaltask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SelectDifferenceWords {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/englishtext.txt");

        Scanner scanner = new Scanner(file);

        Set<String> set = new HashSet<>();
        while (scanner.hasNext()) {
            Collections.addAll(set, scanner.nextLine().toLowerCase().split("[.,\" ]"));
        }
        System.out.println(set);
    }
}
