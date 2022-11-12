package TaskTwo;
/*
 * create a java project, package and class. in the class write a method that asks a lecture to enter marks for three
 * units, java programming, network and maths. the method should compute the average marks for three units and output
 * the data in the following format;
 * marks for java programming is?
 * marks for networking is ?
 * marks for maths?
 * the average is?
 */

import java.util.Scanner;



public class QuestionTwo {
    public static void main(String[] args){
        int programming;
        int networking;
        int maths;
        try (//creating a method
        Scanner input = new Scanner(System.in)) {

            //java programming input
            System.out.println("enter marks for java programming");
            //getting programming
            programming = input.nextInt();

            //networking input
            System.out.println("enter marks for networking");
            //getting networking
            networking = input.nextInt();

            //maths input
            System.out.println("enter marks maths");
            //getting maths
             maths = input.nextInt();
              
        //computing the output
        System.out.println("marks for java programming is:?" + programming);
        System.out.println("marks for networking is :" + networking);
        System.out.println("marks for maths:?" + maths);
        System.out.println("the average is :?" +(programming + networking + maths)/3);
}
    }
}