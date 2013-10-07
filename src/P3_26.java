import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 3:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class P3_26 {
    public static void main(String[] args) {

        //Prompt user for integer input of a number to find the roman numeral of.  Try/catch to make sure it is an int.
        int year = 0;

        try{
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the year, between 0 and 3999:");
        year = in.nextInt();
        }

        catch(InputMismatchException ex){
            System.out.println("Not a valid input.  Please run program again." );
            System.exit(1);
        }

        //Check to make sure 0 <= year < 4000.
        if (year < 0 || year > 3999){
            System.out.println("Not a valid input.");
            System.exit(1);
        }

        //Find the ones, tens, hundreds and thousands digits of the year.
        int ones = year % 10;
        int tens = ((year % 100) - ones)/10;
        int hundreds = ((year % 1000) - ones - tens)/100;
        int thousands = (year - ones - tens- hundreds)/1000;

        //Make four arrays of the Roman numerals for each digit in the ones, tens, hundreds, thousands.

        String[] onesRoman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        String[] tensRoman = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundredsRoman ={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousandsRoman = {"", "M", "MM", "MMM"};

        //Print the result by looking up the digit value in each array and concatenating them to form the roman numeral.

        System.out.println(thousandsRoman[thousands]+hundredsRoman[hundreds]+tensRoman[tens]+onesRoman[ones]);
    }

}
