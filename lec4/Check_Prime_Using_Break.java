package lec4;

import java.util.Scanner;

public class Check_Prime_Using_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count>=1) System.out.println("Not Prime");
		else System.out.println("Prime");
	}

}
