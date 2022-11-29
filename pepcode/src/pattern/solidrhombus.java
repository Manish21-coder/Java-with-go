package pattern;
import java.util.*;
public class solidrhombus {

	public static void main(String[] args) {
		
		System.out.println("give input");
		
		Scanner scn= new Scanner(System.in);
		
		int row = scn.nextInt();
		for(int i=0;i<row;i++) {
			
			// for printing space
			for(int j=row-1;j>i;j--) {
				System.out.print(" ");
			}
			// for inner loop
			
			for(int k=0;k<row;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
