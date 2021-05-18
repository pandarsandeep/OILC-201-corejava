package ArrayProgrammes;

import java.util.Scanner;

public class QueueOperation {
	static int queue[] = new int[5];
	static int rear = 0, front = 0;

	static void menu() {
		String m = "Queue operation \n";
		m += "1.Insert \n";
		m += "2.Delete \n";
		m += "3.Display \n";
		m += "4.Quit \n";
		m += "select any option ?";
		System.out.println(m);
	}

	static boolean isEmpty() {
		boolean b = false;
		if (rear == front) {
			b = true;
		}
		return b;
	}

	static boolean isFull() {
		boolean b = false;
		if (rear == queue.length) {
			b = true;
		}
		return b;
	}

	static void insert(int ele) {
		if (isFull()) {
			System.out.println("queue is full");
		} else {
			queue[rear++] = ele;
			System.out.println("Inserted");
		}
	}

	static void delete() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("delete element is =" + queue[front]);
			for (int i = front; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			rear--;
		}
	}

	static void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Queue elements as fallows");
			for (int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	static void accept() {
		System.out.println("Enter a element to insert");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				accept();
				insert(sc.nextInt());
				break;
			case 2:
				delete();
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
