package Interfaces;

interface TwoMethods {
    void method1();
    void method2();
}

class PartialClass implements TwoMethods {
    public void method1() {
        System.out.println("Method1 implemented.");
    }
    
    public static void main(String[] args) {
        PartialClass obj = new PartialClass();
        obj.method1();
    }
}

