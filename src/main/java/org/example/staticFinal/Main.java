package org.example.staticFinal;

public class Main {

    public static void main(String[] args) {
        StaticClass class1 = new StaticClass();
        StaticClass class2 = new StaticClass();
        StaticClass class3 = new StaticClass();

        class1.incrementTotalCount();
        class1.incrementInstanceCount();
        class2.incrementTotalCount();
        class2.incrementInstanceCount();
        class2.incrementInstanceCount();
        class3.incrementTotalCount();
        class3.incrementInstanceCount();
        class3.incrementInstanceCount();
        class3.incrementInstanceCount();

        System.out.println(class1);
        System.out.println(class2);
        System.out.println(class3);

    }
}
