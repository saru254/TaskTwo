package TaskTwo;

/*
 * write a method that asks user to enter the year, the program should check if the year is a leap year and 
 * the output the text the year you entered is a leap year.
 */

import java.util.Scanner;

public class QuestionThree {
    //method to check leap year   
    public static void checkLeapYear(int year){
        if(year % 400==0){
            System.out.println(year + "is a leap year");
        }
        else if 
        (year % 100==0){
            System.out.println(year + "is not a leap year");
        }
        else if
        (year % 4==0){
            System.out.println(year + "is a leap year.");
        }
        else{
            System.out.println(year + "is not a leap year");
        }

    }
    public static void main(String[] args){
        // create a scanner object
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter a year:");
            //read user input from command line
            int year = input.nextInt();
            checkLeapYear(year);
        }
}
}