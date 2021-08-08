package fundamentals.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Basic1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(3, 3) + " a");

        Function<Integer, Integer> pow1 = x -> (int) Math.pow(x, 2);
        System.out.println(pow1.apply(6));

        Function<Integer, Integer> multiplication = x -> x * x;
        System.out.println(multiplication.apply(10));

        Function<Integer, Integer> adder = x -> {
            x += 10;
            x += 100;
            return x;
        };

        System.out.println(adder.apply(0));


        Calcualtor calcualtor = new Calcualtor();

        BiFunction<Double, Double, Double> sums = calcualtor::add;
        System.out.println(sums.apply(6.0, 6.0));

        BiFunction<Integer, Integer, Double> mult = calcualtor::mult;
        System.out.println(mult.apply(6, 6));

        BiFunction<Double, Double, Double> pow = Math::pow;
        System.out.println(pow.apply(22.0, 4.0));


        //------------------------Supplier

        Supplier<String> generator = () -> new String("ml;fk;");
        System.out.println(generator.get());


        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        //------------------------Stream
        BiFunction<Integer, Integer, Integer> summ = (a, b) -> Math.toIntExact(LongStream.rangeClosed(a, b).reduce(10, Math::subtractExact));
        System.out.println("fds " + summ.apply(1, 3));

        Function<List<String>, List<String>> distinct = (List<String> list) -> list.stream().distinct().collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("scala");
        list.add("java");
        list.add("scala");
        System.out.println(distinct.apply(list));

        int a = 1;
        int b = 2;
        int c = 3;
        Function<Integer, Integer> equation = x -> a * (int) Math.pow(x, 2) + b * x + c;
        System.out.println(equation.apply(2));


        String prefix = "prefix";
        String suffix = "suffix";

        Function<String, String> trim = x -> suffix + x.trim() + prefix;
        System.out.println(trim.apply("    STRING           "));
    }


}


class Calcualtor {
    public <T extends Number> double add(T one, T two) {
        return one.doubleValue() + two.doubleValue();
    }

    public <T extends Number> double mult(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
}

