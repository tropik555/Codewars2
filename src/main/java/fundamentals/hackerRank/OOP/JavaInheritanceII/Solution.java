package fundamentals.hackerRank.OOP.JavaInheritanceII;

class Arithmetic {
    int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    Adder() {
    }

}

public class Solution {
    public static void main(String[] args) {
Adder a=new Adder();
        System.out.println("My superclass is: "+ a.getClass().getSuperclass().getSimpleName());

        System.out.print(a.add(10, 32) + " " + a.add(10, 3) + " " + a.add(10, 10) + "\n");

    }


}
