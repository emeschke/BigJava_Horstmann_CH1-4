import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 2:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class P3_21 {
    public static void main(String[] args) {

        //As for a double input for earned income and read it in to variable income.
        //Use a try/catch to handle non-double inputs.

        double income = 0;

        //try{
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter income to calculate 1913 income tax:");
        income = in.nextDouble();
        //}

        //catch(){
        //    System.out.println("Not a valid input.  Please run program again." );
        //    System.exit(1);
        //}

        //Pass income to method that calculates the income tax.
        double tax = tax_calc(income);

        //Print the tax amount.
        System.out.println("Tax owed is $" + tax);
    }

    public static double tax_calc(double income){

        //Create an array with the tax brackets and a double tax which is the total tax owed.
        double[] brackets = {0, 50000, 75000, 100000, 250000, 500000};
        double tax = 0;

        //Write a loop to calculate the tax owed.  1% is owed on the max(income, 0).  An additional 1% is owed on
        //max(income-50000, 0), etc over all six value.
        for (int i = 0; i<6; i++){
            tax += .01*Math.max((income-brackets[i]) , 0);
        }
        return tax;
    }

}
