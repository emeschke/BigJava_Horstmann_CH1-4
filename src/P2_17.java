import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 1:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class P2_17 {
    public static void main(String[] args) {

        //Prompt user to enter a time.  Use a try/catch to handle non-integer inputs
        int firstTime = 0;
        int secondTime = 0;

        //try{
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the first time (ex: 1500):");
        firstTime = in.nextInt();
        System.out.print("Please enter the second time:");
        secondTime = in.nextInt();
        //}

        //catch(){
        //    System.out.println("Not a valid input.  Please run program again." );
        //    System.exit(1);
        //}

        //Find the value of the hours and minutes in each time.
        int minutesFirst = firstTime % 100;
        int minutesSecond = secondTime % 100;
        int hoursFirst = (firstTime - minutesFirst)/100;
        int hoursSecond = (secondTime - minutesSecond)/100;

        //If statement to check that times are valid (0 <=hours < 24) and minutes (0 <= minutes < 60)
        if (hoursFirst < 0 || hoursFirst > 23 || hoursSecond < 0 || hoursSecond >23 ||
            minutesFirst < 0 || minutesFirst > 59 || minutesSecond < 0 || minutesSecond >59){

            System.out.println("Not a valid input.  Please run program again.");
            System.exit(1);
        }

        //If/else statement to print the difference in hours and minutes.
        if (secondTime > firstTime){
            System.out.println("Time difference is " + (hoursSecond - hoursFirst) + " hours and " +
                               (minutesSecond - minutesFirst) + " minutes.");
        }

        else{
            System.out.println("Time difference is " + (hoursFirst - hoursSecond) + " hours and " +
                               (minutesFirst - minutesSecond) + " minutes.");
        }
    }

}
