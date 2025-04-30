package Tugas6_P7;

import Tugas2_P3.List;

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
	
	public boolean find(int x) {
		List curNode = HEAD;
		boolean ketemu = false;
		
		while (curNode != null && !ketemu) {
			if (curNode.getData() ==x)
				ketemu = true;
			else
				curNode = curNode.getNext();
		}
		return ketemu;
		
	}
	
	public int size() {
	    List curNode = HEAD;
	    int jumlah = 0;

	    while (curNode != null) {
	        jumlah++;
	        curNode = curNode.getNext();
	    }

	    return jumlah;
	}
	
	public void clear() {
	    HEAD = null;
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



