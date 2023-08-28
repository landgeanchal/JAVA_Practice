public class Swap{
	public static void main(String args[]) 
	{
		int temp;
		int x = 100;
		int y = 200;
		
	        System.out.println("Before swapping x = 100 and y =200");

		temp = x;
		x = y;
		y = temp;
		
                System.out.println("After swapping");
		System.out.println("x = " + x + " and y = " + y);
	}
}