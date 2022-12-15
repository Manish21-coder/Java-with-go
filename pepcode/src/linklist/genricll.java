package linklist;

public class genricll<M>{
	 
	//gloablal variable.
	Node head;
	class Node{
		
		M data;
		Node next;
		
		//constructor
		Node(M data){
			this.data=data;
			this.next=null;		
		}
		
}

	//add functionality
	
	// add first 
	public void addFirst(M data) {
	 	// create corner case
		Node newNode = new Node(data);
		if(head ==null) {
			head =newNode;
			return;
		}
		
		// funciton
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(M data) {
	  Node newNod = new Node(data);
	  if(head == null) {
		  head =newNod;
	   return;
	  }
	  
	  Node currNod = head;
	    while(currNod.next !=null) {
	    	currNod = currNod.next;
	    }
	    currNod.next = newNod;
	}
	
	// delete first
	
	public void delFirst () {
		if(head == null) {
			System.out.print("empty list "); return;
		}
		head = head.next;
	}

	
	// del last 
	 public void delLast() {
		 if(head == null) {
			 System.out.print("empty lsit");return;
		 }
		 Node currNode= head;
		 Node lastCurr = head.next;
		 while(lastCurr.next !=null) {
			 lastCurr = lastCurr.next;
			 currNode = currNode.next;
		 }
		 currNode.next = null;
		 
	 }
	
	//printlist 
	public void printList() {
		
		if(head ==null) {
			System.out.println("empty list of linklist");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
		     System.out.print(currNode.data+"->");	
		     currNode =currNode.next;
		}
		System.out.println("null");
	}
	
	public void norRev() {
	  //corner case build
		if(head ==null || head.next ==null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			
			// update new values
			 prevNode= currNode;
		     currNode = nextNode;
			
		}
		head.next =null;
		   head = prevNode;
		
	}

	public Node recursivReturn(Node head) {

		 if(head ==null || head.next==null) {
			 return head;
		 }
		 
		Node newNode = recursivReturn(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
	}
	
	public static void main(String ar[]) {
		
		genricll<Integer> list = new genricll<>();
		list.addFirst(10);
		list.addFirst(290);
		list.addFirst(388);
		list.addLast(12);
		list.printList();
		
		list.delLast();
//		list.norRev();

         list.head = list.recursivReturn(list.head);		 
	      	
          list.printList();
 
	}

}
