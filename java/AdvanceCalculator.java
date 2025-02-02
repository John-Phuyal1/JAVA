nimport java.util.Scanner;

class AdvanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        boolean firstOperation = true;

        System.out.println("Simple Calculator");
        System.out.println("Enter 'exit' or '=' to quit.");
        System.out.println("Available operations: +, -, *, /");

        while (true) {
            if (firstOperation) {
                System.out.print("Enter a number: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("exit") || input.equals("=")) 
                {
                    break;
                }

                try {
                    result = Double.parseDouble(input);
                    firstOperation = false;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please enter a valid number.");
                    continue;
                }
            } else {
                System.out.print("Enter an operation (+, -, *, /) or 'exit'/'=' to quit: ");
                String operationInput = scanner.next();
                
                if (operationInput.equalsIgnoreCase("exit") || operationInput.equals("=")) {
                    break;
                }

                char opr = operationInput.charAt(0);

                System.out.print("Enter a number: ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("exit") || input.equals("=")) {
                    break;
                }

                double number;
                try {
                    number = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Please enter a valid number.");
                    continue;
                }

                switch (opr) {
                    case '+':
                        result += number;
                        break;
                    case '-':
                        result -= number;
                        break;
                    case '*':
                        result *= number;
                        break;
                    case '/':
                        if (number == 0) {
                            System.out.println("Math error: Cannot divide by zero. Operation skipped.");
                            continue;
                        } else {
                            result /= number;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Please enter a valid operation.");
                        continue;
                }
            }

            System.out.println("Current result: " + result);
        }

        scanner.close();
        System.out.println("Final result: " + result);
        System.out.println("Calculator terminated.");
    }


}
