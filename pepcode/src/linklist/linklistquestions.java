package linklist;
import java.util.*;

public class linklistquestions {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		//Take elements(numbers in the range of 1-50) of a Linked List
		//as input from the user. Delete all nodes which have values greater than 25.
		// a loop for adding value 
		
		for(int i=1;i<=50;i++) {
			list.add(i);
		}
		System.out.print(list);
		System.out.println();
		for(int i=0;i<=50;i++) {
			if(list.get(i) ==26) {
				return;
			}
			else {
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println();
	
		System.out.print(list);
		
		
		
	}
}
