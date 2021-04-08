import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListOpgave {
    /*
    ArrayList
Skriv en metode med navnet doesArraylistContainString, der modtager 2 parametrer: en arrayliste og en streng.
Metoden returnerer en boolean:
• Hvis strengen ikke findes i arraylisten indsættes strengen i listen og metoden returnerer false
• Hvis strengen findes i arraylisten returnerer metoden true og printer ”The String has been found”
     */


    public static boolean doesArraylistContainString(ArrayList arrayList, String string){

        if (arrayList.contains(string.toLowerCase())) {
            System.out.println("The String has been found");
            return true;
        }
        else if (arrayList.contains(string.toLowerCase()) == false) {
            arrayList.add(string);
            return false;
        }
        else {
            System.out.println("Something went wrong");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> indkøbsliste = new ArrayList<String>();
        indkøbsliste.add("Æg".toLowerCase());
        indkøbsliste.add("smør".toLowerCase());
        indkøbsliste.add("avocado".toLowerCase());
        indkøbsliste.add("Kommen".toLowerCase());

        System.out.println("Hvilken streng vil du søge efter?");
        String input = sc.nextLine();
        doesArraylistContainString(indkøbsliste, input);
    }
}
