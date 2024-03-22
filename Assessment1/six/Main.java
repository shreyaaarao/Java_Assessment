package Assessment1.six;

public class Main {
    public static void main(String[] args) {
        try {
            // Calling performDivision method with valid divisor and dividend
            double result = performDivision(3, 0);
            System.out.println("Result of division: " + result);
        } catch (InvalidDivisorException e) {
            // Catching and printing only the error message from the custom exception
            System.out.println(e.getMessage());
        }
    }

    public static double performDivision(double dividend, double divisor) throws InvalidDivisorException {
        double result = 0;
        try {
            if (divisor == 0) {
                // If divisor is 0, throw custom exception with user-defined message
                throw new InvalidDivisorException("Please pass a valid divisor");
            }
            // Perform division
            result = dividend / divisor;
            return result;
        } finally {
            // Print divisor and dividend used after the method is completed
            System.out.println("Divisor used: " + divisor);
            System.out.println("Dividend used: " + dividend);
        }
    }
}

class InvalidDivisorException extends Exception {
    public InvalidDivisorException(String message) {
        super(message);
    }
}

