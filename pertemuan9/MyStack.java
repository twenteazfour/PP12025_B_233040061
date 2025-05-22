package Tugas_P12;

public class MyStack extends AbstractStack {
	public MyStack(int size) {
		super(size);
	}
	
	   @Override
	    public void push(int data) {
	        if (!isFull()) {
	            stackArray[++top] = data;
	        } else {
	            System.out.println("Stack penuh");
	        }
	    }
	   
	   @Override
	    public int pop() {
	        if (!isEmpty()) {
	            return stackArray[top--];
	        } else {
	            System.out.println("Stack kosong");
	            return -1; // atau bisa throw exception
	        }
	    }

	    @Override
	    public int peek() {
	        if (!isEmpty()) {
	            return stackArray[top];
	        } else {
	            System.out.println("Stack kosong");
	            return -1;
	        }
	    }
	}
