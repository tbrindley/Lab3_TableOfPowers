import java.util.Scanner;

/**
 * Created by Travis Brindley on 6/27/2017.
 * Creates a program that will display a table of powers
 * Specifics:  Prompts the user to enter an integer
 * Displays a table of squares and cubes from 1 to the value entered.
 * Asks the user if they wish to continue.
 */

public class Main {

    private static int getNumber() {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Please enter an integer:  ");

        //verifies that the user entered an integer
        while (!scnr.hasNextInt()) {
            System.out.print("I'm sorry, that isn't a valid integer. Please enter an integer: ");
            scnr.next();
        }

        int number = scnr.nextInt();

        return number;
    }

    private static int squareIt(int i) {
        double x = Math.pow(i, 2);
        int squared = (int) x;
        return squared;
    }

    private static int cubeIt(int i) {
        double x = Math.pow(i, 3);
        int cubed = (int) x;
        return cubed;
    }

    private static void CreateTable(){
            int number = getNumber();

            System.out.printf("%8s%16s%16s \n","Number","Squared","Cubed");
            System.out.printf("%8s%16s%16s \n","======","=======","=======");

            for (int i = 0; i <= number; i++) {
                int squared = squareIt(i);
                int cubed = cubeIt(i);
                System.out.printf("%8d%16d%16d \n", i, squared, cubed);
            }
    }

    public static void main(String[] args) {
        //variable declaration
        Scanner scnr = new Scanner(System.in);
        String cont;
        System.out.println("Lab 3 - Powers Table");
        do {
            CreateTable();
            System.out.print("Continue? Y/N: ");
            cont = scnr.nextLine();

        } while (cont.equalsIgnoreCase("y"));

        System.out.println("Thanks!");

    }
}
