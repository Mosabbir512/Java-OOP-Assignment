
class Parent {
    void display() {
        System.out.println("This is Parent class");
    }
}

class Child1 extends Parent {
    void show1() {
        System.out.println("This is Child1 class");
    }
}

class Child2 extends Parent {
    void show2() {
        System.out.println("This is Child2 class");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        c1.display();
        c1.show1();

        c2.display();
        c2.show2();
    }
}
