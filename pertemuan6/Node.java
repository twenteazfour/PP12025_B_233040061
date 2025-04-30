package Tugas6_P7;

public class Node {
	 private int nilai;
	    private Node next;

	    public Node(int nilai) {
	        this.nilai = nilai;
	        this.next = null;  
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }

	    public Node getNext() {
	        return this.next;
	    }

	    public int getNilai() {
	        return this.nilai;
	    }

		public int getData() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

