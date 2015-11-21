package RonExercises;

/**
 * Created by tomer on 11/21/2015.
 */
public class FindMax {

    public static void main(String[] args) {

        //Define array of 10 numbers
        int myNumbers[] = new int[]{10, 20, 30, 40, 50, 45, 35, 25, 15, 5};

        //Assign the array element to a parameter
        int findMax = myNumbers[0];

        // Calling methods
        findMaxFor(findMax, myNumbers);
        findMaxWhile(findMax, myNumbers);

    }

    private static void findMaxFor(int findMax, int myNumbers[]) {
        // I am stating at 1 because findMax is already set to the first element
        for(int i = 1 ; i < myNumbers.length ; i++){
            if(myNumbers[i] > findMax){
                findMax = myNumbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + findMax + " --> Using For");
    }

    private static void findMaxWhile(int findMax, int myNumbers[]) {

        // I am stating at 1 because findMax is already set to the first element
        int counter = 1;
        while(counter < myNumbers.length) {
            if(myNumbers[counter] > findMax){
                findMax = myNumbers[counter];
            }
            counter++;
        }
        System.out.println("The largest number in the array is: " + findMax + " --> Using While");
    }
}
