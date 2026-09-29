import java.util.logging.Logger;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        logger.info("Calculator application is running!");
        logger.info("Addition: " + calculator.add(10, 5));
        logger.info("Subtraction: " + calculator.subtract(10, 5));
        logger.info("Multiplication: " + calculator.multiply(10, 5));
        logger.info("Division: " + calculator.divide(10, 5));
    }
}
