import java.util.Scanner;

public class PrimeCheckAndRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Binary representation of " + n + ": " + toBinary(n));
        } else {
            System.out.println("Octal representation of " + n + ": " + toOctal(n));
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to convert to binary without using built-in functions
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }

    // Function to convert to octal without using built-in functions
    public static String toOctal(int num) {
        StringBuilder octal = new StringBuilder();
        while (num > 0) {
            octal.insert(0, num % 8);
            num /= 8;
        }
        return octal.toString();
    }
}
