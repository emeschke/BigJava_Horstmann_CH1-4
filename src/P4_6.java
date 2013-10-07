import com.sun.java_cup.internal.runtime.Scanner;

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

        Boolean first = Boolean.TRUE;
        int number = 0;
        int minimum = 0;


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
            System.out.println("Minimum is " + minimum + ".");

        }
    }
}
