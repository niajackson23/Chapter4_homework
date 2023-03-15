/**
 * @class: Fibonacci
 * @author NiaJackson
 * @course: ITEC 2140
 * This program will produce the fibonacci sequence
 */
public class Fibonacci {
    public static void main(String[] args){
       int endnum = 30;//Creates variable for the ending number
       int num1 = 0;//The first number in the sequence
       int num2 = 1;//The second number in the sequence

       for(int i = 1; i <=endnum; ++i){//Creates parameter for the loop and tells it to stop at 30

           System.out.print(num1);

           int nextNum = num1 + num2;
           num1 = num2;
           num2 = nextNum;
       }



    }
}
