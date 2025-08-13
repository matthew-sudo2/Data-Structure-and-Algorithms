public class LinkedList {
	static Node head;
	
	static void printList() {
		Node p = head;
		System.out.print("(");
		while(p != null) {
			System.out.print(" " + p.data);
			p = p.next;
		}
		System.out.println(" )");
	}
	
	static void insertAtBegin(int data) {
		Node lk = new Node(data);
		lk.next = head;
		head = lk;
	}
	
	public static void main(String args[]) {
		insertAtBegin(12);
		insertAtBegin(22);
		insertAtBegin(30);
		insertAtBegin(44);
		insertAtBegin(50);
		System.out.print("Linked List: ");
		printList();
	}
}
