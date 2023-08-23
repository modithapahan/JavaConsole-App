package todo;

import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        /* scanner object */
        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("Hi, Welcome to the Todo App");
        System.out.println("=================================");

        System.out.println("");

        /* Any String */
        String key = "kbhcbyubb";

        System.out.println("Do you want to continue? (Y/N)");
        String answer = input.nextLine();

        while (answer.equals("y") || answer.equals("Y") || answer.equals("n") || answer.equals("N")) {

            if (answer.equals("y") || answer.equals("Y")) {
                System.out.println("Enter your task");
                String task = input.nextLine();
            } else if (answer.equals("n") || answer.equals("N")) {
                System.out.println("=================================");
                System.out.println("Bye, Have a nice day!");
                System.out.println("=================================");
            } else {
                System.out.println("=================================");
                System.out.println("oops, Invalid charators! Try again!");
                System.out.println("=================================");
            }
        }

        System.out.println("=================================");
        System.out.println("oops, Invalid charators! Try again!");
        System.out.println("=================================");
        return;
    }
}
