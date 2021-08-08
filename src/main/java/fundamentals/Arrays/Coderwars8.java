package fundamentals.Arrays;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Coderwars8 {


    //https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum = sum + arr1[i] + arr2[i];
        }
        return sum;
    }

    public static int arraySumStream(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }


    public static int[] reverseUsingString(int number) {
        String s = String.valueOf(number);
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(s.length() - i - 1) - 48;
        }
        return a;
    }


    public static int[] reverseUsingStream(int number) {
        return new StringBuilder(String.valueOf(number))
                .reverse()
                .chars().map(Character::getNumericValue)
                .toArray();
    }

    public static int[] reverseUsingMathLog(int number) {
        int length = (int) Math.log10(number) + 1;
        int[] array = new int[length];
        int i = 0;
        while (number > 0) {
            array[i++] = number % 10;
            number /= 10;
        }
        return array;
    }


    //Remove exclamation marks   https://www.codewars.com/kata/57a0885cbb9944e24c00008e/solutions/java
    static String removeExclamationMarks(String s) {
        int length = s.length();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '!')
                continue;
            stringBuilder.append(s.charAt(i));

        }

        return stringBuilder.toString();
    }

    static String removeExclamationMarks1(String s) {
        return s.replace("\\!", "");
    }

    static String removeExclamationMarks2(String s) {
        String s1 = "";
        char[] charsArray = s.toCharArray();
        for (char c : charsArray) {
            if (c != '!') {
                s1 += c;
            }
        }
        return s1;

    }

    static String removeExclamationMarks3(String s) {
        return (s == null) ? null : s.replace("!", "");
    }


    public static boolean isDigit(String s) {
        //return true or false
        try {
            Float a = Float.valueOf(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }

    public static boolean isDigitRegEx(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");

    }

    public static int between(int a, int b) {

        int length = 0;
        for (int i = a; i < b; i++) {
            length++;
        }

        return length;

    }

    // Hex to Decimal https://www.codewars.com/kata/57a4d500e298a7952100035d/train/java
    public static int hexToDec(final String hexString) {
        int i = Integer.parseInt(hexString, 16);
        // Your code here
        return i;
    }

    // Squash the bugs  https://www.codewars.com/kata/56f173a35b91399a05000cb7/solutions/java
    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

    //Total amount of points https://www.codewars.com/kata/5bb904724c47249b10000131/train/java
    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            int one = games[i].charAt(0);
            int second = games[i].charAt(games[i].length() - 1);
            if (one > second) {
                sum += 3;
            } else if (one == second) {
                sum += 1;
            } else {
                continue;
            }
        }

        return sum;
        //implement me
    }


    public static int points1(String[] games) {
        int sum = 0;

        for (String s : games) {
            char x = s.charAt(0),
                    y = s.charAt(2);

            sum += x > y ? 3 : x == y ? 1 : 0;
        }

        return sum;
    }

    public static int points2(String[] games) {
        return java.util.Arrays.stream(games).mapToInt(g ->
                g.charAt(0) > g.charAt(2) ? 3 :
                        g.charAt(0) < g.charAt(2) ? 0 : 1).sum();
    }

    //https://www.codewars.com/kata/57ec8bd8f670e9a47a000f89/train/java
    public static String mouthSize(String animal) {
        if (animal.equalsIgnoreCase("alligator")) {
            return "small";
        }
        return "wide";
    }

    // https://www.codewars.com/kata/596c6eb85b0f515834000049/train/java
    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }

    //  Square(n) Coderwars8 https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
    public static int squareSum(int[] n) {
        int sum = 0;
        for (int number : n) {
            sum += Math.pow(number, 2.0);
        }
        return sum;
    }

    // Compare within margin  https://www.codewars.com/kata/56453a12fcee9a6c4700009c/train/java
    public static int closeCompare(double a, double b, double margin) {
        if (Math.abs(a - b) <= margin) {
            return 0;
        }
        return a < b ? -1 : 1;
    }

    // Quarter of the year https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/train/java
    public static int quarterOf(int month) {
        int a = 0;
        if (month <= 3) {
            a = 1;
        } else if (month > 3 & month <= 6) {
            a = 2;
        } else if (month > 6 & month <= 9) {
            a = 3;

        } else if (month > 9 & month <= 12) {
            a = 4;
        }
        return a;
    }


    //Multiplication table for number https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
    public static String multiTable(int num) {
        String s = "%d * %d = %d";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            int a = i * num;
            if (i < 10) {
                stringBuilder.append(String.format(s, i, num, a) + "\n");
            } else {
                stringBuilder.append(String.format(s, i, num, a));
            }
        }
        return stringBuilder.toString();
    }

    //  Returning Strings https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java

    public static String greet(String name) {
        String s = "Hello, %s how are you doing today?";
        return String.format(s, name);
    }


    //Reversed Words https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java
    public static String reverseWords(String str) {
        String[] strings = str.split(" ");
        String reverse = "";
        for (int i = 0; i < strings.length; i++) {
            reverse += strings[strings.length - i - 1] + " ";
        }
        return reverse.trim();

    }

    //todo
    //Gravity Flip https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/java
    public static int[] flip(char dir, int[] arr) {
        if (dir == 'R') {
            Arrays.sort(arr);

        } else {
            int[] arrDesc = Arrays.stream(arr).boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(Integer::intValue)
                    .toArray();
            return arrDesc;
        }
        return arr;
    }


    public static int[] flip1(char dir, int[] arr) {
        int tmp = 0;

        if (dir == 'R') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] < arr[j - 1]) {
                        tmp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        } else if (dir == 'L') {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j] > arr[j - 1]) {
                        tmp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }
        return arr;
    }

    public static int[] flip2(char dir, int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];

        if (dir == 'R') {
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }

    //Will you make it? https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double leftKilometres = mpg * fuelLeft;
        if (distanceToPump > leftKilometres) {
            return false;
        } else {
            return true;
        }
    }

    //Area or Perimeter https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
    public static int areaOrPerimeter(int a, int b) {
        return a == b ? a * b : 2 * (a + b);
    }

    //Math todo  Keep Hydrated! https://www.codewars.com/kata/582cb0224e56e068d800003c/train/java
    public int Liters(double time) {
        return (int) Math.floor(time / 2);
    }


    //    Twice as old https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java  todo
    public static int TwiceAsOld(int dadYears, int sonYears) {
        return Math.abs(dadYears - 2 * sonYears);
    }

    //String repeat https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/java
    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for (int i = 0; i < repeat; i++) {
            s += string;
        }
        return s;
    }

    public static String repeatStrBuilder(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }

        return sb.toString();
    }

    // Return Negative https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java
    public static int makeNegative(final int x) {
        return x > 0 ? -x : x; // Your code here.
    }

    //Cat years, Dog years  todo https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] arr = {0, 0, 0};
        for (int i = 1; i <= humanYears; i++) {
            arr[0] += 1;
            if (arr[0] == 1) {
                arr[1] = arr[2] += 15;
            } else if (arr[0] == 2) {
                arr[1] = arr[2] += 9;
            } else if (arr[0] > 2) {


                arr[1] += 4;
                arr[2] += 5;

            }
        }
        return arr;

    }

    //Remove First and Last Character https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java
    public static String remove(String str) {
        char[] chars = str.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            s.append(chars[i]);
        }
        return s.toString();
    }

    //todo Find the first non-consecutive number  https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java
    static Integer find(final int[] array) {
        Integer nonConsecutive;
        for (int i = 0; i < array.length - 1; i++) {
            int difference = array[i + 1] - array[i];
            if (difference > 1) {
                nonConsecutive = array[i + 1];
                return nonConsecutive;
            }
        }
        return null;
    }

    //Powers of 2 todo https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java
    public static long[] powersOfTwo(int n) {
        long[] arrayOfPoweresOfTwo = new long[n + 1];

        for (int i = 0; i < arrayOfPoweresOfTwo.length; i++) {
            if (i == 0) {
                arrayOfPoweresOfTwo[0] += 1;
            } else {
                arrayOfPoweresOfTwo[i] += Math.pow(2, i);
            }
        }
        return arrayOfPoweresOfTwo;
    }

    //Opposites Attract todo https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 == 1 ^ flower2 % 2 == 1 ? true : false;

    }

    public static int[] take(int[] arr, int n) {
        int[] newArr = new int[n];
        System.arraycopy(arr, 0, newArr, 0, n);

        return newArr;
    }

    //Abbreviate a Two Word Name https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java
    public static String abbrevName(String name) {
        String[] s = name.split(" ");
        StringBuilder abr = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            char[] chars = s[i].toCharArray();
            abr.append(chars[0]).append(".");
        }
        return abr.substring(0, abr.length() - 1).toUpperCase();
    }

    // Calculate average https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java
    public static double find_average(int[] array) {
        OptionalDouble s = Arrays.stream(array).average();
        return s.getAsDouble();

    }

    //Holiday VIII - Duty Free https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java
    public static int dutyFree(int normPrice, int discount, int hol) {
        double holidayPrice = (normPrice * discount) / 100.0;
        double amount = hol / holidayPrice;

        return (int) amount;

    }

    //Transportation on vacation https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java
    public static int rentalCarCost(int d) {
        if (d < 3) {
            return d * 40;
        } else if (d >= 3 & d < 7) {
            return d * 40 - 20;
        } else {
            return d * 40 - 50;
        }
    }

    //DNA to RNA Conversion https://www.codewars.com/kata/5556282156230d0e5e000089/train/java
    public String dnaToRna(String dna) {
        return dna.replace('T', 'U');  // Do your magic!
    }

    //Will there be enough space? https://www.codewars.com/kata/5875b200d520904a04000003/train/java
    public static int enough(int cap, int on, int wait) {
        int sum = on + wait;
        int out = cap - sum;
        if (sum == cap || out > 0) {
            return 0;
        } else {
            return Math.abs(out);
        }
    }

    //My head is at the wrong end! https://www.codewars.com/kata/56f699cd9400f5b7d8000b55/train/java
    public static String[] fixTheMeerkat(String[] arr) {
        String[] strings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strings[i] = arr[arr.length - i - 1];
        }
        return strings;
    }

    public static String[] fixTheMeerkat1(String[] arr) {
        String[] copy = arr.clone();
        Collections.reverse(Arrays.asList(copy));
        return copy;
    }

    //todo A wolf in sheep's clothing https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java
    public static String warnTheSheep(String[] array) {
        int max = array.length;
        String s = "";
        if (array[array.length - 1] == "wolf") {
            s = "Pls go away and stop eating my sheep";
        } else {
            for (int i = 0; i < max; i++) {
                if (array[i] == "wolf") {
                    String one = "Oi! Sheep number ";
                    String two = one.concat(String.valueOf(max - i - 1));
                    s = two.concat("! You are about to be eaten by a wolf!");
                }
            }
        }
        return s;
    }

    // Find Maximum and Minimum Values of a List https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }


    public int min1(int[] list) {
        int min = list[0];
        for (int i = 1; i < list.length; i++) if (min > list[i]) min = list[i];
        return min;
    }

    public int max1(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) if (max < list[i]) max = list[i];
        return max;
    }

    // todo Remove String Spaces https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/java
    static String noSpace(final String x) {
        if (x == null) throw new NullPointerException("Seems, that argument of noSpase method is null");
        return x.replaceAll("\\s*", "");
    }

    static String noSpace1(final String x) {
        return Arrays.stream(x.split(" ")).filter(s -> !s.equals("")).collect(Collectors.joining());
    }

    //Convert a Number to a String! https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    public static String numberToString(int num) {
        return String.valueOf(num);
    }


    //Convert a Boolean to a String https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java
    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static String convert1(boolean b) {
        return Boolean.toString(b);
    }

    // get character from ASCII Value https://www.codewars.com/kata/55ad04714f0b468e8200001c/train/java
    public static char getChar(int c) {
        return (char) c;
    }


    public static char getChar1(int c) {
        String a = String.format("%c", c);
        return a.charAt(0);
    }

    //Grasshopper - Grade book https://www.codewars.com/kata/55cbd4ba903825f7970000f5/train/java
    public static char getGrade(int s1, int s2, int s3) {
        int avgScore = (s1 + s2 + s3) / 3;
        if (90 <= avgScore && avgScore <= 100) {
            return 'A';
        } else if (80 <= avgScore && avgScore < 90) {
            return 'B';
        } else if (70 <= avgScore && avgScore < 80) {
            return 'C';
        } else if (60 <= avgScore && avgScore < 70) {
            return 'D';
        } else {
            return 'F';
        }

    }


    public static char getGrade1(int s1, int s2, int s3) {
        s1 = (s1 + s2 + s3) / 3;
        return s1 >= 90 ? 'A' : s1 >= 80 ? 'B' : s1 >= 70 ? 'C' : s1 >= 60 ? 'D' : 'F';
    }

    public static char getGrade2(int s1, int s2, int s3) {
        int mean = (s1 + s2 + s3) / 3;
        if (mean >= 90) return 'A';
        if (mean >= 80) return 'B';
        if (mean >= 70) return 'C';
        if (mean >= 60) return 'D';
        return 'F';
    }

    //https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java Beginner Series #4 Cockroach
    public static int cockroachSpeed(double x) {
        return (int) Math.floor((x * 100000 / 3600));
    }

    //Find numbers which are divisible by given number https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] dividedByNumber = null;
        int arrLength = 0;
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arrLength++;
            }
        }

        dividedByNumber = new int[arrLength];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                dividedByNumber[c++] = numbers[i];
            }
        }
        return dividedByNumber;
    }

    public static int[] divisibleBy1(int[] numbers, int divider) {

        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }

    //todo 101 Dalmatians - squash the bugs, not the dogs! https://www.codewars.com/kata/56f6919a6b88de18ff000b36/train/java
    public static String howManyDalmatians(int number) {

        String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};

        String respond = number <= 10 ? dogs[0] : (number <= 50 ? dogs[1] : (number == 101 ? dogs[3] : dogs[2]));

        return respond;

    }

    static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";

        } else {
            return "Hello guest";
        }
    }

    public static int paperWork(int n, int m) {
        return n > 0 && m > 0 ? m * n : 0;
        //Happy Coding! ^_^
    }

    //Counting sheep... https://www.codewars.com/kata/54edbc7200b811e956000556/train/java
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        //Iterate through the Sheep array
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            //If not null and true, increment count
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i])
                count++;
        }
        return count;
    }

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }
        return arr;
    }

    //todo  Lario and Muigi Pipe Problem https://www.codewars.com/kata/56b29582461215098d00000f/solutions
    public static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int size = max - min + 1;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = i + min;
        }
        return result;
    }

    //todo Find the smallest integer in the array https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java Century From Year
    public static int century(int number) {
        if (number <= 100) {
            return 1;
        } else if (number % 100 == 0) {
            return number / 100;
        } else {
            return (number / 100) + 1;
        }
    }

    public static int century1(int year) {
        return (year + 99) / 100;
    }

    //https://www.codewars.com/kata/53ee5429ba190077850011d4/solutions/java
    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i << 1;
    }

    //todo Find the position! https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
    public static String position(char alphabet) {
        int position = alphabet - 96;
        return ("Position of alphabet: " + position);
    }

    //https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java Invert values
    public static int[] invert(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] += -array[i];
        }
        return arr;
    }

    public static int[] invert1(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }


    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0) {
            return (c + " is freezing temperature");
        } else {
            return (c + " is above freezing temperature");
        }
    }

    public static int convertToCelsius(int temperature) {
        int celsius = (int) ((temperature - 32.0) * (5.0 / 9.0));
        return celsius;
    }

    //Are You Playing Banjo? https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java
    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'r' || name.charAt(0) == 'R') {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }

    public static String areYouPlayingBanjo1(String name) {
        return String.format("%s %s banjo", name, playsBanjo(name) ? "plays" : "does not play");
    }

    private static boolean playsBanjo(String name) {
        return Character.toUpperCase(name.charAt(0)) == 'R';
    }

    //Is n divisible by x and y? https://www.codewars.com/kata/5545f109004975ea66000086/train/java
    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }

    //All Star Code Challenge #18 https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    public static int strCount1(String str, char letter) {
        int counter = 0;
        for (char character : str.toCharArray()) {
            if (letter == character) {
                counter++;
            }
        }
        return counter;
    }

    public static int strCount2(String str, char letter) {
        return Collections.frequency(Arrays.asList(str.split("")), "" + letter);
    }

    //Beginner Series #2 Clock https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a/train/java
    public static int Past(int h, int m, int s) {
        return (3600 * h + m * 60 + s) * 1000;
    }

    public static int Past1(int h, int m, int s) {
        return (int) Duration.ofHours(h).plusMinutes(m).plusSeconds(s).toMillis();
    }

    //Parse nice int from char problem https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1/train/java
    public static int howOld(final String herOld) {

        int old = herOld.charAt(0) - 48;
        return old;
    }


    //todo Expressions Matter https://www.codewars.com/kata/5ae62fcf252e66d44d00008e/train/java
    public static int expressionsMatter(int a, int b, int c) {
        int first = a * (b + c);
        int second = a * b * c;
        int third = a + b * c;
        int fourth = (a + b) * c;
        int fifth = (a + b) + c;

        int[] arr = {first, second, third, fourth, fifth};
        return Arrays.stream(arr).max().getAsInt();
    }

    //todo Convert to Binary https://www.codewars.com/kata/59fca81a5712f9fa4700159a/train/java
    public static int toBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return Integer.parseInt(bin);
    }

    public static int toBinary1(int n) {
        int multiplier = 1;
        int value = 0;

        do {
            value += (n % 2) * multiplier;
            n /= 2;
            multiplier *= 10;
        } while (n > 0);

        return value;
    }

    //https://www.codewars.com/kata/5601409514fc93442500010b/train/java How good are you really?
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        OptionalDouble avg = Arrays.stream(classPoints).average();
        return yourPoints > avg.getAsDouble() ? true : false;
    }

    public static boolean betterThanAverage1(int[] classPoints, int yourPoints) {
        return java.util.stream.IntStream.of(classPoints).average().getAsDouble() < yourPoints;
    }

    //Even or Odd https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/solutions/java
    public static String even_or_odd(int number) {
        return number % 2 == 0 ? "Even" : "Odd";
    }

    //todo
    public static int goals(int... array) {
        return Arrays.stream(array).sum();
    }

    //Volume of a Cuboid https://www.codewars.com/kata/58261acb22be6e2ed800003a/train/java
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        // Your code here
        return (length * height) * width;
    }

    //https://www.codewars.com/kata/5625618b1fe21ab49f00001f/solutions/java todo Grasshopper - Debug sayHello
    public static String sayHello(String name) {
        return String.format("Hello, %s", name);
    }


    //  todo https://www.codewars.com/kata/57036f007fd72e3b77000023/solutions/java

    //todo Count the Monkeys! https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java
    public static int[] monkeyCount(final int n) {
        int[] arr;
        arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = i + 1;
        }
        return arr;

    }

    public static int[] monkeyCount1(final int n) {
        int[] counts = new int[n];
        Arrays.setAll(counts, i -> i + 1);
        return counts;
    }

//Coderwars8 Arrays https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
    public static double sum(double[] numbers) {
        if (numbers == null) {
            return 0;
        } else {
            double sum = Arrays.stream(numbers).sum();
            return sum;

        }
    }

    public static double sum1(double[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, Double::sum);
    }




    public static void main(String[] args) {
        System.out.println(2001 % 100);
        System.out.println(3250 / 1.08 * 1000);
    /*    int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        System.out.println("arrayPlusArray " + arrayPlusArray(arr1, arr2));
        System.out.println("arraySumStream " + arraySumStream(arr1, arr2));
        System.out.println("array reverse " + Arrays.toString(reverseUsingString(132)));
        System.out.println("array reverse STREAM " + Arrays.toString(reverseUsingStream(132)));
        System.out.println("array reverse MathLong " + Arrays.toString(reverseUsingMathLog(132)));
        int i = 123;
        System.out.println(123 / 100 % 10);


        String s = "Hello World!!!!";
        //System.out.println(removeExclamationMarks(s));
        System.out.println((findLongest("Sausage chops")));
        System.out.println(replaceDots("one.two.three"));*/


    }

}

