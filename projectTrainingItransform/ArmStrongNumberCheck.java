package projectTrainingItransform;

import java.util.Scanner;

public class ArmStrongNumberCheck {

	public static boolean isArmStrong(int n) {
		int temp = n;
		int res = 0,rem,sum= 0;
		while(temp>0) {
			temp/=10;
			++sum;
		}
		temp = n;
		while(temp>0) {
			rem=temp%10;
			res+=(Math.pow(rem, sum));
			temp=temp/10;
		}
		if(n==res) {
			return true;
		}else
		
		return false;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int i=0;i<=number;i++) {
			if(isArmStrong(i)) {
				System.out.print(i+",");
			}
		}

	}

}
