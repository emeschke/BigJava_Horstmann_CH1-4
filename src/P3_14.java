import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/5/13
 * Time: 1:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class P3_14 {
    public static void main(String[] args) {

        //Prompt user to input a card; read it in as a string.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a card to identify (ex: QS for Queen of Spades):");
        String rawCard = in.next();

        //Check that the string entered is of length 2; if not exit the program.
        if (rawCard.length() != 2){
            System.out.println("Not a valid card.  Please run program again.");
            System.exit(1);
        }

        //Split the string into a card value and a suit.
        String cardValue = rawCard.substring(0,1).toUpperCase();
        String cardSuit = rawCard.substring(1,2).toUpperCase();

        //Make arrays of the form [input values, output values]
        String[] values = {"A" , "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
                           "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                           "Ten", "Jack", "Queen", "King"};
        String[] suits = {"C", "D", "H", "S", "Clubs", "Diamonds", "Hearts", "Spades"};

        //Loop through each array to check if the cardValue and cardSuit are members.  If they are, record
        //the position, if not exit the program with an error message.
        int valuePos = -1;
        int suitPos = -1;

        for(int i = 0; i< values.length; i++){
            if (values[i].equals(cardValue)){
                valuePos = i;
                break;
            }
        }

        for(int i = 0; i< suits.length; i++){
            if (suits[i].equals(cardSuit)){
                suitPos = i;
                break;
            }
        }

        //If either postion is -1, the card is not valid.  If statement to test, otherwise print the result, shifting
        //over by 13 for the value and 4 for the suit to lookup up the English word instead of the abbreviation.

        if(valuePos == -1 || suitPos == -1){
            System.out.println("Not a valid card input.");
            System.exit(1);
        }

        else{
            System.out.println("The card is the " + values[valuePos + 13] + " of " + suits[suitPos + 4] + ".");
        }
    }
}
