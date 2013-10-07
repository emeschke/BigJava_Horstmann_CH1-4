import com.sun.java_cup.internal.runtime.Scanner;

import java.util.InputMismatchException;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/7/13
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class P4_6 {
    public static void main(String[] args) {

        //Prompt the user to input a string of integers.
        System.out.println("Please enter a string of integers separated by spaces.");
        System.out.println("Enter a non-int to exit):");
        java.util.Scanner in = new java.util.Scanner(System.in);

        //Set boolean first to True.  Initialize other variables.
        Boolean first = Boolean.TRUE;
        int number = 0;
        int minimum = 0;

        //Use a try statement to accept inputs until a non-integer exception triggers the catch.
        //Within the try use the if statement to change first to False once a minimum is found.
        //After it is set to false, continue to check for a min.
        try{
            while (1 == 1 ) {
                number = in.nextInt();
                if(first == Boolean.TRUE){
                    minimum = number;
                    first = Boolean.FALSE;
                }

                else{
                    if( number < minimum){
                        minimum = number;
                    }
                }
            }
        }

        //Use the catch to kick out if there is a non-int input.  Check whether there is a minimum, indicated
        //by the first variable being reset to false.  If there is, print it, otherwise print that there was not min.

        catch(InputMismatchException ex){

            if (first == Boolean.TRUE){
                System.out.println("No minimum was found.");
            }

            else{
            System.out.println("Minimum is " + minimum + ".");
            }
        }
    }
}
