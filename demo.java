class Gen<T> {
    T obj;

    Gen(T obj) {
        this.obj = obj;
    }

    T getObj() {
        return this.obj;
    }

    void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }
}

public class demo {
    public static void main(String[] args) {
        Gen<Integer> intObj = new Gen<>(42);
        intObj.showType();

        int value = intObj.getObj();
        System.out.println("Value: " + value);
        System.out.println();

        Gen<String> strObj = new Gen<>("Hello, Generics!");
        strObj.showType();

        String str = strObj.getObj();
        System.out.println("Value: " + str);
    }
}
