package linklist;

public class linklistreverse {

	



		Node head;
		private int size;
		
		// we create new class for node to store next node space.

		// parent class constructor
		linklistreverse(){
			this.size=0;
		}
		class Node {

			int data;
			Node next;

			public Node(int data) {
				this.data = data;
				this.next = null;
				size++;
			}
		}

		// INSERTS or ADD method's.
		// Node first,last insert medthod's

		public void addFirst(int data) {

			Node newNode = new Node(data);

			if (head == null) {
				head = newNode;
				return;
			}

			newNode.next = head;
			head = newNode;

		}

		// add at last positon.

		public void addLast(int data) {

			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}

			Node curnode = head;
			while (curnode.next != null) {
				curnode = curnode.next;
			}

			curnode.next = newNode;
		}

		// print
		public void printlist() {
			if (head == null) {
				System.out.println("empty linkedlist");
				return;
			}

			Node curnode = head;

			while (curnode != null) {
				System.out.print(curnode.data + "->");
				curnode = curnode.next;
			}

			System.out.println("Null");
		}

		
		
		// deletion of linklist node
		// in deletion there is also both first and last delete
		
		public void deleteFirst() {
			if(head == null) {
				System.out.println("list is empty");
			    return;
			}
			
			size--;
			head = head.next; // just shifting the head and java grabage collecter automatically delete it for free
			
			
		}
		
		// last delete
		
		public void deleteLast() {
			
			// corner case
			if(head==null) {
				System.out.println("List is empty");
				return;
				
			}
			
			size--;
			
			if(head.next==null) {
				head=null;
				return;
			}
			
			Node secondLast = head;
			Node lastNode = head.next;
			while(lastNode.next !=null) {
				lastNode =lastNode.next;
				secondLast= secondLast.next;
			}
			secondLast.next=null;
		}
		
		
		public int getSize() {
			return size;
		}
		
		public void reverseIterate() {
			if(head == null || head.next ==null) {
				return;
			}
		  // without creating another linklist
			
			
			  Node preNode =head;
			  Node currNode = head.next;
			  // kab tak chalana h 
			  while(currNode != null) {
				  
				  Node nextNode = currNode.next;
				  currNode.next = preNode;
				  
				  // update the values
				  
				     preNode = currNode;
				     currNode = nextNode;
				     
			  }
			  
			   head.next =null;
			   head = preNode;
			   
				
		
			
		}
		
		public Node recusiveReverse(Node head) {
			if(head == null || head.next == null) {
				return head;
			}
			
			Node newhead = recusiveReverse(head.next);
			head.next.next = head;
			head.next = null;
			return newhead;
			
		}
		
		public static void main(String args[]) {

			// create a class object for accessing the nodes
			linklistreverse list = new linklistreverse();
			list.addLast(1);
			list.addLast(5);
			list.addLast(7);
			list.addLast(3);
			list.addLast(8);
			list.addLast(3);
			list.printlist();
			
			list.reverseIterate();
			list.printlist();
			
			list.head = list.recusiveReverse(list.head);
			list.printlist();
			
			
			
			
			
			
		}
	}

	
	

