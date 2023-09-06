import java.util.Scanner;

public class ReverseAndSumDigits {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scan.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
        System.out.println("Sum of digits: " + sumOfDigits);


    }
}