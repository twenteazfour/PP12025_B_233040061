package Tugas4_P5;

public class StrukturListTest {
	public static void main(String[] args) {
        
        StrukturList list = new StrukturList();


//        list.addFirst(2);
//        list.addFirst(9);
//        list.addFirst(7);
        
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(5);
        list.addLast(1);

        
        list.display(); // Output: 7 9 2
        
        list.removeTail();
        
        list.display();

        
        list.removeHead();

        
        list.display(); // Output: 9 2

        
//        list.removeHead(); 
//        list.removeHead(); 
//        list.removeHead(); 

        
//        list.display(); 
    }
}
