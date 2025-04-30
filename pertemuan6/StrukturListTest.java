package Tugas6_P7;

public class StrukturListTest {
public static void main(String[] args) {
        
        StrukturList list = new StrukturList();
//        
//        list.addTail(5);
//        list.addTail(4);
//        list.addTail(6);
//        
//        list.display();
//        
//	      list.addTail(7);
//		  list.addTail(6);
//		  list.addTail(4);
//		  list.addTail(2);
//		  list.addTail(3);
//		  list.display();
//        
			list.addTail(4);
			list.addTail(3);
			list.addTail(7);
			list.addTail(8);
			list.addTail(1);
			list.addTail(9);
			       
			list.display(); 
			list.clear();
			if (list.isEmpty()) {
			System.out.println("List Kosong");
			} else {
			list.display();
	
		  System.out.println("Ukuran list: " + list.size()); // Output: 5
    }     

}
}
