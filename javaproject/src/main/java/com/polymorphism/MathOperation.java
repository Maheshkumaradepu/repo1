//This is Example of Method Overloading 

package com.polymorphism;

public class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        System.out.println(mo.add(2, 3)); // 5
        System.out.println(mo.add(2.5, 3.5)); // 6.0
        System.out.println(mo.add("Hello ", "World")); // Hello World
    }
}

