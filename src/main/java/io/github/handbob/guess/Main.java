package io.github.handbob.guess;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String message = new String();
            String option = new String();
            String input = new String();
            Random random = new Random();
            Integer number;
            Integer guess;

            guess = random.nextInt(1, 10);
            
            message = "\nInteractive commandline game guess the number!\nChoose one option:\n1. Play\n2. Exit\nOption: ";

            System.out.printf("%s", message);
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    message = "The guessing number is from range 1 to 10\nEnter number: ";
                    System.out.printf("%s", message);
                    do {
                        input = scanner.nextLine();
                        number = Integer.parseInt(input);
                        if (number < 1 && number > 10 || number != guess) {
                            message = "Try again\nEnter number from range 1 to 10: ";
                            System.out.printf("%s", message);
                        }
                        else {
                            message = "\nYou have found the guessing number";
                            System.out.printf("%s: %d = %d\n", message, guess, number);
                            break;
                        }
                    } while (true);
                case "2":
                    message = "Thank you for playing!";
                    System.out.printf("%s\n", message);
                    break;
            }
        }
    }
}