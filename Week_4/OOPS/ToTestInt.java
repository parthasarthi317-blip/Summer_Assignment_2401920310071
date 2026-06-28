package Summer_Assignment_2401920310071.Week_4.OOPS;

interface test {
    int square(int n);
}

class Arithmetic implements test {
    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square = " + obj.square(5));
    }
}
