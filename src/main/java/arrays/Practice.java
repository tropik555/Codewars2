package arrays;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Practice {
    public static void main(String[] args) {


      /*  int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+",");
            }
            System.out.println();
        }*/

        System.out.println(next(546544545));
    }

    public static String next(Integer caseSerial){
        DecimalFormatSymbols unusualSymbols=new DecimalFormatSymbols();
        unusualSymbols.setGroupingSeparator('-');
        DecimalFormat decimalFormat=new DecimalFormat("0000,0000",unusualSymbols);
        String eqightDigitNumber=decimalFormat.format(caseSerial);

        String twoDigitYear= Year.now().format(DateTimeFormatter.ofPattern("uu"));
        return String.format("CN-%s-%s",twoDigitYear,eqightDigitNumber);
    }

}
