import java.util.Scanner;

/**
 * @class: StudentGrade
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will ask the user to input the grades of students in the class and
 * calculate the average grade of the class.
 */
public class StudentGrade {
    public static void main(String[] agrs){
        Scanner inputNumber = new Scanner(System.in); //Creates a new scanner object to read the integer given by user
        System.out.println("Please enter an integer: ");

        int sum = 0;
        while (inputNumber.hasNext()) {
            int number = inputNumber.nextInt();
            sum = sum + number;

            System.out.println(sum);
        }
    }
}

