package org.example.staticFinal;

public class StaticClass {
    private static int totalCount = 0 ;
    private int instanceCount = 0;


    //Static method
    public static void incrementTotalCount(){
        totalCount++;
    }

    //Instance method
    public void incrementInstanceCount(){
        this.instanceCount++;
    }

    @Override
    public String toString() {
        return "StaticClass{" +
                "totalCount=" + totalCount +
                ", instanceCount=" + instanceCount +
                '}';
    }
}
