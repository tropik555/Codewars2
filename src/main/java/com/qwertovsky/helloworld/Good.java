package com.qwertovsky.helloworld;

import java.io.InvalidClassException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Good {
    public static void main(String[] args) {
         ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("Test");
        wordList.add("Bee");
        wordList.add("Pig");
        wordList.add("Dog");
      Collections.sort(wordList);
        System.out.println(wordList);
    }
}

class Dog {

    private String name;
    private String poroda;
    private int age;
    public static int i;

    {
        name = "Шарик";
        poroda = "овчарка";
        age = 2;
        i = 6;
    }

    public Dog(String x, String y, int z) {
        name = x;
        poroda = y;
        age = z;
    }


    public Dog() {

    }

    public int p() {
        int sum = i;
        return sum;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", age=" + age +
                '}';
    }
}