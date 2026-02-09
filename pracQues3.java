// Create a stack using generics in java.

import java.util.Scanner;

class Stack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push " + item);
            return;
        }
        stack[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

public class pracQues3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the capacity of the stack:");
        int capacity = sc.nextInt();
        
        Stack<Integer> intStack = new Stack<>(capacity);
        
        System.out.println("Enter integers to push onto the stack (enter -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            intStack.push(num);
        }
        
        System.out.println("Popping elements from the stack:");
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }
        
        sc.close();
    }
}
