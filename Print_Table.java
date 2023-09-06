import java.util.Scanner;
public class Print_Table{
	public static void main(String args[]){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter any Number: ");
           int number = 2;

		     for (int i = 1; i <= 2; i++) {
		        int result = number * i;
		        System.out.println(number + " * " + i + " = " + result);
            }

	}

}