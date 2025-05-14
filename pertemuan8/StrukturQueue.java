package Tugas7_P10;

public class StrukturQueue {
	private Node FRONT;
	private Node REAR;
	
	public StrukturQueue() {
		this.FRONT = null;
		this.REAR = null;
	}
	
	public boolean isEmpty() {
		return FRONT == null;
	}
	
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}
	
	public int size() {
		int size = 0;
		Node curNode = FRONT;
		while (curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	
	public int front() {
		return FRONT != null ? FRONT.getData() : -1;
	}
	
	public void displayElements() {
		if (isEmpty()) {
			System.out.println("Elemen Queue: Queue kosong");
	        return;
		}
		 System.out.print("Elemen Queue: ");
		 Node current = FRONT;
		 while (current != null) {
			 System.out.print(current.getData() + " ");
		        current = current.getNext();
		    }
		    System.out.println();
		 }
	
		public int dequeue() {
			if (isEmpty()) {
				System.out.println("Queue kosong, tidak bisa dequeue");
		        return -1;
		    }
			
			int data = FRONT.getData();
			FRONT = FRONT.getNext();
			
			if (FRONT == null) {
				REAR = null;
			}
			
			return data;
		}
}
