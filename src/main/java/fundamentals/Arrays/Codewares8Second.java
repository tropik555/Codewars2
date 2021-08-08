package fundamentals.Arrays;

import java.math.BigDecimal;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Codewares8Second {

    //Regexp Basics - is it a digit?  https://www.codewars.com/kata/567bf4f7ee34510f69000032/train/java
    public static boolean isDigit(String s) {
        if (s.length() == 0) {
            return false;
        }
        String regex = "[\\d]{1}";
        return s.matches(regex);
    }

    public static boolean isDigit1(String s) {
        return s.matches("\\d");
    }

    public static boolean isDigit2(String s) {
        return s != null && s.length() == 1 && Character.isDigit(s.charAt(0));
    }

    // Area of a Square https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java todo math
    public static double squareArea(double A) {
        String s = String.format("%.2f", Math.pow((2 * A / Math.PI), 2));
        return Double.parseDouble(s);
    }

    public static boolean isDigit3(String s) {
        return Pattern.matches("[0-9]", s);
    }

    //Third Angle of a Triangle https://www.codewars.com/kata/5a023c426975981341000014/train/java todo math
    public static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 + angle2;
    }

    //https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java  Tip Calculator todo percent
    public static Integer calculateTip(double amount, String rating) {
        if (rating.equalsIgnoreCase("Poor")) {
            return (int) Math.ceil(((amount * 5) / 100));
        } else if (rating.equalsIgnoreCase("gs.Good")) {
            return (int) Math.ceil(((amount * 10) / 100));

        } else if (rating.equalsIgnoreCase("Great")) {
            return (int) Math.ceil(((amount * 15) / 100));

        } else if (rating.equalsIgnoreCase("Excellent")) {
            return (int) Math.ceil(((amount * 20) / 100));

        } else if (rating.equalsIgnoreCase("Terrible")) {
            return 0;

        } else {
            return null;
        }

    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    //A Needle in the Haystack https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java
    public static String findNeedle(Object[] haystack) {
        String s = "";
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == null) {
                continue;
            } else if (haystack[i].equals("needle")) {
                s = String.format("found the needle at position %d", i);
            }
        }
        return s;
    }

    public static String findNeedle1(Object[] haystack) {
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }

    //Surface Area and Volume of a Box https://www.codewars.com/kata/565f5825379664a26b00007c/train/java
    public static int[] getSize(int w, int h, int d) {
        int[] result = new int[2];
        result[1] = w * h * d;
        result[0] = (w * h) * 2 + (w * d) * 2 + (h * d) * 2;
        return result;
    }

    //Pythagorean Triple https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java todo math
    public int pythagoreanTriple(int[] triple) {
        int a = (int) Math.pow(triple[0], 2);
        int b = (int) Math.pow(triple[1], 2);
        int c = (int) Math.pow(triple[2], 2);

        if (a + b == c) {
            return 1;
        } else {
            return 0;
        }

    }

    public static int[] pythagoreanTriple1(int w, int h, int d) {
        return new int[]{2 * h * d + 2 * h * w + 2 * w * d, d * w * h};
    }

    //Welcome to the City  https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java
    public String sayHello(String[] name, String city, String state) {
        String str = "";
        for (int i = 0; i < name.length; i++) {
            str += name[i] + " ";
        }
        String s = String.format("Hello, %s! Welcome to %s, %s!", str.trim(), city, state);
        return s;
    }

    public String sayHello1(String[] name, String city, String state) {
        return String.format("Hello, %s! Welcome to %s, %s!", String.join(" ", name), city, state);
    }

    //https://www.codewars.com/kata/55d277882e139d0b6000005d/solutions/java avg
    public static int findAverage(int[] nums) {
        int avg = (int) Arrays.stream(nums).average().getAsDouble();
        return avg;
    }

    public static int findAverage1(int[] nums) {
        return IntStream.of(nums).sum() / nums.length;
    }

    //repeatIt  https://www.codewars.com/kata/557af9418895e44de7000053/train/java
    public static String repeatString(final Object toRepeat, final int n) {

        if (toRepeat instanceof String) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                stringBuilder.append(toRepeat);
            }
            return stringBuilder.toString();
        } else {
            return "Not a string";
        }
    }

    public static String repeatString1(final Object toRepeat, final int n) {
        if (!(toRepeat instanceof String)) {
            return "Not a string";
        }

        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> (String) toRepeat)
                .collect(Collectors.joining(""));
    }

    // https://www.codewars.com/kata/53f1015fa9fe02cbda00111a/solutions/java todo

    //https://www.codewars.com/kata/56d49587df52101de70011e4/solutions/java oskar
    public static String leo(final int oscar) {
        String s;
        switch (oscar) {
            case 88:
                s = "Leo finally won the oscar! Leo is happy";
                break;
            case 86:
                s = "Not even for Wolf of wallstreet?!";
                break;
            default:
                s = oscar < 88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
        }
        return s;
    }

    // https://www.codewars.com/kata/555a67db74814aa4ee0001b5/solutions/java u
//Is it even?
    public boolean isEven(double n) {
        return n % 2 == 0 ? true : false;
    }


    //Unfinished Loop - Bug Fixing #1 https://www.codewars.com/kata/55c28f7304e3eaebef0000da/solutions/java
    public static List CreateList(int number) {
        List list = new ArrayList();

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }

    //https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java L1: Set Alarm
    public static boolean setAlarm(boolean employed, boolean vacation) {
        return employed == true && vacation == false;
    }


    public static float mpgToKPM(final float mpg) {
        return BigDecimal.valueOf(mpg * 1.609344f / 4.54609188f).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    //https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java Miles per gallon to kilometers per liter todo
    public static float mpgToKPM1(final float mpg) {
        float GALLON_TO_LITRE = 4.54609188f;
        float MILE_TO_KILOMETER = 1.609344f;

        return (float) Math.round(mpg * MILE_TO_KILOMETER / GALLON_TO_LITRE * 100) / 100;
    }

    //https://www.codewars.com/kata/58649884a1659ed6cb000072/solutions/java
    public static String updateLight(String current) {

        return current.equals("red") ? "green" : current.equals("green") ? "yellow" : "red";
    }

    // Sort and Star https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java todo join
    public static String twoSort(String[] s) {
        java.util.Arrays.sort(s);
        return String.join("***", s[0].split(""));
    }

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        add(list);
        System.out.println(list);

        int i=10;
        addInt(i);
        System.out.println(i);
    }

    public static void add(List list) {
        list=new ArrayList();
        list.add(1);
    }

    public static void addInt(int a) {
        a+=3;
    }

}


class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
