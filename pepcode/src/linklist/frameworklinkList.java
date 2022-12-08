package linklist;

import java.util.*;

public class frameworklinkList {

	
	// fuction declatrtion
	
	public static void main(String ar[]) {
		//syntax of linklist  declaration is 
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		list.addFirst("this");
		list.add("list");
		
		System.out.println(list);
		System.out.println(list.size());
		// remove function of linkedlist.
		
		// when no removefist is used simple first is used then it will remove the last node;
		list.removeFirst();
		for(int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i)+" ->");
		}
		System.out.println("null");
	}
}
