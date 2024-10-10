import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        Stack numberStack = new Stack(5);  // Initialize stack with size 5

        System.out.println("Hello there!");

        while (true) {
            System.out.println("Choose what you want to do:"
                    + " 1. Get Stack Size"
                    + " 2. Push to Stack"
                    + " 3. Pop from Stack"
                    + " 4. Exit");

            int userChoice = inputScanner.nextInt();  // Get user's choice
            switch (userChoice) {
                case 1 -> {
                    System.out.println("Current stack size is: " + numberStack.size());
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                }

                case 2 -> {
                    System.out.println("Enter a number to push: ");
                    int numberToPush = inputScanner.nextInt();
                    if (numberStack.push(numberToPush)) {
                        System.out.println("Pushed value: " + numberToPush);
                    } else {
                        System.out.println("Stack is full! Can't push.");
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                }

                case 3 -> {
                    int numberPopped = numberStack.pop();
                    if (numberPopped != -1) {
                        System.out.println("Popped value: " + numberPopped);
                    } else {
                        System.out.println("Stack is empty! Can't pop.");
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~");
                }

                case 4 -> {
                    System.out.println("Exiting...");
                    System.exit(0);  // Exit the program
                }

                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
