package lesson_28;

public class StaticDemo {
    public static void main(String[] args) {
        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.ID = 111;
        stud2.ID = 222;

        System.out.println("Поля ID объектов stud1 и stud2 независимы!");
        System.out.println("stud1.x: " + stud1.ID + "\nstud2.x: " + stud2.ID);

        System.out.println("Cтaтичecкaя переменная specialtyID - общая для всех объектов класса");

        Student.specialtyID = "1-45 00 02";
        System.out.println("Пpиcвoить Student.specialtyID значение \"1-45 00 02\"");
        System.out.println("SpecialtyID: " + Student.getSpecialtyID());

        Student.specialtyID = "1-88 99 90";
        System.out.println("Пpиcвoить Student.specialtyID значение \"1-88 99 90\"");
        System.out.println("SpecialtyID: " + Student.getSpecialtyID());
    }
}
