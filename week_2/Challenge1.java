package week_2;

import java.util.Scanner;

public class Challenge1 {

    //    Ask the user to enter two numbers.
    //    Print which number is greater or if they are equal.
    public static void main(String[] args) {
        // create two vars to hold the user input
        int a;
        int b;
        String response = "";

        // create Scanner to get user input
        Scanner input = new Scanner(System.in);

        do {
            // give user instructions
            System.out.println("enter your first number: ");
            // assign the input from the scanner to the variables
            a = input.nextInt();
            System.out.println("enter your second number: ");
            b = input.nextInt();

            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else if (b > a) {
                System.out.println(b + " is greater than " + a);
            } else {
                System.out.println(b + " and " + a + " are equal");
            }

            System.out.println("would you like to do this again? (yes/no)");

            response = input.next();

        } while(response.equalsIgnoreCase("yes"));

        System.out.println("done");
    }
}
