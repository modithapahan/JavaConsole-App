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

        System.out.println("Do you want to continue? (Y/N)");
        String answer = input.nextLine();

        if (answer.equals("y") || answer.equals("Y") || answer.equals("n") || answer.equals("N")) {

            if (answer.equals("y") || answer.equals("Y")) {

                System.out.println("");
                System.out.println("=================================");

                System.out.println("Enter a test word: ");
                String task = input.nextLine();

                System.out.println("");
                System.out.println("==== -G R A T E- ====");
                System.out.println("");

                if (task.length() >= 100) {
                    System.out.println("Too much!");
                } else {
                    int x = 1;
                    String newOne = "";

                    while (x < 3) {
                        System.out.println("Enter your task: ");
                        task = input.nextLine();

                        newOne += task;
                        x++;
                    }

                    System.out.println("");

                    System.out.println("" + newOne);

                    System.out.println("");

                    System.out.println("=================================");
                    System.out.println("Bye, Have a nice day!");
                    System.out.println("=================================");

                    return;
                }

            }

            else {
                System.out.println("=================================");
                System.out.println("Bye, Have a nice day!");
                System.out.println("=================================");

                return;
            }
        }

        else {
            System.out.println("=================================");
            System.out.println("oops, Invalid charators! Error!");
            System.out.println("=================================");

            return;
        }
    }
}
