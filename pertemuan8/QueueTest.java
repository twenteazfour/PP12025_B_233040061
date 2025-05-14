package Tugas7_P10;

public class QueueTest {
	public static void main(String[] args) {
		StrukturQueue queue = new StrukturQueue();
		
//		System.out.println("### Sebelum Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        
//        queue.enqueue(3);
//        queue.enqueue(6);
//        queue.enqueue(9);
//        
//        System.out.println("\n### Enqueue 3x ###");
//        System.out.println("size: " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        System.out.println("Front: " + queue.front());
        
        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();

        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("\n### Enqueue 4x ###");
        System.out.println("size: " + queue.size());
        System.out.println("isEmpty: " + queue.isEmpty());
        queue.displayElements();
        System.out.println("Front: " + queue.front());
    }
}