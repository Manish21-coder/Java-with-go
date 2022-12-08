package linklist;

public class Linklist {

	Node head;
	private int size;
	
	// we create new class for node to store next node space.

	// parent class constructor
	Linklist(){
		this.size=0;
	}
	class Node {

		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// INSERTS or ADD method's.
	// Node first,last insert medthod's

	public void addFirst(String data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;

	}

	// add at last positon.

	public void addLast(String data) {

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
	
	public static void main(String args[]) {

		// create a class object for accessing the nodes

		Linklist list = new Linklist();
		list.addFirst("a");
		list.addFirst("b");
		list.printlist();

		list.addLast("family");
		list.printlist();
		
		list.deleteFirst();
		list.printlist();
		
		//list.deleteLast();
		list.printlist();
//		
       System.out.println(list.getSize());
	}
}
