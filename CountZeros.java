public class CountZeros {

    public static int countZeros(int n) {
        // Special case: If the initial number itself is just 0
        if (n == 0) {
            return 1;
        }

        // Base case for recursion: when the number is reduced to a single digit
        if (n < 10) {
            return 0; 
        }

        // Check if the last digit is 0, then recurse with the remaining digits
        if (n % 10 == 0) {
            return 1 + countZeros(n / 10);
        } else {
            return countZeros(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 1020304;
        
        // Handle the absolute 0 edge case right here
        int result = (number == 0) ? 1 : countZeros(number);
        
        System.out.println("Number of zeros in " + number + " is: " + result);
    }
}