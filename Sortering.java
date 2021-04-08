import java.util.Scanner;
public class Sortering {

    /*
    Sortering
    Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i
    alfabetisk faldende orden på skærmen.
    Hvis der indlæses:
    abekat
    musefælde
    ananas
    slut
    solskin
    skal der udskrives følgende på skærmen:
    solskin
    slut
    musefælde
    ananas
    abekat
     */

    public static void main(String[] args) {
        int count =5;
        String words[] = new String[count];
        Scanner sc = new Scanner(System.in);

        //Ordene indtastes og føjes til arrayet
        System.out.println("Indtast fem ord - ét ad gangen:");
        for(int i = 0; i < count; i++)
        {
            words[i] = sc.nextLine();
        }

        //Ordene sorteres vha. et nested for-loop
        String temp;
        for (int i = count-1; i >= 0; i--)
        {
            for (int j = i - 1; j >= 0; j--) {
                //Hvis j kommer alfabetisk før i, kører nedenstående:
                if (words[i].compareTo(words[j])>0)
                {
                    //Herunder bytter de to ord plads
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        //Ordene er sorteret i omvendt alfabetisk rækkefølge, og nu printes de
        System.out.print("Ordene i omvendt alfabetisk rækkefølge:\n");
        for (int i = 0; i <= count - 1; i++)
        {
            System.out.println(words[i]);
        }
        String et = "Amanda";
        String to = "Brian";

    }




}
