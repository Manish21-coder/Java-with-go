
public class basicquestios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // count the digits
		/*
		 int n = 1089;
		 int count = 0;
		 while(n!=0) {
			 n =n/10;
		 count++;
		 }
		 System.out.println(count);  */
		 
		 // palindrome numbers 121 or  ana or aba or  nan like wise.
		 int temp = 134;
		  int num = temp;
		 int reverse=0;
		 while(num!=0) {
			 
			int lastdigit = num%10;
			 num = num/10;
			 reverse = reverse*10+lastdigit;
		 }
		 System.out.println(temp);
		 if(temp == reverse) {
			 System.out.println("IS palindrome ");return;
		 }System.out.println("not apalindrome ");
		 
		 int numb = 1; int tempp =10;
		 for(int i =1;i<=tempp;i++) {
			 numb = numb*i;
		 }
		 System.out.println(numb);
		 
		 // cont the trail fo zeros in factorial.
		 int cot =0;
		 while(numb%10==0) {
			 numb = numb/10;cot++;
		 }
		 System.out.println(cot);
		 
		 // finding the trail of zero of factorial without calculation zero
		 trail abc = new trail();
		 
	}
}	
 class trail{
	trail(){
		
	int num = 500; // calculating factorial of 50
	  int ans = 0;
	  
	  for(int i = 5;i<=num;i = i*5) {
		  ans += num/i;
	  }
	  System.out.println("trails of zeros of fact"+ num+" is "+ans);
	  
}
}
