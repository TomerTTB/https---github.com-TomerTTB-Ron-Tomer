package com.leadspace.tests.noJsystemTests;

public class GeneralMain {

    public static void main(String[] args) throws InterruptedException {

        /**
         The task: Write a program that prints the numbers from 1 to 100.
         But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
         For numbers which are multiples of both three and five print "FizzBuzz".
         */

        for (int i = 1; i <= 100 ; i++){
            if ((i % 3) == 0 & (i % 5) == 0){
                System.out.println("FizzBuzz " + i);
            }else if ((i % 3) == 0){
                System.out.println("Fizz " + i);
            }else if ((i % 5) == 0){
                System.out.println("Buzz " + i);
            }else{
                System.out.println(i);
            }
        }
    }
}