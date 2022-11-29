package pattern;
import java.util.*;
public class palindromicnumberpyramid {
	
	public static void main(String[] ar) {
	
		System.out.println("give input for pattern");
		
		Scanner scn = new Scanner(System.in);
		
		int row= scn.nextInt();
		scn.close();
		
		for(int i=1;i<=row;i++) {
			
			//spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
}
