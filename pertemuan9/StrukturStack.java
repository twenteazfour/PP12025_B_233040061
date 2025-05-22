package Tugas_P11;

public class StrukturStack {
    private int[] array;          
    private int capacity;         
    private int TOP;             
    public final int MIN = -1;    
    
  
    public StrukturStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    // operasi push
    public void push(int data) {
        if (!isFull()) {
            array[++TOP] = data;
        } else {
            System.out.println("Stack penuh");
        }
    }

    // operasi pop
    public int pop() {
        if (!isEmpty()) {
            return array[TOP--];
        } else {
            System.out.println("Stack kosong");
            return MIN;
        }
    }

    public boolean isEmpty() {
        return TOP == MIN;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (!isEmpty()) {
            return array[TOP];
        } else {
            return MIN;
        }
    }

    public int[] getArray() {
        return array;
    }

    public int getTOP() {
        return TOP;
    }
}
