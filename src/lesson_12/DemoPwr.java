package lesson_12;

public class DemoPwr {
    public static void main(String[] args) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);
        System.out.println(x.base + " в степени " + x.exp + " равно " +  x.getPower());
        System.out.println(y.base + " в степени " + y.exp + " равно " +  y.getPower());
        System.out.println(z.base + " в степени " + z.exp + " равно " +  z.getPower());
    }
}
