package TaskTwo;
/*
 * create a java project a package and a class, in the class, write a program to calculate the area of the triangle. 
 * the program should have the non- static methods:
 * one of the method should ask the userto enter the base and the height of a triangle
 * the other should compute the area of the triangle
 * theother method should output the calculatedarea of the triangle and display it to the user.
 */

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args){

        //variable declaration
        int base;
        int height;
        int area;
    
        try (//creating a method
            Scanner input = new Scanner(System.in)) {
                //asks for the base
                System.out.println("enter the base of the triangle");
    
                //get the base
                base = input.nextInt();
                //asks for the height
                System.out.println("enter the height of the triangle");
                //get the height
                height = input.nextInt();
            }
    
            //computing the area
            area = (base*height)/2;
            System.out.print("the area of rectangle is" + area);
}
}