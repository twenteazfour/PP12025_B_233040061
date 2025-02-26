package Tugas3_P4;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Latihan 3: 5 3 8 7 4
        list.addLast(3);
        list.addLast(4);
        list.addMid(1, 7);
        list.addMid(1, 8);
        list.addFirst(5);
        list.display(); 

       
        StrukturList listDecimal = new StrukturList();

        // 2A: 2.1 3.4 4.5
        listDecimal.addFirst(3.4);
        listDecimal.addLast(4.5);
        listDecimal.addMid(0, 2.1);
        listDecimal.display();

        // 2B: 3.4 2.1 1.1 4.5 5.5
        listDecimal = new StrukturList();
        listDecimal.addFirst(2.1);
        listDecimal.addLast(4.5);
        listDecimal.addMid(1, 1.1);
        listDecimal.addFirst(3.4);
        listDecimal.addLast(5.5);
        listDecimal.display(); 
    }
}
