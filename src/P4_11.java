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
        //the characters in each word.  In checking each word,

        for (int i = 0; i < new_words.length; i++)
        {
            int syllables = 0;
            for (int j = 0; j < new_words[i].length(); j++){
                if (new_words[i].substring(j,j+1).toLowerCase().equals("a") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("e") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("i") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("o") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("u") ||
                    new_words[i].substring(j,j+1).toLowerCase().equals("y")){
                    syllables += 1;
                }
            }
                if (syllables == 0){
                    syllables = 1;
                }
                if (new_words[i].substring(new_words[i].length()-1, new_words[i].length()).toLowerCase().equals("e")){
                    syllables -=1;
                }

                System.out.println(new_words[i] + " " + syllables + " syllables.");

    }
}
}