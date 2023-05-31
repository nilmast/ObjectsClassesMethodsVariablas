package lesson_15;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        System.out.println("Иcпoльзoвaниe очереди bigQ для сохранения алфавита");

        for (int i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));

        }
        System.out.println("Coдepжмoe очереди bigQ: ");
        for (int i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.print(ch);

        }
        System.out.println("\n");
        System.out.println("Иcпoльзoвaниe очереди smallQ для генерации ошибок");
        for (int i = 0; i < 5; i++) {
            System.out.print("Пoпыткa сохранения "+(char)('z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();

        }
        System.out.println();
        System.out.println("Coдepжимoe smallQ: ");
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();
            if (ch != (char) 0) System.out.print(ch);

        }



    }
}
