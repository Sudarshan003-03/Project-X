public class SumOfDigits {

    public static int sumOfDigits(int n) {
        // Handle negative numbers by making them positive
        if (n < 0) {
            n = -n;
        }

        // Base case: If the number is a single digit, the sum is the number itself
        if (n < 10) {
            return n;
        }

        // Recursive step: Last digit + sum of the remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 2541;
        System.out.println("Sum of digits in " + number + " is: " + sumOfDigits(number));
    }
}