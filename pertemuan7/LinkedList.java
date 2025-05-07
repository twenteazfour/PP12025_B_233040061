package Tugas_P7;

public class LinkedList {
	private Node HEAD;
	
	public boolean isEmpty() {
		return HEAD == null;
	}
	
	public void addHead(MataKuliah data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	public void displayElement() {
		if (isEmpty()) {
			System.out.println("List Kosong");
		} else {
			Node curNode = HEAD;
			while (curNode!= null) {
				MataKuliah mk = curNode.getData();
				System.out.println(mk.getKode() + " - " + mk.getNama() + " - " + mk.getSks() + " SKS");
                curNode = curNode.getNext();
			}
		}
	}
	
	public void addTail(MataKuliah data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			Node curNode = HEAD;
			while (curNode.getNext() !=null) {
				curNode = curNode.getNext();
			}
			curNode.setNext(newNode);
		}
	}
	
	public void addMid(MataKuliah data, int posisi) {
		Node newNode = new Node(data);
		if (isEmpty() || posisi <= 1) {
			addHead(data);
		} else {
			Node curNode = HEAD;
			int count = 1;
			while (curNode != null && count < posisi -1) {
				curNode = curNode.getNext();
				count++;
			}
			if (curNode == null || curNode.getNext() == null) {
				addTail(data);
			} else {
				newNode.setNext(curNode.getNext());
				curNode.setNext(newNode);
			}
		}
	}

}
