import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 2:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class P3_16 {
    public static void main(String[] args) {

        //Prompt the user to enter three strings and store them in an array.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter three strings to sort:");
        String[] text = new String[3];
        text[0] = in.next();
        text[1] = in.next();
        text[2] = in.next();

        //Sort the array.  Using this sort method capital letter are sorted before lower case.  The assignment is vague
        //about what to do so I left it as is.  It would not be a difficult fix, you could make them all lower case and
        //then sort and print using the toLowerCase() method.
        Arrays.sort(text);

        //Print the array.
        for(int i = 0; i<3; i++){
            System.out.println(text[i]);
        }
    }
}
