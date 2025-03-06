public class FactorialCalculator {
    public static void main(String[] args) {
        int userInput = getNonNegativeInteger();
        long factorialResult = calculateFactorial(userInput);
        displayResult(userInput, factorialResult); 
    }
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); 
                System.out.print("Enter a non-negative integer: ");
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Input must be non-negative. Please try again.");
            }
        }
        return number;
    }
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is " + factorial + ".");
    }
}