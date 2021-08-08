package fundamentals.hackerRank.BigNumber.BigDecimal;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import java.math.BigDecimal;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }

                BigDecimal bigDecimal=new BigDecimal(o1);
                BigDecimal bigDecimal1=new BigDecimal(o2);
                return bigDecimal1.compareTo(bigDecimal);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
