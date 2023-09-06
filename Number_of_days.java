import java.util.Scanner;

public class Number_of_days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scan.nextInt();

        System.out.print("Enter the year: ");
        int year = scan.nextInt();

        int daysInMonth;

        switch (month) {
            case 2: // February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28; // Non-leap year
                }
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                daysInMonth = 30;
                break;
            default: // January, March, May, July, August, October, December
                daysInMonth = 31;
                break;
        }

        System.out.println("Number of days in the given month: " + daysInMonth);


    }
}