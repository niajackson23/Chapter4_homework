/**
 * @class: IntegerSum
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will ask the user to input an integer and display the sum of
 * all the digits of the integer.
 */

import java.util.Scanner;
public class IntegerSum {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in); //Creates a new scanner object to read the integer given by user
        System.out.println("Please enter an integer: ");

        int sum = 1;
        int number = inputNumber.nextInt();
        sum = sum + number;

        if (1 % number >= 0) {

            System.out.println("The number " + number + " is prime");

        }
    }
}