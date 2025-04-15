package Tugas4_P5;

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
            if (head == null) return; // List kosong

            if (head.getNext() == null) {
                // Hanya ada satu elemen
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

            prev.setNext(null);  // Hapus link ke tail
            dispose(temp);       // Bersihkan tail
        
        System.out.println();
    }
}
