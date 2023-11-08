package Sorting;
public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
			}
	}
		public Node head=null;
		public Node tail=null;
		void addNode(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		void addFirst(int data) {
			Node newNode = new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
		}
		public void display() {
			Node current=head;
			if(head==null) {
				System.out.println("linked list is empty");
			}
			else {
				System.out.println("singly linked list elements are: ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SinglyLinkedList sll = new SinglyLinkedList();
sll.addNode(10);
sll.addNode(5);
sll.addNode(20);
sll.addFirst(100);
sll.display();
	}

}

