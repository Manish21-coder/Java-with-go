package pepcode;
import java.util.*;
public class array2d {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("give me a matrix ");
		int[][] arr= new int[3][4];
		
		for(int i=0;i<arr.length;i++) {
			
		 for(int j=0;j<arr.length;j++) {
			 arr[i][j]=sc.nextInt();
		 }
		}
		sc.close();
		
		//for printing
		for(int i=0;i<arr.length;i++) {
			
			 for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			 }
			 System.out.println("");
			}
	}

}
