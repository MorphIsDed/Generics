/*
Write a generic class called Box<T> that can store any type of object. Your implementation should:

1. Create a generic class Box<T> with:

    - A private field to store an item of type T
    - A method put(T item) to store an item
    - A method get() that returns the stored item
    - A method isEmpty() that returns true if no item is stored

2. Write a test class that demonstrates the Box class working with:
    - A Box<String> storing a string
    - A Box<Integer> storing an integer
    - A Box<Double> storing a double value

3. Print the results to verify that the correct types are stored and retrieved

*/

class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
    public boolean isEmpty() {
        return this.item == null;
    }
}

public class pracQues {
    public static void main(String[] args) {
        
        // String Type
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, World!");
        System.out.println(stringBox.get()); 

        // Integer Type
        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);
        System.out.println(integerBox.get());

        // Double Type
        Box<Double> doubleBox = new Box<>();
        doubleBox.put(3.14);
        System.out.println(doubleBox.get());
    }
}
