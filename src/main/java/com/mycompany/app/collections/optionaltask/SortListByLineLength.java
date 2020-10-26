package com.mycompany.app.collections.optionaltask;

import java.util.*;

public class SortListByLineLength {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Жил да был");
        list.add("Крокодил.");
        list.add("Он по улицам ходил");
        list.add("Папиросы курил.");


        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(list);
    }
}
