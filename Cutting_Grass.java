import java.util.Scanner;

public class Cutting_Grass {
    public static void main(String[] args) {
        /*Om sommeren vokser græsset ca. 0,8 cm om dagen. Skriv en metode,der tager imod 2 inputparametre:
        hvor langt græsset er lige nu og hvor højt det må være for at skulle slås.
        Metoden skal beregne og returnere hvor mange dage der er til,at græsset skal slås næste gang.

        Hvor højt græsset er, når det skal slås,kan forstås på 2 måder.
        1.Græsset skal overstige denne værdi,før vi starter græsslåmaskine
        2.Græsset skal slås,inden værdien overstiges

        Du vælger selv hvilken løsning du vil implementere.
        Benyt en Scanner til at få input fra brugeren, og udskriv resultatet på skærmen.
         */
        //The two parameters which is used in the method
        int currentGrassLength;
        int maxGrassLength;
        //Scanner to get values to the grass parameters
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your current grass length in cm?");
        currentGrassLength = userInput.nextInt();
        System.out.println("What is the max length of the grass in cm?");
        maxGrassLength = userInput.nextInt();

        //Type casting the integer from the user to a double
        double currentGrassLengthDouble = currentGrassLength;

        //Printing the answer to the user
        System.out.println("You need to cut your grass within: " + whenShouldICutMyGrass(currentGrassLengthDouble, maxGrassLength) + " days");

    }

    //Method calculating the days before the current grass length exceeds the max length
    public static int whenShouldICutMyGrass(double currentGrassLengthDouble, int maxGrassLength ){
        int daysToGrassCutting = 0;
        final double grassGrowth = 0.8;
        while ( currentGrassLengthDouble <= maxGrassLength){
            currentGrassLengthDouble += grassGrowth;
            daysToGrassCutting++;
        }

        return daysToGrassCutting;
    }
}

