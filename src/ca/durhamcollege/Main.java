package ca.durhamcollege;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Declarations
        String name = null;
        Scanner keyboard = new Scanner(System.in);
        float age = 0.0f;

        //Input
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        //Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.0f \n", age);
    }
}
