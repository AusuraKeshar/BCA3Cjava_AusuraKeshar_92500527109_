class program4
 {
    public static void main(String args[]) {

        // Check if 3 arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java ArithmeticOperation <num1> <operator> <num2>");
            return;
        }

        // Convert command-line arguments to numbers
        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        // Perform operation
        switch (operator) {
            case "+":
                System.out.println("Addition = " + (num1 + num2));
                break;

            case "-":
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case "*":
                System.out.println("Multiplication = " + (num1 * num2));
                break;

            case "/":
                if (num2 != 0)
                    System.out.println("Division = " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;

            case "%":
                System.out.println("Modulus = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid operator! Use +, -, *, /, or %.");
        }
    }
}