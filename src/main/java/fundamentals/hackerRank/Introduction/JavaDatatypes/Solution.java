package fundamentals.hackerRank.Introduction.JavaDatatypes;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            try{
            long l = scanner.nextLong();
                System.out.println(String.format("%d can be fitted in:",l));

                if (l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            if (l >= Short.MIN_VALUE && l <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            if (l >= Integer.MIN_VALUE && l <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            if (l >= Long.MIN_VALUE && l <= Long.MAX_VALUE) {
                System.out.println("* long");
            }}catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}



