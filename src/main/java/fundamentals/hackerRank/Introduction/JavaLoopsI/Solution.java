package fundamentals.hackerRank.Introduction.JavaLoopsI;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        IntStream.rangeClosed(1,10).mapToObj(i->
                String.format("%d x %d = %d",n,i,n*i))
                .forEach(System.out::println);
        s.close();
    }
}
