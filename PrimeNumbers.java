package RonExercises;

import java.io.*;
import java.util.Random;

/**
 * Created by tomer on 11/28/2015.
 */
public class PrimeNumbers {

    public static void main(String[] args) throws IOException {
        //params
        String inputFile = "C:\\EnrichmentValidator\\inputNumbers.txt";
        String resultFile = "C:\\EnrichmentValidator\\resultNumbers.txt";

        // Create a file with random numbers
           generateInputFile(inputFile);

        // Get numbers from file and send to isPrime
           isPrimeNumberFeeder(inputFile, resultFile);

    }

    private static void generateInputFile(String inputFile) throws FileNotFoundException, UnsupportedEncodingException {

        int min = 0;
        int max = 100;

        PrintWriter writer = new PrintWriter(inputFile, "UTF-8");
        Random generator = new Random();

        for (int i = 0; i < 100 ; i++){
            int number = generator.nextInt((max - min) + 1) + min;
            writer.println(number);
        }
        writer.close();
    }

    private static void isPrimeNumberFeeder(String inputFile, String resultFile) throws IOException {

        PrintWriter writer = new PrintWriter(resultFile, "UTF-8");

        FileReader txtFile = new FileReader(inputFile);
        BufferedReader numbersFromFile = new BufferedReader(txtFile);

        int number = 0;
        String line;
        while ((line = numbersFromFile.readLine()) != null) {
            number = Integer.parseInt(line);
            boolean answer = isPrime(number);
            if (answer){
                writer.println("The number: " + number + " is " + answer + " = Prime Number");
            }else{
                writer.println("The number: " + number + " is " + answer + " = Is not a Prime Number");
            }
        }
        writer.close();
    }

    private static boolean isPrime(int n) {

        if (n <= 1){
            return false;
        }
        // double squareRoot = Math.sqrt(n);
           double squareRoot = findingSquareRoot(n);
       // for (int i = 2 ; i <= n / 2 ; i++){
          for (int i = 2 ; i <= squareRoot ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static double findingSquareRoot(int n) {
        double halfOfSquare;
        double squareRoot = n / 2;

        do {
            halfOfSquare = squareRoot;
            squareRoot = (halfOfSquare + (n / halfOfSquare)) / 2;
        }while ((halfOfSquare - squareRoot) != 0);
        return squareRoot;
    }
}
