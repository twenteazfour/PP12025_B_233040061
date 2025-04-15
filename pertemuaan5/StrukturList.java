package Tugas5_P5;

public class StrukturList {
	private Node head;

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    public void addMid(int index, Object data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.getNext();
        }
        if (temp == null) return;
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    // ✅ Latihan 1: removeHead
    public void removeHead() {
        if (head == null) return;

        Node temp = head;
        head = head.getNext();
        dispose(temp);
    }

    // ✅ Fungsi dispose sesuai instruksi
    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext(); 
        }
        System.out.println();
    }
            
    public void removeTail() {
        if (head == null) return;

        if (head.getNext() == null) {
            dispose(head);
            head = null;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }

        prev.setNext(null);
        dispose(temp);

        System.out.println();
    }

    // ✅ DI SINI letakkan removeMid di luar removeTail
    public void removeMid(Object e) {
        if (head == null) {
            System.out.println("Elemen list kosong");
            return;
        }

        Node tempNode = head;
        Node preNode = null;

        while (tempNode != null && !tempNode.getData().equals(e)) {
            preNode = tempNode;
            tempNode = tempNode.getNext();
        }

        if (tempNode == null) {
            System.out.println("Elemen tidak ditemukan");
            return;
        }

        if (preNode == null) {
            head = head.getNext();
        } else {
            preNode.setNext(tempNode.getNext());
        }

        dispose(tempNode);
        
        System.out.println();
    }
    
 }

