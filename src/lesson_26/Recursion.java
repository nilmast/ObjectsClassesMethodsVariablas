package lesson_26;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Вычисление рекурсивны методом");
        System.out.println("Факториал 3 равен " + f.factR(3));
        System.out.println("Факториал 4 равен " + f.factR(4));
        System.out.println("Факториал 5 равен " + f.factR(5));
        System.out.println();
        System.out.println("Вычисление итеративны методом");
        System.out.println("Факториал 3 равен " + f.factI(3));
        System.out.println("Факториал 4 равен " + f.factI(4));
        System.out.println("Факториал 5 равен " + f.factI(5));
    }
}
