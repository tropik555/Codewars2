package com.qwertovsky.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        for(Integer i:list){
            System.out.println(i);
        }

        System.out.println(list.set(0,4));
        System.out.println(list.remove(4));
        System.out.println(list);
    }
}
