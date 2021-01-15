package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        greet("Aid", "2020");
        remindName();
        guessAge();
        doCount();
        test();
        end();
    }

    public static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    public static void remindName() {
        System.out.print("> ");
        String yourName = scanner.nextLine();
        System.out.println("What a great name you have, " + yourName + "!");
    }

    public static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        System.out.print("> ");
        int remainder3 = scanner.nextInt();
        System.out.print("> ");
        int remainder5 = scanner.nextInt();
        System.out.print("> ");
        int remainder7 = scanner.nextInt();
        int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " +yourAge + "; that's a good time to start programming!");
    }

    public static void doCount() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        System.out.print("> ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int option = scanner.nextInt();
        boolean flag = true;
        while (flag) {
            if (option == 1 || option == 3 || option == 4 || option > 4) {
                System.out.println("Please, try again.");
                option = scanner.nextInt();
                //continue;
            } else {
                flag = false;
            }
        }
    }

    public static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }

}