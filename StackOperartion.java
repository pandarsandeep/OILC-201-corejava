package ArrayProgrammes;

import java.util.Scanner;

public class StackOperartion {

	static int stack[] = new int[5];
	static int top = -1;

	static void menu() {
		String m = "Stack operation \n";
		m += "1.Push \n";
		m += "2.Pop \n";
		m += "3.Display \n";
		m += "4.Quit \n";
		m += "select any option ?";
		System.out.println(m);
	}

	static void push(int ele) {
		if (isFull()) {
			System.out.println("Stack is owerflow");
		} else {
			stack[++top] = ele;
			System.out.println("element is added");
		}
	}

	static boolean isFull() {
		boolean b = false;
		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	static void pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} else {
			System.out.println("delete elemrnt is " + stack[top]);
			top--;
		}
	}

	static boolean isEmpty() {
		boolean b = false;
		if (top == stack.length - 1) {
			b = true;
		}
		return b;
	}

	static void display() {
		if (isEmpty()) {
			System.out.println("stack is empty");
		} 
		else
		{
			System.out.println("stack element is fallows...");
			for (int i = top; i >= 0; i--) {
				System.out.println(stack[i]);
			}
		}
	}

	static void accept() {
		System.out.println("enter elements to push");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				accept();
				push(sc.nextInt());
				break;
			case 2:
				pop();
				break;
			case 3:
				display();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("invalid option");
			}
		}
	}

}
