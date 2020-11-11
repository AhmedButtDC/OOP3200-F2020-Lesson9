package ca.durhamcollege;

import java.util.InputMismatchException;
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

        boolean isValid = false;

        while (!isValid)
        {
            try
            {
                System.out.print("Please enter your age: ");
                age = keyboard.nextFloat();
                isValid = true;
            }
            catch (Exception e)
            {
                System.out.printf("Error: You must enter a valid floating-point number.\n");
                isValid = false;
                keyboard.nextLine();
            }
            if (age < 0.0f || age > 120.0f)
            {
                System.out.printf("Error: You must enter an age greater than 0 and less than 120.\n");
                isValid = false;
            }
        }

        //Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.0f \n", age);
    }
}
