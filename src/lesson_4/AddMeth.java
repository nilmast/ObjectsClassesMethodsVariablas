package lesson_4;


public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = sportscar.range();
        range2 = sportscar.range();

        System.out.println("Мини-фypгoн может перевезти " + minivan.passengers + " на расстояние " + range1 + " миль");
        System.out.println("Cпopтивный автомобиль может перевезти " + sportscar.passengers + " на расстояние " + range2 + " миль");



    }
}
