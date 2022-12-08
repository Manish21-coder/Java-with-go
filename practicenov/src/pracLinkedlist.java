
public class pracLinkedlist {

	Node head;
	private int size;
	
	pracLinkedlist(){
		this.size=0;
	}
	
	 public class Node{
	    String data;
	    Node next;
	        
	    Node(String data){
	    	
	    	this.data=data;
	    	this.next=null;
	    	size++;
	    }   
	 }
	 
	 
	 // add method addfirst
	 
	 public void addFirst(String data) {
		 
		 Node newNode=new Node(data);
	  //corner
		 
		 if(head==null) {
			 head =newNode;
			 return;
		 }
		 
		 
		 newNode.next= head;
		 head = newNode;
		 
	 }
	 
	 public void addLast(String data) {
		 Node newNode = new Node(data);
		 
		 if(head ==null) {
			 head=newNode;
			 return;
		 }
		 
		 Node currentNode = head;
		 while(currentNode.next !=null) {
			 currentNode = currentNode.next;
		 }
		 currentNode.next = newNode;
	 }
	 
	 public void printList() {
		 if(head == null) {
			 System.out.println("string is empty");
			 return;
		 }
		 
		 
		 Node currentNode = head;
		 while(currentNode != null) {
			 System.out.print(currentNode.data +"->");
			 currentNode = currentNode.next;
		 }
		 System.out.println("null");
	 }
	 
	 //delete element at first
	 
	 public void deleteFirst() {
		 if(head==null) {
			 System.out.print("list is empty");
			 return;
		 }
		 size--;
		 head = head.next;
	 }
	 
	 // delete at last
	 
	 public void deleteLast() {
		 
		 if(head==null) {
			 System.out.print("list is empty");
			 return;
		 }
		 
		 size--;
		 if(head.next ==null) {
			 head =null;
			 return;
		 }
		 Node secondLast = head;
		 Node firstNode = head.next;
		 
		 while(firstNode.next !=null) {
			 secondLast = secondLast.next;
			 firstNode = firstNode.next;
		 }
		 secondLast.next =null; 
	 }
	 
	 public int getSize() {
		 return size;
	 }
	 
	 
	 
	 public static void main(String args[]) {
		 pracLinkedlist list = new pracLinkedlist();
		 list.addFirst("first");
		 list.addLast("last");
		 list.addFirst("anothe");
		 
		 System.out.println(list.getSize());
		 list.printList();
		 list.deleteFirst();
		 list.deleteLast();
		 list.printList();
		 
		 
		 System.out.print(list.getSize());
	 }
}
