package Tugas5_P5;

public class StrukturListTest {
public static void main(String[] args) {
        
        StrukturList list = new StrukturList();

        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(5);
        list.addLast(1);

        
        list.display(); // Output: 2 6 3 5 1
        
        list.removeMid(3);
        
        list.display(); // Output: 2 6 5 1
        
        list.removeMid(6);
        list.removeMid(5);

        list.display(); 
    }
}
