package Tugas_P11;

public class StackTest {
	 public static void main(String[] args) {
	        StrukturStack stack = new StrukturStack(3);
	        
	        System.out.println("#Sebelum push");
	        System.out.println("Size: " + stack.size());
	        System.out.println("Empty: " + stack.isEmpty());
	        System.out.println("Full: " + stack.isFull());
	        System.out.println("Top: " + stack.top());
	        
	        System.out.println("#Melakukan push 3x");
	        System.out.println("push 2; push 4, push 1");
	        stack.push(2);
	        stack.push(4);
	        stack.push(1);
	      
	        System.out.println("Size: " + stack.size());
	        System.out.println("Empty: " + stack.isEmpty());
	        System.out.println("Full: " + stack.isFull());
	        System.out.println("Top: " + stack.top());

	        System.out.print("Elemen from TOP: ");
	        int[] data = stack.getArray();
	        for (int i = stack.getTOP(); i >= 0; i--) {
	            System.out.print(data[i] + " ");
	        }

	        System.out.println("\n\nMelakukan pop");
	        stack.pop();

	        System.out.println("Size setelah pop: " + stack.size());
	        System.out.println("Empty setelah pop: " + stack.isEmpty());
	        System.out.println("Full setelah pop: " + stack.isFull());
	        System.out.println("Top setelah pop: " + stack.top());

	        System.out.print("Elemen from TOP after pop: ");
	        data = stack.getArray();
	        for (int i = stack.getTOP(); i >= 0; i--) {
	        	System.out.print(data[i] + " ");
	        }
	 }
	
}
	
