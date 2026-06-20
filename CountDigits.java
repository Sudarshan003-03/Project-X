public class CountDigits {

    public static int countDigits(int n) {
        // Handle negative numbers by converting them to positive
        if (n < 0) {
            n = -n;
        }

        // Base case: If the number is a single digit, it has exactly 1 digit
        if (n < 10) {
            return 1;
        }

        // Recursive step: Eliminate the last digit and add 1 to the count
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 54321;
        System.out.println("Number of digits in " + number + " is: " + countDigits(number));
    }
}