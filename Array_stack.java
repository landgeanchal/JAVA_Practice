import java.util.Scanner;

public class Array_stack {
	
	    int maxSize;
	    int[] stackArray;
	    int top;

	    // Constructor to initialize the stack with a given size
	    public Array_stack(int size) {
	        maxSize = size;
	        stackArray = new int[maxSize];
	        top = -1; // Initialize top to -1, indicating an empty stack
	    }

	    // Push an element onto the stack
	    public void push(int value) {
	        if (isFull()) {
	            System.out.println("Stack is full. Cannot push " + value);
	        } else {
	            stackArray[++top] = value;
	            System.out.println("Pushed " + value + " onto the stack");
	        }
	    }

	    // Pop the top element from the stack
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop.");
	            return -1; // Return a sentinel value indicating an empty stack
	        } else {
	            int poppedValue = stackArray[top--];
	            System.out.println("Popped " + poppedValue + " from the stack");
	            return poppedValue;
	        }
	    }

	    // Peek at the top element without removing it
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot peek.");
	            return -1; // Return a sentinel value indicating an empty stack
	        } else {
	            return stackArray[top];
	        }
	    }

	    // Check if the stack is empty
	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Check if the stack is full
	    public boolean isFull() {
	        return top == maxSize - 1;
	    }

	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         System.out.print("Enter the size of the stack: ");
	         int stackSize = scanner.nextInt();
	          
	         
	        Array_stack stack = new Array_stack(5);

	        stack.push(10);
	        stack.push(20);
	        stack.push(30);

	        System.out.println("Top element: " + stack.peek());

	        stack.pop();
	        stack.pop();

	        System.out.println("Is the stack empty? " + stack.isEmpty());
	    }
	}






