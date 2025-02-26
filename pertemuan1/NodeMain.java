package Tugas1_P1;

public class NodeMain {
    public static void main(String[] args) {
        //a: 5, 7, 9, 8
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        //b: 2, 3, 5, 7, 9
        Node m1 = new Node(2);
        Node m2 = new Node(3);
        Node m3 = new Node(5);
        Node m4 = new Node(7);
        Node m5 = new Node(9);

        m1.setNext(m2);
        m2.setNext(m3);
        m3.setNext(m4);
        m4.setNext(m5);

        //print pertama
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
        System.out.println(); 

        //print kedua
        p = m1;
        while (p != null) {
            System.out.printf("%d ", p.getNilai());
            p = p.getNext();
        }
    }
}