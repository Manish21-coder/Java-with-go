package pepcode;
import java.util.*;
public class spiralmatrix {
	
	public static void main(String[] args) {
		
		System.out.println("give input rows and colmns");
		
		Scanner scn = new Scanner(System.in);
		
		int r = scn.nextInt();
		int c= scn.nextInt();
		
		System.out.println("give matrix input");
		int arr[][]= new int[r][c];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		scn.close();
		//output for spiral
		
		int minr=0;
		int minc=0;
		
		int maxr= arr.length-1;
		int maxc= arr[0].length-1;
		int total= r*c;
		int count=0;
		
		while(count<total) {
			//left wall col fixed
			for(int i=minr,j=minc;i<=maxr && count<total;i++) {
				System.out.println(arr[i][j]+" ");
				count++;
			}
			
			minc++;
			//bottom wall  row fixed
			for(int i=maxr,j=minc;j<=maxc && count<total;j++) {
				System.out.println(arr[i][j]+" ");
				count++;
			}
		
			maxr--;
			//right wall   col fixed row reduce
			for(int i=maxr,j=maxc;i>=minr && count<total;i--) {
				System.out.println(arr[i][j]+" ");
				count++;
			}
			
			maxc--;
			//top wall   row fixed col reduce
			for(int i=minr,j=maxc;j>=minc && count<total;j--) {
				System.out.println(arr[i][j]+" ");
				count++;
			}
			minr++;
		}
		
		
		
	}

}
