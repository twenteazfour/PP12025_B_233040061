package Tugas2_P3;

public class StrukturList {
	private List HEAD;
	
	public StrukturList() {
		this.HEAD = null;
	}
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addTail(int data) {
		List newNode = new List(data);
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			List temp = HEAD;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}
	
	public void addHead(int data) {
		List newNode = new List(data);
		if (isEmpty()) {
		} else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public void display() {
		List curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData() + " ");
			curNode = curNode.getNext();
		}
		System.out.println();
	}

}
