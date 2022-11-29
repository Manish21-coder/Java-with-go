package pattern;

import java.util.Scanner;

public class numberpyramid {

	public static void main(String[] args) {
		

		System.out.println("give input");
		
		Scanner scn= new Scanner(System.in);
		
		int row = scn.nextInt();
		for(int i=1;i<=row;i++) {
			
			// for printing space
			for(int j=row-1;j>=i;j--) {
				System.out.print(" ");
			}
			// for inner loop
			
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
}
