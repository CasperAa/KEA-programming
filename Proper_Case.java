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
        Scanner userSentence = new Scanner(System.in);
        System.out.println("Write a sentence, i will change it!");
        String sentenceToChange = userSentence.nextLine();
        System.out.println(sentenceChanger(sentenceToChange));

    }


    public static String sentenceChanger(String sentence) {
        ArrayList<String> sentenceDivider = new ArrayList<>();


        String[] sentenceDivided = sentence.split(" ");


        for (String word : sentenceDivided) {

            if (word.equals(word.toUpperCase())) {
                sentenceDivider.add(word);
            } else if (word.length() > 3) {
                String wordToChange = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                sentenceDivider.add(wordToChange);
            } else {
                String shortWord = word.toLowerCase();
                sentenceDivider.add(shortWord);
            }
        }
        return String.join(" ",sentenceDivider);
    }
}
