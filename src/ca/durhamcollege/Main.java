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

        //Multi-dimensional array example
        System.out.println("Multi-Dimensional Array Example\n");
        int rows = 8;
        int columns = 8;
        float[][] board = new float[rows][columns];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < columns; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0f) + 1.0f;
            }
        }

        System.out.println("Showing 10 Random Values");
        for (int i = 0; i < 10; i++)
        {
            var randRows = (int)(Math.random() * rows);
            var randColumns = (int)(Math.random() * columns);
            System.out.printf("For row: " + randRows + " column: " + randColumns + " ");
            System.out.printf("The random number is %.2f\n", board[randRows][randColumns]);
        }

        //Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.0f \n", age);
    }
}
