import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 3:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class P4_18 {
    public static void main(String[] args) {

        //Prompt user to enter an integer input to find primes below.  Use a try/catch to handle non-integer inputs
        int number = 0;

        try{
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number:");
        number = in.nextInt();
        }

        catch(InputMismatchException ex){
            System.out.println("Not a valid input.  Please run program again." );
            System.exit(1);
        }

        int [] primes = prime_calc(number);
        for (int i = 0; i < primes.length; i++){
            if (primes[i] != 0){
                System.out.println(primes[i]);
            }
        }

    }


        public static int[] prime_calc(int input){

            //Method to calculate all primes below the input using Sieve of Ari... a greek guy.  Start by initializing
            //an array to input - 1 with the values 1 , 2, 3...  Iterate through the array setting the value of all
            //multiples equal to zero.  Return that array.

            //Initialize an array from 0...input-1.
            int[] numbers = new int[input + 1];

            //If input < 2, return empty array.  By definition;
            if (input < 2){
                int[] none = {};
                return none;
            }
            //Initialize an array from 0 to (input - 1) of integer values.
            for (int i = 0; i < input; i++){
                numbers[i] = i;
            }

            //Double loop--outer is through the positions in the array (to input/2 + 1), inner loop sets the multiples
            // to zero.  Inner loop only runs if the initial value is not already 0.  Also first set numbers[1] =0
            // because by definition it is not a prime.
            numbers[1] = 0;
            for (int i = 2; i < (input/2 + 1); i++){
                if (numbers[i] != 0){
                    for (int j = 2; j <= input/i; j++){
                        numbers[i*j] = 0;
                    }
                }
            }
            return numbers;
        }
}