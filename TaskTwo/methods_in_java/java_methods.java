package TaskTwo.methods_in_java;
/*
 * in the classmethods, write a method that asks user to enter three numbers, 
 * using if statement determine the largest number, the smallest number and 
 * display the results in the following format. 
The smallest number: ?
The largest number  number: ?

 */
import java.util.Scanner;

public class java_methods {
    public static void main(String[] args) {
        int first, second, third;
    
            try (// create an object of Scanner class
                Scanner input = new Scanner(System.in)) {
                    
                    // ask users to enter numbers
            System.out.println("Enter first number");
            first = input.nextInt();
        
            System.out.println("Enter second number");
            second = input.nextInt();
    
            System.out.println("enter third number");
            third = input.nextInt();
            if((first>second)&&(first>third)){
                System.out.println("the largest number:" + first);
            }
            else if (second>third){
                System.out.println("the largest number" + second);
               
            }
            else{
                System.out.println("the largest number" + third);
            }
            if ((first<second)&&(first<third)){
                System.out.println("the smallest number" + first);
            }
            else if (second<third){
                System.out.println("the smallest number" + second);
            }
            else{
                System.out.print("the smallest number" + third);
            }
}
    }
}