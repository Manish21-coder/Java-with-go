
public class hcf {

	
	public static int fact(int n) {
		
		if(n==0)
			return 1;
		return n*fact(n-1);
	}
	public static int stairs(int n) {
		if(n<0) {
			return 0;
			
		}
		if(n==0)
			return 1;
		return stairs(n-1)+stairs(n-2)+stairs(n-3);
	}
	public static void main(String[] args) {
		
		
		System.out.println(fact(5));
		System.out.print(stairs(4));
	}
	
}
