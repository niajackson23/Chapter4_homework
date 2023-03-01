/**
 * @class: PrimeNumber
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will ask the user to input an integer and will output if the
 * number is prime or not.
 */
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
    Scanner inputNumber = new Scanner(System.in); //Creates a scanner object
        System.out.println("Please enter a number: ");
        int num = inputNumber.nextInt();

        if (num / num == 1) {
            System.out.println("This is a prime number");
        } else{
                System.out.println("This is not a Prime number");
        }
        }
}
