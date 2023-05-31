package lesson_11;

public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(0);

        for (count = 1; count < 1000000000; count++){
            ob.generator(count);
        }

    }
}
