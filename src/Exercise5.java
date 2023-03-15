/**
 * @class: Exercise%
 * @author: Nia Jackson
 * @course: ITEC 2140
 * The program will take a given number and produce the factors of that number
 */

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = inputNumber.nextInt();

        for (int i = 1; i <= num; ++i) {//creates for loop
            if (num % i == 0) { //If the reamained of i is 0 then it end the loop.
                System.out.println(i + "");
            }
        }
    }
}
