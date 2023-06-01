package lesson_21;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        int resI;
        double resD;


        System.out.println("\n");
        ob.sum();
        System.out.println();
        ob.sum(2);
        System.out.println();
        resI = ob.sum(4, 6);
        System.out.printf("Результат вызова ob. sum(%d, %d): %d", ob.a, ob.b, resI);
        System.out.println();
        resD = ob.sum(1.1, 2.32);
        System.out.println("Результат вызова ob. sum(l.l, 2.32): " + resD);
    }
}
