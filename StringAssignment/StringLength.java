package StringAssignment;

import java.util.Scanner;

public class StringLength {
	
	public static int stringMethod(String n) {
		int m = n.length();
		System.out.println(m);
		return m;
	}

	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String store = scan.nextLine();
		stringMethod(store);
	}
}
