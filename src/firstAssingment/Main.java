package firstAssingment;

public class Main {

        // Define a class named "SimpleCalculator"
        public class SimpleCalculator {
            public static void main(String[] args) {
                // Initialize two double variables with values 10.0 and 5.0
                double num1 = 10.0;
                double num2 = 5.0;

                // Initialize a character variable with the value '+'
                char operator = '+';

                // Declare a double variable to store the result of the calculation
                double result;

                // Use a switch statement to perform calculations based on the operator
                if (operator == '+') {
                    // Addition: Add num1 and num2 and store the result in the result variable
                    result = num1 + num2;
                } else if (operator == '-') {
                    // Subtraction: Subtract num2 from num1 and store the result in the result variable
                    result = num1 - num2;
                } else if (operator == '*') {
                    // Multiplication: Multiply num1 and num2 and store the result in the result variable
                    result = num1 * num2;
                } else if (operator == '/') {
                    // Division: Check if num2 is not equal to zero
                    if (num2 != 0) {
                        // If num2 is not zero, perform division and store the result in the result variable
                        result = num1 / num2;
                    } else {
                        // If num2 is zero, display an error message and exit the program
                        System.out.println("Cannot divide by zero.");
                        return;
                    }
                } else {
                    // If operator is not one of the above cases, display an error message and exit the program
                    System.out.println("Invalid operator.");
                    return;
                }

                // Print the result of the calculation to the console
                System.out.println("Result: " + result);
            }
        }

}
