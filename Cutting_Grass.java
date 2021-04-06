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
        int currentGrassLength;
        int maxGrassLength;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your current grass length?");
        currentGrassLength = userInput.nextInt();
        System.out.println("What is the max length of the grass");
        maxGrassLength = userInput.nextInt();

        double currentGrassLengthDouble = currentGrassLength;

        System.out.println("You need to cut your grass within: " + whenShouldICutMyGrass(currentGrassLengthDouble, maxGrassLength) + " days");

    }


    public static int whenShouldICutMyGrass(double currentGrassLengthDouble, int maxGrassLength ){
        int daysToGrassCutting = 0;
        final double grassGrowth = 0.8;
        while ( currentGrassLengthDouble <= maxGrassLength){
            currentGrassLengthDouble = grassGrowth + currentGrassLengthDouble;
            daysToGrassCutting++;
        }

        return daysToGrassCutting;
    }
}
