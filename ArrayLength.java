import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int array[] = new int[length];

        System.out.println("Enter " + length + " values for the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter a value to search for: ");
        int searchValue = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < length; i++) {
            if (array[i] == searchValue) {
                found = true;
                System.out.println("Value " + searchValue + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Value " + searchValue + " not found in the array.");
        }

	}

}
