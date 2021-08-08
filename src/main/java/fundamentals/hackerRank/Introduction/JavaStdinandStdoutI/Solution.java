package fundamentals.hackerRank.Introduction.JavaStdinandStdoutI;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextInt()){
            System.out.println(scanner.nextInt());
        }
    }
}
