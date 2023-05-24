package lesson_5;

public class ParmDemo {
    public static void main(String[] args) {
        CheckNum e = new CheckNum();

        if (e.isEven(10)) System.out.println("10 - четное число");
        if (e.isEven(9)) System.out.println("9 - четное число");
        if (e.isEven(8)) System.out.println("8 - четное число");
    }
}
