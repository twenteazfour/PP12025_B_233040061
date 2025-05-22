package Tugas_P12;

public abstract class AbstractStack {
	protected int[] stackArray;
    protected int top;
    protected int maxSize;

    public AbstractStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int size() {
        return top + 1;
    }

    public abstract void push(int data);
    public abstract int pop();
    public abstract int peek();
}
