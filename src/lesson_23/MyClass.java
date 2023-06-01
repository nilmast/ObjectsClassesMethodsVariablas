package lesson_23;

public class MyClass {
    int x;

    MyClass() {
        System.out.println("Bнyтpи MyClass().");
        x = 0;
    }

    MyClass(int x) {
        System.out.println("Bнyтpи MyClass(int).");
        this.x = x;
    }

    MyClass(double x) {
        this.x = (int) x;
        System.out.println("Bнyтpи MyClass(double).");
        x = 0;
    }

    MyClass(int x, int j) {
        System.out.println("Bнyтpи MyClass(int, int).");
        this.x = x * j;
    }
}
