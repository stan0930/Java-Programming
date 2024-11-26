package week12.example2;

public class c {
    private boolean x;

    public static void main(String[] args) {
        c object1 = new c();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }

    private int convert() {
        return x ? 1 : -1;
    }
}
