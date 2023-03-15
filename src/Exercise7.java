/**
 * @class: Exercise7
 * @author: Nia Jackson
 * @course: ITEC2140
 * This program will prompt a user to input a string and
 * will print it backwards.
 */

import java.util.Scanner;
public class Exercise7 {
    
    public static void main(String[] args){
        System.out.println("Enter a string: "); //Creates a scanner object
        Scanner input = new Scanner(System.in);
        String reverse = ""; //creates a string variable to be read

        
        CharSequence str = input.next();
        for(int i =str.length()- 1; i >= 0; i--){ //Creates for loop to reverse the string given
            reverse = reverse + str.charAt(i);
        }
        System.out.print(reverse); //prints the backwards string

    }
}
