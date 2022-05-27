package projectTrainingItransform;

import java.util.Scanner;

public class SearchArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int arr[] = new int[number];
		
			for(int i=0; i<number;i++) {
				try {
				arr[i] = scan.nextInt(number);
			  }catch (Exception e) {
				 System.out.println("ArrayIndexOutOfBoundException");
				}
			} 
			int n = scan.nextInt();
			int m = 0;
			int store = 0;
			for(int i=0;i<=number;i++) {
				if(arr[i]==n) {
			      store = 1;
			      break;
				}
				else {
					store = 0;
				}
			}
			if(store==1) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		
	}

}
