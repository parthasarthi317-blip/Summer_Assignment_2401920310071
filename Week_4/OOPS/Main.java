package Summer_Assignment_2401920310071.Week_4.OOPS;

class Outer {
    void display() {
        System.out.println("Outer Class Display");
    }
    class Inner {
        void display() {
            System.out.println("Inner Class Display");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}
