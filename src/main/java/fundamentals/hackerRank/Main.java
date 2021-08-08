package fundamentals.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main<string1> {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
// Java Stdin and Stdout I
        /*        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

//Java If-Else
/*        int a = scanner.nextInt();
        if (a % 2 == 0 && a >= 6 && a <= 20) {
            System.out.println("Weird");
        } else if (a % 2 == 0 && a >= 2 && a <= 5|| a > 20&&a % 2 == 0) {
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }*/

//        Java Stdin and Stdout II
/*        int i = Integer.parseInt(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());
        String s = scanner.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/

        //    Java Output Formatting todo String format!1!
/*
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scanner.next();
            int x=scanner.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
*/
//Java Loops I todo BufferedReader
/*        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <=10 ; i++) {
            int result=i*N;
            System.out.println(String.format("%d x %d = %d",N,i,result));
        }
        bufferedReader.close();*/
//Java Loops II todo alghor
/*        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum=a;
            for (int j = 0; j <n ; j++) {
                sum=sum+b*(int)Math.pow(2,j);
                System.out.print(sum+" ");

            }
            System.out.println();
        }
        scanner.close();*/

//https://www.hackerrank.com/challenges/java-strings-introduction/problem
  /*      Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.compareTo(B));
        System.out.println(A.length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String s = A.substring(0, 1).toUpperCase() + A.substring(1);
        String s1 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(s+" "+s1);
        *//* Enter your code here. Print output to STDOUT. *//*

         */
//https://www.hackerrank.com/challenges/java-biginteger/problem Java BigInteger
/*        BigInteger bigInteger=scanner.nextBigInteger();
        BigInteger bigInteger1=scanner.nextBigInteger();
        System.out.println(bigInteger.add(bigInteger1));
        System.out.println(bigInteger.multiply(bigInteger1))*/

//https://www.hackerrank.com/challenges/java-1d-array-introduction/problem Java 1D Array
/*        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] += scan.nextInt();
        }


        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/

//https://www.hackerrank.com/challenges/java-list/problem  Java List
   /*     int N = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();


        for(Integer i:list){
            System.out.print(i+" ");
        }*/


List<Integer> list=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(0,i);
        }
list.add(0,0);
        System.out.println(Arrays.toString(list.toArray()));

    }
//https://www.hackerrank.com/challenges/java-interface/problemhttps://www.hackerrank.com/challenges/java-interface/problem
/*    public static int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }*/

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'


}

