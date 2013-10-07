import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 4:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class P3_18 {
    public static void main(String[] args) {

        //Prompt user for input of month and date.  Try/catch to check that they are integers.
        //Prompt user to enter a time.  Use a try/catch to handle non-integer inputs
        int month = 0;
        int date = 0;

        //try{
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a month (1-12):");
        month = in.nextInt();
        System.out.print("Please enter a date:");
        date = in.nextInt();
        //}

        //catch(){
        //    System.out.println("Not a valid input.  Please run program again." );
        //    System.exit(1);
        //}

        //Test to see if the month is valid (1-12) and if the date is valid within the month.
        if (month < 1 || month > 12 || date < 1 || date > 31 || (month == 2 && date > 29) ||
            (month == 4 && date > 30) || (month == 6 && date > 30) || (month == 9 && date > 30) ||
            (month == 11 && date > 30)){
            System.out.println("Not a valid day and month.  Please try again.");
            System.exit(1);
        }

        //Implementing the algorithm.  It seems like there are more efficient ways to do this, I'm not
        //sure how much latitude there is in how we translate the algorithm to the program.  In implementing the
        //algorithm I'm going to make an array [winter, spring, summer, fall, winter], calculate the value of the season
        // with no remainder using int division on (month -1.)  This will return a base value for what season the month
        // is in (excepting the special days that are >21 in %3 == 0 months.  An if statement will test for that case and
        //bump the season forward.  Also, that is why the seasons array has five entries, because there are four normal
        //cases and an extra case on the one end where it is bumped forward.


        String[] seasons = {"winter", "spring" , "summer" , "fall", "winter"};
        String final_season = "";

        if (date > 20 && month % 3 == 0){
            final_season = seasons[((month-1)/3) + 1];
        }

        else{
            final_season = seasons[(month-1)/3];
        }

        System.out.println("The season is " + final_season + ".");
    }
}
