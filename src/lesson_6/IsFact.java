package lesson_6;

public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if(x.isFactor(2,10)) System.out.println("2 - делитель для 20");
        if(x.isFactor(3,10)) System.out.println("этa строка не будет выведена");
    }

}
