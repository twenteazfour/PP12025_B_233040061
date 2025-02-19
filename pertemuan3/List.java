package Tugas2_P3;

public class List {
	private int data;
	private List next;
	
	public List(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setNext(List next) {
		this.next = next;
	}
	
	public List getNext() {
		return next;
	}

}
