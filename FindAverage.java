package RonExercises;

/**
 * Created by tomer on 11/23/2015.
 */
public class FindAverage {

    public static void main(String[] args) {

        //Define array of 10 numbers
        int myNumbers[] = new int[]{10, 20, 30, 40, 50, 45, 35, 25, 15, 5};

        // Calling methods
       double findAverageFor = findAverageFor(myNumbers);
       double findAverageWhile = findAverageWhile(myNumbers);

        // Printing the results
        System.out.println("The array sums to an Average of: " + findAverageFor + "--> For");
        System.out.println("The array sums to an Average of: " + findAverageWhile + "--> For");
    }

    private static double findAverageFor(int[] myNumbers) {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < myNumbers.length ; i++) {
            sum = sum + myNumbers[i];
            average = sum / (myNumbers.length);
        }
        return average;
    }

    public static double findAverageWhile(int myNumbers[]) {
        int counter = 0;
        double sum = 0;
        double average = 0;

        while(counter < myNumbers.length) {
            sum = sum + myNumbers[counter];
            average = sum / (myNumbers.length);
            counter++;
        }
        return average;
    }
}
