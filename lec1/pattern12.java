package lec2;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		
		int row = 1;
		int space = n-1;
		int star = 1;
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				if(j%2 != 0) {
					System.out.print("* ");
				}
				else {
					System.out.print("! ");
				}
				j++;
			}
			row++;
			System.out.println();
			space--;
			star+=2;
		}
	}

}
