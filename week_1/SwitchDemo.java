package week_1;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you membership level");

        String s = scanner.nextLine();

        switch(s) {
            case "platinum":
                System.out.println("super");
                break;
            case "gold":
                System.out.println("duper");
                break;
            case "silver":
                System.out.println("member");
                break;
            default:
                System.out.println("not found");
        }

        // more or less the same as
        if (s.equalsIgnoreCase("platinum")){
            System.out.println("super");
        } else if (s.equalsIgnoreCase("gold")){
            System.out.println("duper");
        } else if (s.equalsIgnoreCase("silver")){
            System.out.println("member");
        } else {
            System.out.println("not found");
        }
    }
}
