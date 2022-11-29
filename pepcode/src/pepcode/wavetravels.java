package pepcode;
import java.util.*;
public class wavetravels {

	public static void main(String[] args) {
		
        System.out.println("give input for wave matrix rows and colms");
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr= new int[r][c];
        System.out.println("give input for wave matrix");
        for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr[0].length;j++) {
        		arr[i][j]= sc.nextInt();
        	}
        }
        
        sc.close();
        
        // for printing into puggle
        
        for(int j=0;j<arr[0].length;j++) {
        	
        	if(j%2==0) {
        		for(int i=0;i<arr.length;i++) {
        			System.out.print(arr[i][j]+" ");
        		}
        	}else {
        		for(int i=arr.length-1;i>=0;i--) {
        			System.out.print(arr[i][j]+" ");
        		}
        	}
        	System.out.println();
        }
	}
}
