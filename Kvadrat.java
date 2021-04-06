import java.util.Scanner;

public class Kvadrat {
/*
Skriv en metode, der som parameter modtager et heltal. Metoden skal udskrive et kvadrat på
skærmen svarende til heltallet. I det følgende eksempel er tallet 8 modtaget som parameter til metoden:
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
*  *  *  *  *  *
• Udvid metoden, så den også modtager et tegn, som er det tegn, som printes på skærmen
 */

    //Herunder bedes brugeren om to inputs, der bruges i metoden. Derefter kaldes metoden.
    public static void main(String[] args) {
        int number;
        char character;
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv et heltal:");
        number = sc.nextInt();
        System.out.println("Indtast et tegn:");
        character = sc.next().charAt(0);

        createSquare(number, character);
    }

    //Herunder er metoden. Et nested for-loop bruges til at lave et kvadrat med det indtastede antal tegn
    //på hvert led. Det yderste for-loop tæller rækker, det inderste tæller kolonner.
    public static void createSquare(int number, char character){
        int i;
        int j;
        for (i = 0; i < number; i++){
            for (j = 0; j < number; j++){
                System.out.print(character + "  ");
            }
            System.out.println("");
        }
    }

}
