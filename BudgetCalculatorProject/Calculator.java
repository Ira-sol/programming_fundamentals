import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an operation (+, -, *, /, or exit):");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;

            }

            if (!operation.matches("[-+/*]")) {
                System.out.println("Invalid operation.");
                continue;
            }


            System.out.println("Enter first number:");
            double number1 = scanner.nextDouble();

            System.out.println("Enter second number:");
            double number2 = scanner.nextDouble();

            switch (operation) {
                case "+":
                    System.out.println(number1 + number2);
                    break;
                case "-":
                    System.out.println(number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 * number2);
                    break;
                case "/":
                    if (number2 == 0) {
                        System.out.println("Error: Division by zero is not allowed!");
                    } else {
                        System.out.println(number1 / number2);
                    }
                    break;

                    


            }
            System.out.println("Would you like to perform another operation (yes/no)?");
                    String response = scanner.next();
                    if (response.equalsIgnoreCase("no")) {
                        System.out.println("Thank you for using the Java Calculator! Goodbye!");
                        break;
                    }
        }
        scanner.close();
    }
}
