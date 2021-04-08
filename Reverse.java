import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        //
        String string[] = new String[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 words one by one");
        for (int i = 0; i < 5; i++) {
            string[i] = scan.nextLine();

        }
        

        String string2;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (string[j].compareTo(string[i]) > 0) {
                    string2 = string[j];
                    string[j] = string[i];
                    string[i] = string2;
                }

            }
        }
        System.out.println("The words in reverse alphabetical order are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(string[i]);
        }
    }
}

