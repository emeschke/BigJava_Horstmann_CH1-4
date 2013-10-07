import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/7/13
 * Time: 7:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class P4_11 {
    public static void main(String[] args) {

        //Prompt the user to enter a word.
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a some words to determine how many syllables:");
        String words = in.nextLine();

        //Split the line into different words.
        String[] new_words = words.split(" ");

        //Use nested for loops to check the number of syllables in each word.  First loop over the word, then loop over
        //the characters in each word.  In checking each word, also keep track of the previous letter.  Add one to the
        //syllable if there is a vowel, unless the previous was a vowel.  If it is a vowel, set the previous variable to
        //one and if it is a consonant, set it back to zero.

        for (int i = 0; i < new_words.length; i++)
        {
            int syllables = 0;
            int previous = 0;
            for (int j = 0; j < new_words[i].length(); j++){
                if (new_words[i].substring(j,j+1).toLowerCase().equals("a") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("e") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("i") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("o") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("u") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("y")){
                        if(previous == 0){
                            syllables += 1;
                        }
                previous = 1;
                }
                else {
                    previous = 0;
                }
            }

            //If the last letter in the word is equal to e, then subtract one from the syllable count because an
            //extra syllable was counted.
            if (new_words[i].substring(new_words[i].length()-1, new_words[i].length()).toLowerCase().equals("e")){
                syllables -=1;
            }

            //If syllables is equal to zero, change it to one.  Check after
            if (syllables == 0){
                syllables = 1;
            }

            //Print the word and the syllable count for that word.
            System.out.println(new_words[i] + " " + syllables + " syllables.");
        }
    }
}
