// Write a Java Program that creates a generic class that can accept 2 values and perform addition operation on them.

import java.util.Scanner;

class Add<T> {
    private T num1;
    private T num2;

    public Add(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public T get() {
        return this.num1;
    }
    public T get2() {
        return this.num2;
    }

    @SuppressWarnings("unchecked")
    public T add() {
        if (num1 instanceof Integer) {
            return (T) Integer.valueOf(((Integer) num1) + ((Integer) num2));
        } else if (num1 instanceof Double) {
            return (T) Double.valueOf(((Double) num1) + ((Double) num2));
        } else {
            throw new UnsupportedOperationException("Unsupported type");
        }
    }
}

public class pracQues2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        // Integer Type
        Add<Integer> integerAdd = new Add<>(int1, int2);
        System.out.println("Sum of Integers: " + integerAdd.add());

        System.out.println("Enter two doubles:");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();

        // Double Type
        Add<Double> doubleAdd = new Add<>(double1, double2);
        System.out.println("Sum of Doubles: " + doubleAdd.add());
        
        sc.close();

    }
}
