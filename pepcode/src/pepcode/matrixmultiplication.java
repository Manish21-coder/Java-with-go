package pepcode;
import java.util.*;

public class matrixmultiplication {
 
	
	public static void main(String[] args) {
		System.out.println("give me first matrix");
		Scanner scn = new Scanner(System.in);
		//first matrix row and column;
		int r1= scn.nextInt();
		int c1= scn.nextInt();
		int [][]arr1= new int[r1][c1];
		
		// taking input
		System.out.println("input for first matrix");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				
				arr1[i][j]=scn.nextInt();
			}
		}
		System.out.println("give second matrix");
		int r2 = scn.nextInt();
		int c2= scn.nextInt();
		int [][]arr2= new int[r2][c2];
		
		// taking second matrix input
		System.out.println("give me input for second matrix");
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr2[i][j]=scn.nextInt();
			}
		}
		
		scn.close();
		 //now putting product
		if(r2!=c1) {
			System.out.println("Invalid input");
		}
		
		int [][]result=new int[r1][c2];
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				
				for(int k=0;k<c1;k++) {
					result[i][j] += arr1[i][k] *arr2[k][i];
				}
			}
		}
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				
			System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
