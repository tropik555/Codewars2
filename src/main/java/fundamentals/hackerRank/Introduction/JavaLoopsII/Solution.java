package fundamentals.hackerRank.Introduction.JavaLoopsII;

import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int calc = 0;
            for (int j = 0; j < n; j++) {
                calc += Math.pow(2, j) * b;
                System.out.println(calc+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
