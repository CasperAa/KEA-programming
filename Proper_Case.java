import java.util.ArrayList;
import java.util.Scanner;

public class Proper_Case {
    /*
    Skriv en metode,der tager imod en sætning af ord med mellemrum imellem.
    Sætningen ændres efter følgende regler:
    • Ord,som udelukkende er skrevet med store bogstaver,skal ikke ændres.
    • Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
    • Ord på max.3 bogstaver skal skrives med småt.
     */
    public static void main(String[] args) {
        //Using the Scanner to ask the user for a sentence
        Scanner userSentence = new Scanner(System.in);
        System.out.println("Write a sentence, i will change it!");
        String sentenceToChange = userSentence.nextLine();

        //Calling the method with the user sentence
        System.out.println(sentenceChanger(sentenceToChange));

    }

        //Method that changes the sentence
    public static String sentenceChanger(String sentence) {
        //Arraylist to store the individual words in teh sentence
        ArrayList<String> sentenceDivider = new ArrayList<>();
        //Splitting the sentence with space
        String[] sentenceDivided = sentence.split(" ");

        //For loop for each word in the ArrayList
        for (String word : sentenceDivided) {
            //Checks if the is upper case only
            if (word.equals(word.toUpperCase())) {
                sentenceDivider.add(word);
            //Checks if the word is longer then 3 letters
            } else if (word.length() > 3) {
                String wordToChange = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                sentenceDivider.add(wordToChange);
            //the remaining words (less then 3 letter words)
            } else {
                String shortWord = word.toLowerCase();
                sentenceDivider.add(shortWord);
            }
        }
        //Combining the sentence with the updated words and returning it
        return String.join(" ",sentenceDivider);
    }
}
